/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ControlLayer.MapControl;
import ModelLayer.Game;
import ModelLayer.Item;
import ModelLayer.Map;
import shipwreck.Shipwreck;

/**
 *
 * @author Jack
 */
public class GamePlayMenuView extends View{
    
    
    public GamePlayMenuView(){
        super      ("\n"
                  + "\n----------------------------------" 
                  + "\n| Game Menu"
                  + "\n----------------------------------"
                  + "\nR - View Inventory"
                  + "\nF - Hunt for Food"
                  + "\nM - View Map / Current Location"
                  + "\nL - Move to Different Location"
                  + "\nB - Build Survival Item"
                  + "\nW - Predict Weather"
                  + "\nE - Explore Area"
                  + "\nD - Deploy Raft"
                  + "\nF - Check Signal Fire"
                  + "\nT - Check Elapsed Time"
                  + "\nC - Check Status of Character"
                  + "\nO - Main Menu"
                  + "\nH - Help Menu"
                  + "\nS - Save Game"
                  + "\nQ - Quit Game"
                  + "\n----------------------------------");
}
    
    
    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        switch (menuOption){
            case "R":
                this.viewInventory();
                break;
            case "X":
                this.huntFood();
                break;
            case "M":
                this.viewMap();
                break;
            case "L":
                this.moveMenu();
                break;
            case "B":
                this.buildMenu();
                break;
            case "W":
                this.weatherMenu();
                break;
            case "E":
                this.exploreMenu();
                break;
            case "D":
                this.raftMenu();
                break;
            case "F":
                this.fireMenu();
                break;
            case "T":
                this.timeMenu();
                break;
            case "C":
                this.characterMenu();
                break;
            case "H":
                this.openHelpMenu();
                break;
            case "S":
                this.saveMenu();
                break;
            case "O":
                return true;
            default:
                System.out.println("\n*** Recheck your keys & enter a valid letter ***");
                break;
        }
        return true;
    }
        
      private void openHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void viewInventory() {
        CollectResourceView CollectFoodView = new CollectResourceView();
        CollectFoodView.display();
        
        StringBuilder line;
        
        Game game = Shipwreck.getCurrentGame();
        Item[] inventory = game.getItem();
        
        System.out.println("\nLIST OF INVENTORY ITEMS.");
        line = new StringBuilder("                                        ");
        line.insert(0,"DESCRIPTION");
        line.insert(20,"IN STOCK");
        System.out.println(line.toString());
        
        for (Item item: inventory){
            line = new StringBuilder("                            ");
            line.insert(0, item.getItemType());
            line.insert(23, item.getQuantity());
        }
        System.out.println(line.toString());
            
    }

    private void huntFood(){
        System.out.println("\n*** huntFood function called ***");    
    }
    
    private long viewMap() {
        Game game = Shipwreck.getCurrentGame();
        MapControl mapControl = new MapControl();
        for (int i = 0; i < MapControl.length; i++);
            for (int j = 0; j< MapControl[i].length; j++);
            if (location.setVisited = false){
                System.out.println(" ?? ");
            }
            System.out.println(MapControl.DisplaySymbol);
        
    }

    private void moveMenu() {
        MoveLocationView moveLocation = new MoveLocationView();
        moveLocation.display();
    }

    private void buildMenu() {
        System.out.println("\n*** buildMenu function called ***");
    }

    private void weatherMenu() {
        System.out.println("\n*** weatherMenu function called ***");
    }

    private void exploreMenu() {
        System.out.println("\n*** exploreMenu function called ***");
    }

    private void raftMenu() {
        System.out.println("\n*** raftMenu function called ***");
    }

    private void fireMenu() {
        SignalFireView signalFireView = new SignalFireView();
        signalFireView.display();
    }

    private void timeMenu() {
        System.out.println("\n*** timeMenu function called ***");
    }

    private void characterMenu() {
        System.out.println("\n*** CharacterMenu function called ***");
    }

    private void saveMenu() {
        System.out.println("\n*** saveGame function called ***");
    }

    void displayGamePlayMenu() {
        System.out.println("\n*** GamePlayMenu function called ***");
    }
    
    

}
