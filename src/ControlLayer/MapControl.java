/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayer;

import ModelLayer.Location;
import ModelLayer.Map;
import ModelLayer.Scene;

/**
 *
 * @author Daniel
 */
public class MapControl {
    public static Map createMap() {
        Map map = new Map(5,5);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignSceneLocations(map, scenes);
        
        return map;
    }
    public static  void moveCharacter(char direction, int distance){
        System.out.println("*** MoveCharacter function called ***");
    }
    public enum Scenes{
    Starting,
    Camp,
    Forest,
    Enemy,
    Cliff,
    Town,
    Stone,
    Beach,
    Water;
}
    private static void assignSceneLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[Scenes.Water.ordinal()]);
        locations[0][1].setScene(scenes[Scenes.Beach.ordinal()]);
        locations[0][2].setScene(scenes[Scenes.Enemy.ordinal()]);
        locations[0][3].setScene(scenes[Scenes.Forest.ordinal()]);
        locations[0][4].setScene(scenes[Scenes.Forest.ordinal()]);
        
        locations[1][0].setScene(scenes[Scenes.Beach.ordinal()]);
        locations[1][1].setScene(scenes[Scenes.Camp.ordinal()]);
        locations[1][2].setScene(scenes[Scenes.Forest.ordinal()]);
        locations[1][3].setScene(scenes[Scenes.Stone.ordinal()]);
        locations[1][4].setScene(scenes[Scenes.Cliff.ordinal()]);
        
        locations[2][0].setScene(scenes[Scenes.Beach.ordinal()]);
        locations[2][1].setScene(scenes[Scenes.Forest.ordinal()]);
        locations[2][2].setScene(scenes[Scenes.Forest.ordinal()]);
        locations[2][3].setScene(scenes[Scenes.Cliff.ordinal()]);
        locations[2][4].setScene(scenes[Scenes.Town.ordinal()]);
        
        locations[3][0].setScene(scenes[Scenes.Water.ordinal()]);
        locations[3][1].setScene(scenes[Scenes.Beach.ordinal()]);
        locations[3][2].setScene(scenes[Scenes.Forest.ordinal()]);
        locations[3][3].setScene(scenes[Scenes.Cliff.ordinal()]);
        locations[3][4].setScene(scenes[Scenes.Forest.ordinal()]);
        
        locations[4][0].setScene(scenes[Scenes.Water.ordinal()]);
        locations[4][1].setScene(scenes[Scenes.Water.ordinal()]);
        locations[4][2].setScene(scenes[Scenes.Beach.ordinal()]);
        locations[4][3].setScene(scenes[Scenes.Enemy.ordinal()]);
        locations[4][4].setScene(scenes[Scenes.Forest.ordinal()]);
        
    }

    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[Scenes.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("Welcome to the Beach. Don't get eaten.");
        startingScene.setDisplaySymbol(" B ");
        startingScene.setBlockedLocation(false);
        startingScene.setTimeTravel(2);
        scenes[Scenes.Starting.ordinal()] = startingScene;
        
        Scene campScene = new Scene();
        campScene.setDescription("Welcome to the Camp. Don't get lost.");
        campScene.setDisplaySymbol(" C ");
        campScene.setBlockedLocation(false);
        campScene.setTimeTravel(2);
        scenes[Scenes.Camp.ordinal()] = campScene;
        
        Scene forestScene = new Scene();
        forestScene.setDescription("Welcome to the forest. Don't get killed.");
        forestScene.setDisplaySymbol(" F ");
        forestScene.setBlockedLocation(false);
        forestScene.setTimeTravel(2);
        scenes[Scenes.Forest.ordinal()] = forestScene;

        Scene enemyScene = new Scene();
        enemyScene.setDescription("Look out for that enemy. Don't get killed.");
        enemyScene.setDisplaySymbol(" E ");
        enemyScene.setBlockedLocation(false);
        enemyScene.setTimeTravel(2);
        scenes[Scenes.Enemy.ordinal()] = enemyScene;

         Scene cliffScene = new Scene();
        cliffScene.setDescription("You shall not pass.");
        cliffScene.setDisplaySymbol(" CL ");
        cliffScene.setBlockedLocation(true);
        cliffScene.setTimeTravel(2);
        scenes[Scenes.Cliff.ordinal()] = cliffScene;

        Scene townScene = new Scene();
        townScene.setDescription("You are saved.");
        townScene.setDisplaySymbol(" T ");
        townScene.setBlockedLocation(false);
        townScene.setTimeTravel(2);
        scenes[Scenes.Town.ordinal()] = townScene;

        Scene stoneScene = new Scene();
        stoneScene.setDescription("You are saved.");
        stoneScene.setDisplaySymbol(" F ");
        stoneScene.setBlockedLocation(false);
        stoneScene.setTimeTravel(2);
        scenes[Scenes.Stone.ordinal()] = stoneScene;
        
        Scene waterScene = new Scene();
        waterScene.setDescription("Don't drown.");
        waterScene.setDisplaySymbol(" W ");
        waterScene.setBlockedLocation(true);
        waterScene.setTimeTravel(2);
        scenes[Scenes.Water.ordinal()] = waterScene;
        
        Scene BeachScene = new Scene();
        BeachScene.setDescription("Welcome to the beach");
        BeachScene.setDisplaySymbol(" B ");
        BeachScene.setBlockedLocation(false);
        BeachScene.setTimeTravel(2);
        scenes[Scenes.Beach.ordinal()] = BeachScene;
        
        return scenes;
    }

    static void moveCharacterToStartLocation(Map map) {
        System.out.println("moveCharacterToStartLocation called");
        return;
    }
}
