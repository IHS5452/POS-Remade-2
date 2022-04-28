 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import utilites.format;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ianschrauth
 */
public class deleteHelper {

    public static void delete(DefaultTableModel model, int numRows2, int row, double priceToRemove, double masterPrice, int CopiesOfbooksSold, int stockAmmt, JButton button, JLabel priceLabel) {


            
            masterPrice -= priceToRemove;
           format.masterprice(masterPrice);
            System.out.println(format.formatedPrice(masterPrice) + " is the price");
            
            
            
            if (masterPrice <= 0) {
                            priceLabel.setText(Double.toString(0.00));

            }else {
                          priceLabel.setText(Double.toString(format.formatedPrice(masterPrice)));
  
            }

      
        
            --CopiesOfbooksSold;
            ++stockAmmt;
            if (button == null) {
                System.out.println("Button is null");
            }else {
            button.setEnabled(true);
                
            }

      model.removeRow(row);
        model.fireTableDataChanged();
    }
    
   
    
    
}
