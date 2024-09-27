/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.util.List;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author luang
 */
   public class UsuariosController extends AbstractTableModel {

    
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        
        this.fireTableDataChanged();
    }
   
    public Usuarios getBean(int row) {
        return (Usuarios) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Usuarios usuarios = (Usuarios) lista.get(row);
        if (column == 0) {
           return usuarios.idusuariosLgo();
        } 
        if (column == 1) {
           return usuarios.nomeLgo();
        } 
        if (column == 2) {
           return usuarios.getApelidoLgo();
        } 
         
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Apelido";
        }
        if (column == 3) {
            return "Cpf";
        }
        return "";
    }
    
}
