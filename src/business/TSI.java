/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author ianschrauth
 */
public class TSI {
    
    //total for the bill
    public static Double BILL_TOTAL = 0.00;
    
    
        //*************************************************

    //stock
      public static int STOCK_TO_gen ;
                public static int STOCK_TO_WithNovelette ;
                        public static int STOCK_TO_dustJacket ;
                        
//the opportunity, part II and editions
    public static int STOCK_TMS ;
    

    


        //270 and editions
        public static int STOCK_270_paperback ;

    //books without other editions
    public static int STOCK_TSLSMBODH ;
    public static int STOCK_VBAB1 ;
    public static int STOCK_VBAB2 ;
    public static int STOCK_VBAB3 ;
    public static int STOCK_VBAB123 ;
    
    public static int STOCK_CMM1 ;
    public static int STOCK_CMM2 ;


    public static int STOCK_TAW ;
    public static int STOCK_BTV;

    
    //*************************************************


    
    //inventory on hand
    
    //the opportuntiy and editions
    public static int INVENTORY_TO_gen ;
        public static int INVENTORY_TO_bookClub ;
                public static int INVENTORY_TO_WithNovelette ;
                        public static int INVENTORY_TO_dustJacket ;
                        
//the opportunity, part II and editions
    public static int INVENTORY_TMS;


    


        //270 and editions
        public static int INVENTORY_270_paperback ;

    //books without other editions
    public static int INVENTORY_TSLSMBODH ;
    public static int INVENTORY_VBAB1 ;
    public static int INVENTORY_VBAB2 ;
    public static int INVENTORY_VBAB3 ;
    public static int INVENTORY_VBAB123 ;
    
    public static int INVENTORY_CMM1 ;
    public static int INVENTORY_CMM2 ;


    public static int INVENTORY_TAW ;
    public static int INVENTORY_BTV;
    
    
    //*************************************************

    
    //Boolean if book is able to have multiple editions
    
    
    //books that are not released yet must be set to false
        public static Boolean MULTEDT_TO = true; // General paperback (P), Book Club Edition (P), Includes TSLSMBODH (H), Dust jacket (H) 

    public static Boolean MULTEDT_TMS = false; // General paperback (P), Dust jacket (H), Book Club Edition (P)
    public static Boolean MULTEDT_TSLSMBODH = false;
    public static Boolean MULTEDT_VBAB1 = false;
    public static Boolean MULTEDT_VBAB2 = false;
    public static Boolean MULTEDT_VBAB3 = false;
    public static Boolean MULTEDT_VBAB123 = true;
    
    public static Boolean MULTEDT_CMM1 = false;
    public static Boolean MULTEDT_CMM2 = false;

    public static Boolean MULTEDT_TGWTF = true; //general paperback (P), dust jacket (H)
    public static Boolean MULTEDT_TAW = false; 
    public static Boolean MULTEDT_BTV = false;
    public static Boolean MULTEDT_270 = true; //general paperback (P), dust jacket (H)

    
}
