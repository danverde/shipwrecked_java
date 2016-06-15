/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shipwreck;

import ModelLayer.Game;
import ModelLayer.Location;
import ModelLayer.Map;
import ModelLayer.Player;
import ModelLayer.ResourceScene;
import ModelLayer.Scene;
import ModelLayer.Character;
import ModelLayer.Weather;
import ModelLayer.Inventory;
import ModelLayer.Item;
import ModelLayer.Fire;
import ModelLayer.Enemy;
import ViewLayer.StartProgramView;

/**
 *
 * @author Jack
 */
public class Shipwreck {

    private static Game currentGame = null;
    private static Player player = null;
        
    public static void main(String[] args) {
     
    StartProgramView StartProgramView = new StartProgramView();
    StartProgramView.display();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Shipwreck.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Shipwreck.player = player;
    }
    
}
