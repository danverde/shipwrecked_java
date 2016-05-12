/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shipwreck;

import ShipwreckPackage.Game;
import ShipwreckPackage.Player;

/**
 *
 * @author Jack
 */
public class Shipwreck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.setName("John Doe");
        String playerInfo = player1.toString();
        System.out.println(playerInfo);
        Game game1 = new Game();
        game1.setTime(17.00);
        game1.setBestTime(7.00);
        String gameInfo = game1.toString();
    }
    
}
