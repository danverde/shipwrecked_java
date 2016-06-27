/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayer;

import ModelLayer.Game;
import ModelLayer.Item;
import ModelLayer.Map;
import ModelLayer.Player;
import ModelLayer.Scene;
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
        
        Weather weather = new Weather();
        game.setWeather(weather); 
        
        Item[] itemList = GameControl.createItemList(player);
        game.setTime(0);//save time
        game.setBestTime(0); //save best timeMap map = MapControl.createMap;//create new map
        
        Map map = MapControl.createMap();//create new map
        game.setMap(map);//save map
        
        MapControl.moveCharacterToStartLocation(map);// place player in start location
    }

    static void assignSceneLocations(Map map, Scene[] scenes) {
        System.err.println("AssignSceeLocations called");
        return;
    }
    
      public enum Items{
       Wood,
       Match,
       Spear,
       Meat,
       Fruit,
       Vine,
       Stone;
    } 
    
        public static Item[] createItemList(Player player) {
        Item[] itemList = new Item[7];
              
        Item wood = new Item();
        wood.setItemType("Wood");
        wood.setQuantity(0);
        itemList[Items.Wood.ordinal()] = wood;
        
        Item match = new Item();
        match.setItemType("Match");
        match.setQuantity(3);
        itemList[Items.Match.ordinal()] = match;
        
        Item spear = new Item();
        spear.setItemType("Spear");
        spear.setQuantity(0);
        itemList[Items.Spear.ordinal()] = spear;
        
        Item meat = new Item();
        meat.setItemType("Meat");
        meat.setQuantity(0);
        itemList[Items.Meat.ordinal()] = meat;
        
        Item fruit = new Item();
        fruit.setItemType("Fruit");
        fruit.setQuantity(0);
        itemList [Items.Fruit.ordinal()] = fruit;
        
        Item vine = new Item();
        vine.setItemType("Vine");
        vine.setQuantity(0);
        itemList[Items.Vine.ordinal()] = vine;
        
        Item stone = new Item();
        stone.setItemType("Stone");
        stone.setQuantity(0);
        itemList[Items.Stone.ordinal()] = stone;
        
        return itemList;
    }
   
}
