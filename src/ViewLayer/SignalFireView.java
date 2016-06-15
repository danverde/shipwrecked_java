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
public class SignalFireView extends View {
    private String menu;
    
    public SignalFireView() {
        super ("\n"
                  + "\n----------------------------------" 
                  + "\n| Signal Fire"
                  + "\n----------------------------------"
                  + "\nA - Start Fire OR Add Wood"
                  + "\nS - Check Fire Status"
                  + "\nB - Board Ship"
                  + "\nX - Return to Game Menu"
                  + "\n----------------------------------");
}

 
    @Override
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
        startAddFire.display();
    }

    private void fireStatus() {
        System.out.println("*** fireStatus function called***");
    }

    private void boardShip() {
        System.out.println("*** boardShip function called***");
    }

}