/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.modelos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author crist
 */
public class AbstractModeloTablaDinosaurio extends AbstractTableModel {

    private ArrayList<Dinosaurio> data;

    public AbstractModeloTablaDinosaurio() {
    }

    public AbstractModeloTablaDinosaurio(ArrayList<Dinosaurio> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";
        switch (columnIndex) {
            case 0:
                columnName = "Nombre:";
                break;
            case 1:
                columnName = "Especie:";
                break;
            case 2:
                columnName = "Peso";
                break;
            case 3:
                columnName = "Tamaño";
                break;
            case 4:
                columnName = "Alimentacion";
                break;
            case 5:
                columnName = "Color:";
                break;
            case 6:
                columnName = "Numero de Patas";
                break;

            default:
                columnName = "ND";
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Float.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            case 6:
                return Integer.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dinosaurio tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getNombre();
            case 1:
                return tmp.getEspecie();
            case 2:
                return tmp.getPeso();
            case 3:
                return tmp.getTamaño();
            case 4:
                return tmp.getAlimentacion();
            case 5:
                return tmp.getColor();
            case 6:
                return tmp.getNumeroDePatas();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Dinosaurio tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                tmp.setNombre((String) aValue);
                break;
            case 1:
                tmp.setEspecie((String) aValue);
                break;
            case 2:
                tmp.setPeso((float) aValue);
                break;
            case 3:
                tmp.setTamaño((String) aValue);
                break;
            case 4:
                tmp.setAlimentacion((String) aValue);
                break;
            case 5:
                tmp.setColor((String) aValue);
                break;
            case 6:
                tmp.setNumeroDePatas((int) aValue);
                break;
            default:
                throw new AssertionError();

        }
        data.set(rowIndex, tmp);
        this.fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    public void agregarDinosaurio(Dinosaurio c){
        data.add(c);
        this.fireTableDataChanged();
    }
    
}

