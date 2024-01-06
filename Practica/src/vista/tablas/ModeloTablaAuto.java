/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.tablas;

import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import javax.swing.table.AbstractTableModel;
import modelo.auto;


/**
 *
 * @author Steven Jimenez
 */
public class ModeloTablaAuto extends AbstractTableModel{
        private DynamicList<auto> Auto;
    
    @Override
     public int getRowCount() {
        return Auto.getLenght();
    }
    
    @Override
    public int getColumnCount() {
        return 5;
    }
    
     @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            auto p = Auto.getInfo(rowIndex);
            switch (columnIndex) {
                case 0:
                    return (p != null) ? p.getPlaca(): " ";
                case 1:
                    return (p != null) ? p.getMarca(): " ";
                case 2:
                    return (p != null) ? p.getModelo(): "";
                case 3:
                    return (p != null) ? p.getColor(): "";
                case 4:
                    return (p != null) ? p.getPrecio(): "";
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
                return "PLACA";
            case 1:
                return "MARCA";
            case 2:
                return "MODELO";
            case 3:
                return "COLOR";
            case 4:
                return "PRECIO";
            default:
                return null;
        }
    }

    public DynamicList<auto> getAuto() {
        return getAuto();
    }

    public void setAuto(DynamicList<auto> Auto) {
        this.Auto = Auto;
    }
}
