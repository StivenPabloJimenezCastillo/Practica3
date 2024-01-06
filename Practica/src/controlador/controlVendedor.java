/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import controlador.TDA.listas.DynamicList;
import modelo.vendedor;
/**
 *
 * @author Steven Jimenez
 */
public class controlVendedor {
    private vendedor vendedor;
    private DynamicList<vendedor> listaVendedores;
    public controlVendedor() {
        this.vendedor = new vendedor();
        this.listaVendedores = new DynamicList<>();
    }

    public vendedor getVendedor() {
        if (vendedor == null) {
            vendedor = new vendedor();
        }
        return vendedor;
    }

    public void setVendedor(vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public DynamicList<vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(DynamicList<vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public Boolean guardar(){
        vendedor.setId(generarId());
        listaVendedores.add(vendedor);
        return true;
    }

    public Integer generarId(){
        return listaVendedores.getLenght() + 1;
    }

    public void imprimir(){
        System.out.println(listaVendedores.toString());
    }

}
