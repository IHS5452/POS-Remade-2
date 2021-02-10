/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.awt.Button;
import javax.swing.JButton;

/**
 *
 * @author ianschrauth
 */
public class checkForStockHelper {

    public static void checkForStock(int stock, JButton button) {
 if (stock < 0) {
            button.setEnabled(false);
        } else if (stock > 0) {
            button.setEnabled(true);
        }    
    
    }
  
    
}
