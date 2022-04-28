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
public class checkForOtherEditions {
    
   
        public static Boolean TheOpportuntiy() {
            
            if ((TSI.INVENTORY_TO_dustJacket >= 1) || (TSI.INVENTORY_TO_bookClub >= 1) || (TSI.INVENTORY_TO_WithNovelette >= 1)) {
                return true;
            }else {
                return false;
            }
            
        }
    
            public static Boolean TheOpportuntiyII() {
            
            if ((TSI.INVENTORY_TO2_dustJacket >= 1) || (TSI.INVENTORY_TO2_bookClub >= 1)) {
                return true;
            }else {
                return false;
            }
            
        }
    
            
               public static Boolean TheGirlWithTheFangs() {
            
             
            if (TSI.INVENTORY_TGWTF_hardcover >= 1) {
                return true;
            }else {
                return false;
            }
        }
    
               
               
                  public static Boolean twoseventy() {
            
            if (TSI.INVENTORY_270_hardcover >= 1) {
                return true;
            }else {
                return false;
            }
            
        }
    
    
    
}
