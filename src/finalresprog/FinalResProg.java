/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalresprog;

import javax.swing.UIManager;

/**
 *
 * @author Chupapi
 */
public class FinalResProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          try{
UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
          }catch (Exception ee) {
System.out.println(ee);
}
 LOGIN loginFrame = new LOGIN();
    
    // Set the login frame visible
    loginFrame.setVisible(true);
}
}