/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayer;

import ModelLayer.Game;
import ModelLayer.Map;
import ModelLayer.Player;
import ModelLayer.Weather;
import shipwreck.Shipwreck;

/**
 *
 * @author Daniel
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null){
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        Shipwreck.setPlayer(player);
        
        return player;
    }
    
    public static void createNewGame(Player player) {
        Game game = new Game();//create game
        Shipwreck.setCurrentGame(game);//Save game
        
        game.setPlayer(player); //save player
        
        Map map = MapControl.createMap;//create new map
        game.setMap(map);//save map
        
        MapControl.movePlayerToStartLocation(map);// place player in start location
        
        Weather Weather = new Weather();
        game.setWeather(); 
        
        Item[] itemList = gameControl.createItemList;
        game.setTime(0);//save time
        game.setBestTime(0); //save best time
    }
        public static item[] creatItemList() {
        System.out.println("*** ItemList Created ***");
    }

    
    
}
