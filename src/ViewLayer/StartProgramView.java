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
        this.console.println(
        "======================================================================"
      + "  INSERT WITTY BANNER MESSAGE HERE"
      + "======================================================================");
    }

    @Override
    public boolean doAction(String playersName) {
        if(playersName.length() < 2){
            ErrorView.display(this.getClass().getName(),"\nInvalid players name:" + 
                    "The name must be greater than 1 character in length.");
            return false;
        }
        Player player = GameControl.createPlayer(playersName);
        if (player == null){
            ErrorView.display(this.getClass().getName(),"\nError creating the player.");
            return false;
        }
        this.displayNextView(player);
        return false;
    }

    private void displayNextView(Player player) {
        this.console.println("\n========================================="
                         + "\n Welcome to the Game " + player.getName()
                         + "\n We hope you have a lot of fun!"
                         + "\n========================================="
                         );
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.display();
   }
}
