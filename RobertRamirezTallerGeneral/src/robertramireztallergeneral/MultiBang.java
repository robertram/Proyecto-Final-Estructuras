/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robertramireztallergeneral;

import javax.swing.JOptionPane;


/**
 *
 * @author robertramirez
 */
public class MultiBang {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
            Menu menu = new Menu();
            menu.Menu();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Introduzca una opcion");
        }
        
        
          
    }
}
