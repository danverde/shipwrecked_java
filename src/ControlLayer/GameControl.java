/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayer;

import ModelLayer.Food;
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
        game.setItems(itemList);
        
        game.setTime(0);//save time
        game.setBestTime(0); //save best timeMap map = MapControl.createMap;//create new map
        
        Map map = MapControl.createMap();//create new map
        game.setMap(map);//save map
        
        MapControl.moveCharacterToStartLocation(map);// place player in start location
    }

    static void assignSceneLocations(Map map, Scene[] scenes) {
        System.out.println("AssignSceneLocations called");
        return;
    }
    
      public enum Items{
       Wood,
       Match,
       Spear,
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
        public enum FoodStuff{
            Meat,
            Fish,
            Fruit;
        }
        public static Food[] createFoodList(Player player){
            Food[] foodList = new Food[3];
        Food meat = new Food();
        meat.setFoodType("Meat");
        meat.setQuanitiy(0);
        foodList[FoodStuff.Meat.ordinal()] = meat;
        
        Food fruit = new Food();
        fruit.setFoodType("Fruit");
        fruit.setQuanitiy(0);
        foodList [FoodStuff.Fruit.ordinal()] = fruit;
        
        Food fish = new Food();
        fruit.setFoodType("Fish");
        fruit.setQuanitiy(0);
        foodList [FoodStuff.Fish.ordinal()] = fish;
        
        return foodList;
        }
   
}
