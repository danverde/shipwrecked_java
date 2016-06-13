/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ModelLayer.Fire;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class SignalFireView {
    private String menu;
    
    public SignalFireView() {
        this.menu = "\n"
                  + "\n----------------------------------" 
                  + "\n| Signal Fire"
                  + "\n----------------------------------"
                  + "\nA - Start Fire OR Add Wood"
                  + "\nS - Check Fire Status"
                  + "\nB - Board Ship"
                  + "\nX - Return to Game Menu"
                  + "\n----------------------------------";
}

   void displaySignalFireView() {
        boolean done = false;
        do{
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E")){
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
            case "A":
                this.startAddFire();
                break;
            case "S":
                this.fireStatus();
                break;
            case "B":
                this.boardShip();
                break;
            case "X":
                return true;
            default:
                System.out.println("\n*** Recheck your keys & enter a valid letter ***");
                break;
        }
        return true;
    }

    private void startAddFire() {
        StartAddFireView startAddFire = new StartAddFireView();
        startAddFire.displayStartAddFire();
    }

    private void fireStatus() {
        System.out.println("*** fireStatus function called***");
    }

    private void boardShip() {
        System.out.println("*** boardShip function called***");
    }

}