/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.tablas;

import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import javax.swing.table.AbstractTableModel;
import modelo.vendedor;
/**
 *
 * @author Steven Jimenez
 */
public class ModeloTablaRegistrarVendedor extends AbstractTableModel{
    private DynamicList<vendedor> vendedor;
    
    @Override
     public int getRowCount() {
        return vendedor.getLenght();
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }
    
     @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            vendedor p = vendedor.getInfo(rowIndex);
            switch (columnIndex) {
                case 0:
                    return (p != null) ? p.getCedula() : " ";
                case 1:
                    return (p != null) ? p.getNombre() + " " + p.getApellido() : "";
                case 2:
                    return (p != null) ? p.getNumero(): "";
                case 3:
                    return (p != null) ? p.getCorreo(): "";
                default:
                    return null;
            }
        } catch (EmptyException ex) {
            return null;
        }
    }
   

    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "DNI";
            case 1:
                return "USUARIO";
            case 2:
                return "TELEFONO";
            case 3:
                return "CORREO";
            default:
                return null;
        }
    }

    public DynamicList<vendedor> getVendedor() {
        return getVendedor();
    }

    public void setPersonas(DynamicList<vendedor> Vendedor) {
        this.vendedor = Vendedor;
    }

}