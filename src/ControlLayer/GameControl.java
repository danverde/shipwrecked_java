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
        if (name == null) {
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

        Food[] foods = GameControl.createFoodList(player);
        game.setFoodStuff(foods);

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

    public enum Items {
        Wood,
        Match,
        Spear,
        Vine,
        Stone;
    }

    public static Item[] createItemList(Player player) {
        Item[] itemList = new Item[5];

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

    public enum FoodStuff {
        Meat,
        Fruit,
        Fish;
    }

    public static Food[] createFoodList(Player player) {
        Food[] foodList = new Food[3];

        Food meat = new Food();
        meat.setFoodType("Meat");
        meat.setQuanitiy(0);
        meat.setHungerFilled(5);
        foodList[FoodStuff.Meat.ordinal()] = meat;

        Food fruit = new Food();
        fruit.setFoodType("Fruit");
        fruit.setQuanitiy(4);
        fruit.setHungerFilled(2);
        foodList[FoodStuff.Fruit.ordinal()] = fruit;

        Food fish = new Food();
        fish.setFoodType("Fish");
        fish.setQuanitiy(0);
        fish.setHungerFilled(4);
        foodList[FoodStuff.Fish.ordinal()] = fish;

        return foodList;
    }

    public static Item[] sortList(Item[] itemList) {
        //Item[] itemList = Shipwreck.getCurrentGame().getItems();
        Item temp;
        for (int i = 1; i < itemList.length; i++){
            for (int j = i; j > 0; j--) {
                if (itemList[j].getQuantity() > itemList[j - 1].getQuantity()) {
                    temp = itemList[j];
                    itemList[j] = itemList[j - 1];
                    itemList[j - 1] = temp;

                }
            }
        }
        return itemList;
    }

}
