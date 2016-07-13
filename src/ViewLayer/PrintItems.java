/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ModelLayer.Scene;
import java.io.PrintWriter;
import static java.lang.System.out;
import shipwreck.Shipwreck;

public class PrintItems{
    
    private static final PrintWriter itemsFile = Shipwreck.getItemsFile();
    
    public static void displayItems(String itemType, int quantity){
    this.console.println();
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
