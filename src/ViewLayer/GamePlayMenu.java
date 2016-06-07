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
public class GamePlayMenu {
    
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
                  + "\nH - Help Menu"
                  + "\nS - Save Game"
                  + "\nQ - Quit Game"
                  + "\n----------------------------------";
}
    
    public void displayMainMenuView() {
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
            case "F":
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
            default:
                System.out.println("\n*** Recheck your keys & enter a valid letter ***");
                break;
        }
        return true;
        
    }

}
