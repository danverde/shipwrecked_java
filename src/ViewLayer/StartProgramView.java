/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ControlLayer.GameControl;
import ModelLayer.Player;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class StartProgramView extends View{

    private String promptMessage;
    
    public StartProgramView() {
    super("\nPlease enter your name: ");
    this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
        "======================================================================"
      + "  INSERT WITTY BANNER MESSAGE HERE"
      + "======================================================================");
    }

    @Override
    public boolean doAction(String playersName) {
        if(playersName.length() < 2){
            System.out.println("\nInvalid players name:" + 
                    "The name must be greater than 1 character in length.");
            return false;
        }
        Player player = GameControl.createPlayer(playersName);
        if (player == null){
            System.out.println("\nError creating the player.");
            return false;
        }
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n========================================="
                         + "\n Welcome to the Game " + player.getName()
                         + "\n We hope you have a lot of fun!"
                         + "\n========================================="
                         );
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.display();
   }
}
