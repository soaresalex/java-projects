/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogbox;

import javax.swing.JOptionPane;
/**
 *
 * @author alex
 */
public class Dialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // prompt user to enter name
        String name = JOptionPane.showInputDialog("What is your name?");
        
        // create the message
        String message = String.format("Welcome, %s, to Java Programming!", name);
        
        // display a dialog with a message
        JOptionPane.showMessageDialog(null, message);
    }
    
}
