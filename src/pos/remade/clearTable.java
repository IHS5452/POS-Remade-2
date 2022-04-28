/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.remade;

import javax.swing.table.DefaultTableModel;
import static pos.remade.POSScreenUser.table;

/**
 *
 * @author ian schrauth
 */
public class clearTable {
    POSScreenUser pos = new POSScreenUser();
    
    public clearTable() {
     DefaultTableModel model = new DefaultTableModel();
 model.setRowCount(0);
          model.fireTableDataChanged();
                                    pos.table.repaint();
}
}
