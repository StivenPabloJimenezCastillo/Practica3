/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.control;
import controlador.DAO.DaoImplement;
import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import modelo.auto;
import java.lang.reflect.Field;
import controlador.validar.ValidarCedula;

/**
 *
 * @author Steven Jimenez
 */
public class controlauto extends DaoImplement<auto> {
    private  auto Auto1;
    private DynamicList<auto> Autos;
    public controlauto(){
        super(auto.class);
    }

    public DynamicList<auto> getAutos() {
        Autos = all();
        return Autos;
    }
    public auto getAuto1() {
        if (Auto1 == null) {
            Auto1 = new auto();
        }
        return Auto1;
    }

    public void setVendedor1(auto Auto1) {
        this.Auto1 = Auto1;
    }

    public Boolean persist(){
        Auto1.setId(all().getLenght()+1);
        return persist(Auto1);
    }
     public DynamicList<auto> ordenarQuickSort(DynamicList<auto> lista, Integer tipo, String field) throws Exception {
        Field attribute = ValidarCedula.getField(auto.class, field);
        Integer n = lista.getLenght();
        auto[] Autos = lista.toArray();

        if (attribute != null) {
            int iteraciones = quickSort(Autos, tipo, field, 0, Autos.length - 1);
            System.out.println("Iteraciones: " + iteraciones);
        } else {
            throw new Exception("No existe el atributo: " + field);
        }

        return lista.toList(Autos);
    }

    private int quickSort(auto[] Autos, Integer tipo, String field, int izq, int der) {
        int iteraciones = 0; 

        if (izq < der) {
            int i = izq;
            int j = der;
            auto pivote = Autos[(izq + der) / 2];

            while (i <= j) {
                while (Autos[i].comparar(pivote, field, tipo) < 0) {
                    i++;
                    iteraciones++;
                }

                while (Autos[j].comparar(pivote, field, tipo) > 0) {
                    j--;
                    iteraciones++;
                }

                if (i <= j) {
                    auto temp = Autos[i];
                    Autos[i] = Autos[j];
                    Autos[j] = temp;
                    i++;
                    j--;
                }
            }

            iteraciones += quickSort(Autos, tipo, field, izq, j);
            iteraciones += quickSort(Autos, tipo, field, i, der);
        }

        return iteraciones;
    }


    public DynamicList<auto> ordenarShellSort(DynamicList<auto> lista, Integer tipo, String field) throws Exception {
        Field attribute = ValidarCedula.getField(auto.class, field);
        Integer n = lista.getLenght();
        auto[] vendedores = lista.toArray();

        if (attribute != null) {
            int iteraciones = shellSort(vendedores, tipo, field);
            System.out.println("Iteraciones: " + iteraciones);
        } else {
            throw new Exception("No existe el atributo: " + field);
        }

        return lista.toList(vendedores);
    }

    private int shellSort(auto[] Autos, Integer tipo, String field) {
        int n = Autos.length;
        int gap = 1;
        while (gap < n / 3) {
            gap = 3 * gap + 1;
        }

        int iteraciones = 0;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                auto temp = Autos[i];
                int j = i;
                while (j >= gap && Autos[j - gap].comparar(temp, field, tipo) > 0) {
                    Autos[j] = Autos[j - gap];
                    j -= gap;
                    iteraciones++;
                }
                Autos[j] = temp;
            }
            gap /= 3;
        }

        return iteraciones;
    }  

}
