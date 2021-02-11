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
public class addToBillHelper {
//price3 is master price
    public void addToTable(DefaultTableModel model, String bookAbreviation, double priceOfBook, JLabel price) {
       
                for (int i = 0; i < 1; i++) {

        Object[] row = {bookAbreviation, priceOfBook};
        
        TSI.BILL_TOTAL += priceOfBook;

        model.addRow(row);
        model.fireTableDataChanged();

       format.masterprice(TSI.BILL_TOTAL);

        price.setText(Double.toString(TSI.BILL_TOTAL));
        System.out.println(Double.toString(TSI.BILL_TOTAL));   
                  
    
    }
    }
   

    
    

    
    
    
}

