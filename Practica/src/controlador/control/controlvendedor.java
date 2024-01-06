package controlador.control;
import controlador.DAO.DaoImplement;
import controlador.TDA.listas.DynamicList;
import controlador.validar.ValidarCedula;
import java.lang.reflect.Field;
import modelo.vendedor;


public class controlvendedor extends DaoImplement<vendedor> {
    private DynamicList<vendedor> vendedor;
    private vendedor vendedor1;
    
    public controlvendedor(){
        super(vendedor.class);
    }

    public DynamicList<vendedor> getVendedor() {
        vendedor = all();
        return vendedor;
    }

    public void setVendedor(DynamicList<vendedor> vendedor) {
        this.vendedor = vendedor;
    }

    public vendedor getVendedor1() {
        if (vendedor1 == null) {
            vendedor1 = new vendedor();
        }
        return vendedor1;
    }

    public void setVendedor1(vendedor vendedor1) {
        this.vendedor1 = vendedor1;
    }

    public Boolean persist(){
        vendedor1.setId(all().getLenght()+1);
        return persist(vendedor1);
    }
     public DynamicList<vendedor> ordenarQuickSort(DynamicList<vendedor> lista, Integer tipo, String field) throws Exception {
        Field attribute = ValidarCedula.getField(vendedor.class, field);
        Integer s = lista.getLenght();
        vendedor[] vendedores = lista.toArray();

        if (attribute != null) {
            int iteraciones = quickSort(vendedores, tipo, field, 0, vendedores.length - 1);
            System.out.println("Iteraciones: " + iteraciones);
        } else {
            throw new Exception("No existe el atributo: " + field);
        }

        return lista.toList(vendedores);
    }

    private int quickSort(vendedor[] vendedores, Integer tipo, String field, int izq, int der) {
        int iteraciones = 0; 

        if (izq < der) {
            int i = izq;
            int j = der;
            vendedor pivote = vendedores[(izq + der) / 2];

            while (i <= j) {
                while (vendedores[i].comparar(pivote, field, tipo) < 0) {
                    i++;
                    iteraciones++;
                }

                while (vendedores[j].comparar(pivote, field, tipo) > 0) {
                    j--;
                    iteraciones++;
                }

                if (i <= j) {
                    vendedor temp = vendedores[i];
                    vendedores[i] = vendedores[j];
                    vendedores[j] = temp;
                    i++;
                    j--;
                }
            }

            iteraciones += quickSort(vendedores, tipo, field, izq, j);
            iteraciones += quickSort(vendedores, tipo, field, i, der);
        }
        return iteraciones;
    }


    public DynamicList<vendedor> ordenarShellSort(DynamicList<vendedor> lista, Integer tipo, String field) throws Exception {
        Field attribute = ValidarCedula.getField(vendedor.class, field);
        Integer n = lista.getLenght();
        vendedor[] vendedores = lista.toArray();

        if (attribute != null) {
            int iteraciones = shellSort(vendedores, tipo, field);
            System.out.println("Iteraciones: " + iteraciones);
        } else {
            throw new Exception("No existe el atributo: " + field);
        }

        return lista.toList(vendedores);
    }

    private int shellSort(vendedor[] vendedores, Integer tipo, String field) {
        int n = vendedores.length;
        int gap = 1;
        while (gap < n / 3) {
            gap = 3 * gap + 1;
        }

        int iteraciones = 0;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                vendedor temp = vendedores[i];
                int j = i;
                while (j >= gap && vendedores[j - gap].comparar(temp, field, tipo) > 0) {
                    vendedores[j] = vendedores[j - gap];
                    j -= gap;
                    iteraciones++;
                }
                vendedores[j] = temp;
            }
            gap /= 3;
        }

        return iteraciones;
    }  
}
