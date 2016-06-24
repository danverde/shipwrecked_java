/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayer;

import ModelLayer.Map;
import ModelLayer.Scene;

/**
 *
 * @author Daniel
 */
public class MapControl {
    public static Map createMap() {
        Map map = new map (5, 5);
        
        Scene[] scenes = createScenes();
        
        assignSceneLocations(map, scenes);
        
        return map;
    }
    public static  void moveCharacter(char direction, int distance){
        System.out.println("*** MoveCharacter function called ***");
    }

    private static void assignSceneLocations(Map map, Scene[] scenes) {
        System.out.println("*** a scene function called ***");
    }

    private static Scene[] createScenes() {
        System.out.println("*** c scene function called ***");
    }
}
