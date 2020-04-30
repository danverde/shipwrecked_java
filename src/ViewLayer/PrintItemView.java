/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ModelLayer.Item;
import java.io.IOException;
import java.io.PrintWriter;
import shipwreck.Shipwreck;

public class PrintItemView extends View {

    public PrintItemView() {
        super("\n*** Enter the filename for the Item list. ***");
    }

    @Override
    public boolean doAction(String filePath) {
        Item[] itemList = Shipwreck.getCurrentGame().getItems();

        try (PrintWriter out = new PrintWriter(filePath)) {
            out.println("\n          *** Inventory Report ***");
            out.printf("%n%-10s%-15s", "Description", "Quantity");
            out.printf("%n%-10s%-5s", "-----------", "--------");

            for (Item item : itemList) {
                out.printf("%n%-10s%-5d", item.getItemType(), item.getQuantity());
            }
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
        return true;
    }
}
