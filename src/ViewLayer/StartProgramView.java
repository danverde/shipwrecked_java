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
public class StartProgramView extends View {

    private String promptMessage;

    public StartProgramView() {
        super("\nPlease enter your name: ");
        this.displayBanner();
    }

    private void displayBanner() {
        this.console.println(
                "======================================================================"
                + "\nCongratulations!! You just washed up on the shore of a tropical "
                + "\nIsland after your cruise ship sunk. Your goal is survive however you"
                + "\ncan! You can either try and escape on your own by buildng a raft &"
                + "\nfloating to safety. Or maybe building a large signal fire on the beach"
                + "\nwill attract help…. Maybe your best bet is to simply wait patiently"
                + "\ntill someone comes to find you. I mean, after such a big ship"
                + "\nwent down SOMEONE’s bound to come looking for survivors… Right?"
                + "\n======================================================================");
    }

    @Override
    public boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            ErrorView.display(this.getClass().getName(), "\nInvalid players name:"
                    + "The name must be greater than 1 character in length.");
            return false;
        }
        Player player = GameControl.createPlayer(playersName);
        if (player == null) {
            ErrorView.display(this.getClass().getName(), "\nError creating the player.");
            return false;
        }
        this.displayNextView(player);
        return true;
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
