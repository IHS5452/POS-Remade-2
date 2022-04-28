/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilites;

import business.TSI;

/**
 *
 * @author ianschrauth
 */
public class format {
    
    public static void masterprice(double masterprice) {
      Double price4 = Math.round(masterprice * 100.0) / 100.0;
            TSI.BILL_TOTAL = price4;
    }
    
    
    public static Double formatedPrice(double masterprice) {
        Double price4 = Math.round(masterprice * 100.0) / 100.0;
        return price4;
    }
    
    
    
}
