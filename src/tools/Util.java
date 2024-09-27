/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author u07345492109
 */
public class Util {
    
    
    
    public static void mensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    
    public static void habilitar(boolean valor, JComponent ... componentes){
            for (int i = 0; i < componentes.length; i++) {
            JComponent componente = componentes[i];
            componente.setEnabled(valor);
        }     
               
    }
    
     public static boolean perguntar(String msg){
        int resp = JOptionPane.showConfirmDialog(null, msg, "pergunta", JOptionPane.YES_NO_OPTION);
        if( resp == JOptionPane.YES_OPTION){
            return true;
        }else{
            return false;
      
        }
    }
     
      public static void limpar(JComponent...components){
        for(int i = 0; i < components.length; i++){
             JComponent componente = components(i);
             if(componente instanceof JTextField)
           ((JTextField) componente).setText("");
              if(componente instanceof JFormattedTextField)
           ((JFormattedTextField) componente).setText("");
              if(componente instanceof JComboBox)
           ((JComboBox) componente).setSelectedItem(null);
        } 
    }

    private static JComponent components(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void habilitar(boolean b, JTextField jTxtCodigo, JTextField jTxtNome, JTextField jTxtApelido, Object jFmtCpf, JPasswordField jPwfSenha, JComboBox<String> jCboNivel, JCheckBox jChbAtivo, JButton jBtnConfirmar, JButton jBtnCancelar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void limpar(JTextField jTxtCodigo, JTextField jTxtNome, JTextField jTxtApelido, Object jFmtCpf, JPasswordField jPwfSenha, JComboBox<String> jCboNivel, JCheckBox jChbAtivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
            
                
    
