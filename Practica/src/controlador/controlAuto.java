/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.auto;
import controlador.TDA.listas.DynamicList;
/**
 *
 * @author Steven Jimenez
 */
public class controlAuto {
    private auto Auto;
    private DynamicList<auto> listaAutos;
    public controlAuto() {
        this.Auto = new auto();
        this.listaAutos = new DynamicList<>();
    }

    public auto getAuto() {
        if (Auto == null) {
            Auto = new auto();
        }
        return Auto;
    }

    public void setAuto(auto Auto) {
        this.Auto = Auto;
    }

    public DynamicList<auto> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(DynamicList<auto> listaAutos) {
        this.listaAutos = listaAutos;
    }

    public Boolean guardarA(){
        Auto.setId(generarId());
        listaAutos.add(Auto);
        return true;
    }
    public Integer generarId(){
        return listaAutos.getLenght() + 1;
    }
}
