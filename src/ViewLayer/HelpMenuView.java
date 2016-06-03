/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;


/**
 *
 * @author Daniel
 */
public class HelpMenuView {
    private String menu;
    
     public HelpMenuView() {
        this.menu = "\n"
                  + "\n----------------------------------" 
                  + "\n| Help Menu"
                  + "\n----------------------------------"
                  + "\nG - Purpose of the Game"
                  + "\nM - How to Move"
                  + "\nR - Resource Help"
                  + "\nK - Combat Help"
                  + "\nB - Building Help"
                  + "\nW - Weather Explanation"
                  + "\nX - Continue On"
                  + "\n----------------------------------";
}

    
    void displayHelpMenu() {
        boolean done = false;
        do{
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("C")){
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
            case "G":
                this.gamePurpose();
                break;
            case "M":
                this.movementHelp();
                break;
            case "R":
                this.resourceHelp();
                break;
            case "K":
                this.combatHelp();
                break;
            case "B":
                this.buildingHelp();
                break;
            case "W":
                this.weatherExplanation();
                break;
            case "X":
                this.showGameMenu();
                break;
            default:
                System.out.println("\n*** Recheck your keys & enter a valid letter ***");
                break;
        }
        return true;
    }

    private void gamePurpose() {
        System.out.println("*** gamePurpose function called***");
    }

    private void movementHelp() {
        System.out.println("*** movementHelp function called***");
    }

    private void resourceHelp() {
        System.out.println("*** resourceHelp function called***");
    }

    private void combatHelp() {
        System.out.println("*** combatHelp function called***");
    }

    private void buildingHelp() {
        System.out.println("*** buildingHelp function called***");
    }

    private void weatherExplanation() {
        System.out.println("*** weatherExplanation function called***");
    }

    private void showGameMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }
}
