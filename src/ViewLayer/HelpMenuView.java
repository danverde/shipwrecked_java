/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ModelLayer.Item;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import shipwreck.Shipwreck;

/**
 *
 * @author Daniel
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n----------------------------------"
                + "\n| Help Menu"
                + "\n----------------------------------"
                + "\nG - Purpose of the Game"
                + "\nM - How to Move"
                + "\nR - Resource Help"
                + "\nK - Combat Help"
                + "\nB - Building Help"
                + "\nW - Weather Explanation"
                + "\nI - Print Current Item List"
                + "\nX - Continue On"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        switch (menuOption) {
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
            case "I":
                this.printItemList();
                break;
            case "X":
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Recheck your keys & enter a valid letter ***");
                break;
        }
        return false;
    }

    private void gamePurpose() {
        this.console.println("*************************************************************************"
                + "\n   The purpose of the Game is to survive however you can. Stuck on a"
                + "\ntropical Island you can either try and escape on your own by buildng"
                + "\na raft & floating to safety. Or maybe building a large signal fire on"
                + "\nthe beach will attract help…. Maybe your best bet is to simply wait"
                + "\npatiently till someone comes to find you. I mean, after such a big ship"
                + "\nwent down SOMEONE’s bound to come looking for survivors… Right?"
                + "\n*************************************************************************");
    }

    private void movementHelp() {
        this.console.println("*** movementHelp function called***");
    }

    private void resourceHelp() {
        this.console.println("*** resourceHelp function called***");
    }

    private void combatHelp() {
        this.console.println("*** combatHelp function called***");
    }

    private void buildingHelp() {
        this.console.println("*** buildingHelp function called***");
    }

    private void weatherExplanation() {
        this.console.println("*** weatherExplanation function called***");
    }

    private void printItemList() {
        PrintItems printItem = new PrintItems();
        printItem.display();
    }
    }
