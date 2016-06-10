/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;

/**
 *
 * @author Jack
 */
public class GamePlayMenuView {
    
    private String gameMenu;
    
    public GamePlayMenuView(){
        this.gameMenu = "\n"
                  + "\n----------------------------------" 
                  + "\n| Game Menu"
                  + "\n----------------------------------"
                  + "\nR - View food/ resources"
                  + "\nI - View Tools"
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
                  + "\n----------------------------------";
}
    
    public void displayGameMenu() {
        boolean done = false;
        do{
            String gameMenuOption = this.getGameMenuOption();
            if (gameMenuOption.toUpperCase().equals("Q")){
                return;
            }
            done = this.doAction(gameMenuOption);
        } while (!done);
    }
    
        private String getGameMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        Boolean valid = false;
        
        while (!valid){
            System.out.println("\n" + this.gameMenu);
            
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
            case "R":
                this.viewResources();
                break;
            case "I":
                this.viewTools();
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
                this.openMainMenu();
                break;
            default:
                System.out.println("\n*** Recheck your keys & enter a valid letter ***");
                break;
        }
        return true;
    }
        
      private void openHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenu();
    }
    private void openMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }

    private void viewResources() {
        System.out.println("\n*** viewResources function called ***");    
    }

    private void viewTools() {
        System.out.println("\n*** viewTools function called ***");    
    }

    private void huntFood() {
        System.out.println("\n*** huntFood function called ***");    
    }

    private void viewMap() {
        System.out.println("\n*** viewMap function called ***");
    }

    private void moveMenu() {
        System.out.println("\n*** moveMenu function called ***");
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
        signalFireView signalFireView = new signalFireView();
        signalFireView.displaySignalFireView();
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