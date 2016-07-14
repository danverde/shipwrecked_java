/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ModelLayer.Item;
import ModelLayer.Scene;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import shipwreck.Shipwreck;

public class PrintItems {

    private static final PrintWriter itemsFile = Shipwreck.getItemsFile();

    public static void printItems() {
//        System.out.println("PrintItems called");
        
        Item[] itemList = Shipwreck.getCurrentGame().getItems();
        String outputLocation = "itemsFile";

        try (PrintWriter out = new PrintWriter(outputLocation)) {
            out.println("\n          *** Inventory Report ***");
            out.printf("%n%-10s%-5s", "Description", "Quantity");
            out.printf("%n%-10s%-5s", "-----------", "--------");

            for (Item item : itemList) {
                out.printf("%n%-10s%-5d", item.getItemType(), item.getQuantity());
            }
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
}
