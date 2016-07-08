/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ControlLayer.GameControl;
import ControlLayer.GameControl.FoodStuff;
import static ControlLayer.GameControl.sumList;
import ControlLayer.MapControl;
import ModelLayer.Food;
import ModelLayer.Game;
import ModelLayer.Item;
import ModelLayer.Location;
import ModelLayer.Map;
import ModelLayer.Scene;
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
                  + "\nR - View Resources"
                  + "\nJ - View Food"
                  + "\nX - Hunt for Food"
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
            case "J":
                this.viewFood();
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
                ErrorView.display(this.getClass().getName(),"\n*** Recheck your keys & enter a valid letter ***");
                break;
        }
        return false;
    }
        
      private void openHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void viewInventory() {      
        StringBuilder line;
        
        Game game = Shipwreck.getCurrentGame();
        Item[] inventory = game.getItems();
        inventory = GameControl.sortList(inventory);
        
        this.console.println("\nLIST OF INVENTORY ITEMS.");
        line = new StringBuilder("                                        ");
        line.insert(0,"DESCRIPTION");
        line.insert(20,"IN STOCK");
        this.console.println(line.toString());
        
        for (Item item: inventory){
            line = new StringBuilder("                            ");
            line.insert(0, item.getItemType());
            line.insert(23, item.getQuantity());
            this.console.println(line.toString());
        }   
    }
    
    private void viewFood() {
        StringBuilder line;
        
        Game game = Shipwreck.getCurrentGame();
        Food[] foods = game.getFoodStuff();
        
        this.console.println("\nLIST OF FOOD ITEMS.");
        line = new StringBuilder("                                        ");
        line.insert(0,"DESCRIPTION");
        line.insert(17,"IN STOCK");
        line.insert(30,"LEVEL OF DELICIOUSNESS");
        this.console.println(line.toString());
        
        for (Food food: foods){
            line = new StringBuilder("                            ");
            line.insert(0, food.getFoodType());
            line.insert(20, food.getQuanitiy());
            line.insert(33, food.getHungerFilled());
            this.console.println(line.toString());
        }
        this.console.println(GameControl.sumList(foods));
    }

    private void huntFood(){
        this.console.println("\n*** huntFood function called ***");    
    }

    public long viewMap() {
   
    Location[][] locations = Shipwreck.getCurrentGame().getMap().getLocations();
    
    this.console.println("Shipwreck Map");
    
    this.console.println("     0      1      2      3      4");
    int rowNum = 0;
    // FOR every row in map
    for (Location[] rowLocation: locations){
        // PRINT a row divider
        this.console.println("  -----------------------------------");
        this.console.print(rowNum);
        rowNum++;
        // PRINT the row number on a new line
        // FOR every column in row
        for (Location columnLocation: rowLocation){
            // PRINT a column divider
            this.console.print(" | ");
            
            // location = locations[row][column]
            // IF location has been visited
            if (columnLocation.isVisited() == true){
                String displaySymbol = columnLocation.getScene().getDisplaySymbol();
                this.console.println(displaySymbol);
            }
            // PRINT the mapSymbol in the scene in this location
            else{
                // DISPLAY " ?? "
                this.console.print(" ?? ");
            }
        }
        // PRINT the ending column divider
    this.console.println("|");
    }
    // PRINT ending row divider 
    this.console.println("  -----------------------------------");   
    return 0;
}    

    
    private void moveMenu() {
        MoveLocationView moveLocation = new MoveLocationView();
        moveLocation.display();
    }

    private void buildMenu() {
        this.console.println("\n*** buildMenu function called ***");
    }

    private void weatherMenu() {
        this.console.println("\n*** weatherMenu function called ***");
    }

    private void exploreMenu() {
        this.console.println("\n*** exploreMenu function called ***");
    }

    private void raftMenu() {
        RaftView raftView = new RaftView();
        raftView.display();
    }

    private void fireMenu() {
        SignalFireView signalFireView = new SignalFireView();
        signalFireView.display();
    }

    private void timeMenu() {
        this.console.println("\n*** timeMenu function called ***");
    }

    private void characterMenu() {
        this.console.println("\n*** CharacterMenu function called ***");
    }

    private void saveMenu() {
        this.console.println("\n*** saveGame function called ***");
    }

    void displayGamePlayMenu() {
        this.console.println("\n*** GamePlayMenu function called ***");
    }


    
    

}
