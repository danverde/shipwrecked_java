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
public class MainMenuView extends View {
    
    public MainMenuView() {
              super("\n"
                  + "\n----------------------------------" 
                  + "\n| Main Menu"
                  + "\n----------------------------------"
                  + "\nN - New Game"
                  + "\nS - Save Game"
                  + "\nC - Continue Game"
                  + "\nX - End it all (Exit Game)"
                  + "\nH - Help Menu"
                  + "\n----------------------------------");
}

    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        switch (menuOption){
            case "N":
                this.startNewGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "X":
                this.continueGame();
                break;
            case "E":
                this.exitGame();
                break;
            case "H":
                this.openHelpMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Recheck your keys & enter a valid letter ***");
                break;
        }
        return true;
    }

    private void startNewGame() {
        GameControl.createNewGame(Shipwreck.getPlayer());
        
        GamePlayMenuView gamePlayMenuView = new GamePlayMenuView();
        gamePlayMenuView.display();
    }

    private void saveGame() {
        this.console.println("\n*** Enter the file path for where the game"
                + "it to be saved. ***");
        String filePath = this.getInput();
        try {
            GameControl.saveGame(Shipwreck.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenueView", ex.getMessage());
        }
    }

    private void continueGame() {
        this.console.println("\n\nEnter the file path for file where "
                + "the game is to be saved.");
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        GamePlayMenuView gameMenu = new GamePlayMenuView();
        gameMenu.display();
    }

    private void exitGame() {
        this.console.println("\n*** exitGame function called ***");
    }

    private void openHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
}
