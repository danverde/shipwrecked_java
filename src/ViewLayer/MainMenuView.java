/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ControlLayer.GameControl;
import java.util.Scanner;
import shipwreck.Shipwreck;

/**
 *
 * @author Daniel
 */
public class MainMenuView {

    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n----------------------------------" 
                  + "\n| Main Menu"
                  + "\n----------------------------------"
                  + "\nN - New Game"
                  + "\nS - Save Game"
                  + "\nC - Continue Game"
                  + "\nD - End it all (Exit Game)"
                  + "\nH - Help Menu"
                  + "\n----------------------------------";
}

    
    void displayMainMenuView() {
        boolean done = false;
        do{
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("D")){
                return;
            }
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        Boolean valid = false;
        
        while (!valid){
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1){
                System.out.println("\nInvald value: value cannot be blank");
                continue;
            }
            break;
            }
        return value;
    }

    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        switch (menuOption){
            case "N":
                this.startNewGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "C":
                this.continueGame();
                break;
            case "D":
                this.exitGame();
                break;
            case "H":
                this.openHelpMenu();
                break;
            default:
                System.out.println("\n*** Recheck your keys & enter a valid letter ***");
                break;
        }
        return true;
    }

    private void startNewGame() {
        GameControl.createNewGame(Shipwreck.getPlayer());
        
        GamePlayMenuView gamePlayMenuView = new GamePlayMenuView();
        gamePlayMenuView.displayGameMenu();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }

    private void continueGame() {
        System.out.println("\n*** continueGame function called ***");
    }

    private void exitGame() {
        System.out.println("\n*** exitGame function called ***");
    }

    private void openHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenu();
    }
    
}
