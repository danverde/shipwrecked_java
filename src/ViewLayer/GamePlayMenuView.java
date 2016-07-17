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
import ModelLayer.Player;
import ModelLayer.Scene;
import shipwreck.Shipwreck;

/**
 *
 * @author Jack
 */
public class GamePlayMenuView extends View {

    public GamePlayMenuView() {
        super("\n"
                + "\n----------------------------------"
                + "\n| Game Menu"
                + "\n----------------------------------"
                + "\nR - View Resources"
                + "\nJ - View Food"
                + "\nQ - Gather Resources"
                + "\nM - View Map / Current Location"
                + "\nL - Move to Different Location"
                + "\nB - Build Survival Item"
                + "\nE - Explore Area"
                + "\nD - Deploy Raft"
                + "\nF - Check Signal Fire"
                + "\nC - Check Status of Character"
                + "\nO - Main Menu"
                + "\nH - Help Menu"
                + "\nS - Save Game"
                + "\nX - Quit Game"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        switch (menuOption) {
            case "R":
                this.viewInventory();
                break;
            case "J":
                this.viewFood();
                break;
            case "Q":
                this.getResources();
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
            case "E":
                this.exploreArea();
                break;
            case "D":
                this.raftMenu();
                break;
            case "F":
                this.fireMenu();
                break;
            case "C":
                this.characterStatus();
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
                ErrorView.display(this.getClass().getName(), "\n*** Recheck your keys & enter a valid letter ***");
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
        line.insert(0, "DESCRIPTION");
        line.insert(20, "IN STOCK");
        this.console.println(line.toString());

        for (Item item : inventory) {
            line = new StringBuilder("                            ");
            line.insert(0, item.getItemType());
            line.insert(23, item.getQuantity());
            this.console.println(line.toString());
        }
    }

    private void viewFood() {
        StringBuilder line;

        Game game = Shipwreck.getCurrentGame();
        Food[] foods = game.getFoodList();

        this.console.println("\nLIST OF FOOD ITEMS.");
        line = new StringBuilder("                                        ");
        line.insert(0, "DESCRIPTION");
        line.insert(17, "IN STOCK");
        line.insert(30, "LEVEL OF DELICIOUSNESS");
        this.console.println(line.toString());

        for (Food food : foods) {
            line = new StringBuilder("                            ");
            line.insert(0, food.getFoodType());
            line.insert(20, food.getQuantiy());
            line.insert(33, food.getHungerFilled());
            this.console.println(line.toString());
        }
    }

    private void getResources() {
        CollectResourceView collectResources = new CollectResourceView();
        collectResources.display();
    }

    public long viewMap() {

        Location[][] locations = Shipwreck.getCurrentGame().getMap().getLocations();

        this.console.println("Shipwreck Map");

        this.console.println("     0      1      2      3      4");
        int rowNum = 0;
        // FOR every row in map
        for (Location[] rowLocation : locations) {
            // PRINT a row divider
            this.console.println("  -----------------------------------");
            this.console.print(rowNum);
            rowNum++;
            // PRINT the row number on a new line
            // FOR every column in row
            for (Location columnLocation : rowLocation) {
                // PRINT a column divider
                this.console.print(" | ");

                // location = locations[row][column]
                // IF location has been visited
                if (!columnLocation.getCharacters().isEmpty()) {
                    this.console.print(" ** ");
                } else if (columnLocation.isVisited() == true) {
                    String displaySymbol = columnLocation.getScene().getDisplaySymbol();
                    this.console.print(displaySymbol);
                } // PRINT the mapSymbol in the scene in this location
                else {
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

    private void exploreArea() {
        Scene scene = Shipwreck.getCurrentGame().getPlayer().getCharacter().getLocation().getScene();
        switch (scene.getDescription()) {
            case "Beach":
                this.console.println("Welcome to the Beach!"
                        + "\nThis looks like a good plae to build a fire.");
                break;
            case "Stone":
                this.console.println("This Looks like a good place to gather stone...");
                break;
            case "Town":
                this.console.println("A TOWN!!!! You found civilization!!!");
                break;
            case "Forest":
                this.console.println("A dense forest."
                        + "\nPlentny of wood, vines, and fruit - But there may be enemies nearby");
                break;
            case "Camp":
                this.console.println("Camp. Home sweet home."
                        + "\nCome here if you'd like to build something.");
                break;
            case "Enemy":
                this.console.println("A wild enemy has appreared in the bushes!!!");
                break;
        }
    }

    private void raftMenu() {
        RaftView raftView = new RaftView();
        raftView.display();
    }

    private void fireMenu() {
        SignalFireView signalFireView = new SignalFireView();
        signalFireView.display();
    }

    private void characterStatus() {
        ModelLayer.Character character = Shipwreck.getCurrentGame().getPlayer().getCharacter();
        this.console.println("**** Character Status ****");
        this.console.println("Name: " + character.getName());
        this.console.println("Health: " + character.getHealth());
        this.console.println("Hunger: " + character.getHunger());
        this.console.println("Location: " + character.getLocation().getRow()
                + "," + character.getLocation().getColumn());
        this.console.println("**************************");
    }

    private void saveMenu() {
        this.console.println("\n*** Error! You must exit the game first! Press X and then try again! ***");
    }

    void displayGamePlayMenu() {
        this.console.println("\n*** GamePlayMenu function called ***");
    }

}
