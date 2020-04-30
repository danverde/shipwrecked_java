/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ModelLayer.Food;
import ModelLayer.Item;
import ModelLayer.Scene;
import shipwreck.Shipwreck;

/**
 *
 * @author Jack
 */
public class CollectResourceView extends View {

    public CollectResourceView() {
        super("\n This area contains "
                + Shipwreck.getCurrentGame().getPlayer().getCharacter().getLocation().getScene().getResourceAmount()
                + " "
                + Shipwreck.getCurrentGame().getPlayer().getCharacter().getLocation().getScene().getResourceType()
                + "."
                + "\n How many would you like?");
    }

    @Override
    public boolean doAction(String sDesiredAmount) {
        Scene scene = Shipwreck.getCurrentGame().getPlayer().getCharacter().getLocation().getScene();
        Food[] foodList = Shipwreck.getCurrentGame().getFoodList();
        Item[] itemList = Shipwreck.getCurrentGame().getItems();       
        String resourceType = scene.getResourceType();
        
        int resourceAmount = scene.getResourceAmount();
        int currentAmount = 0;
        int desiredAmount = 0;
        desiredAmount = Integer.parseInt(sDesiredAmount);

        if (desiredAmount > resourceAmount) {
            this.console.println("We're sorry, there isn't that much "
                    + scene.getResourceType() + " left.");
            return false;
        } else {
            scene.setResourceAmount(resourceAmount - desiredAmount);
            switch (resourceType){
                case "Meat":
                    currentAmount = foodList[0].getQuantiy();
                    foodList[0].setQuantiy(desiredAmount + currentAmount);
                    break;
                case "Fruit":
                    currentAmount = foodList[1].getQuantiy();
                    foodList[1].setQuantiy(desiredAmount + currentAmount);
                    break;
                case "Fish":
                    currentAmount = foodList[3].getQuantiy();
                    foodList[2].setQuantiy(desiredAmount + currentAmount);
                    break;
                case "Wood":
                    currentAmount = itemList[0].getQuantity();
                    itemList[0].setQuantity(desiredAmount + currentAmount);
                    break;
                case "Vine":
                    currentAmount = itemList[2].getQuantity();
                    itemList[2].setQuantity(desiredAmount + currentAmount);
                    break;
                case "Stone":
                    currentAmount = itemList[3].getQuantity();
                    itemList[3].setQuantity(desiredAmount + currentAmount);
                    break;
            } 
            
        }
        this.console.println(desiredAmount
                + " "
                + scene.getResourceType()
                + " added.");
        return true;
    }

//    private void addTime() {
//    this.console.println("\n*** addTime function called ***");
//    }
    private void addFish(String type) {

    }

    private void addItem() {
        this.console.println("\n*** addItem function called ***");
    }

    private void addStone(String v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addWood(String w) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addFruit(String f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
