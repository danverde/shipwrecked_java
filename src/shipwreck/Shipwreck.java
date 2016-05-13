/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shipwreck;

import ShipwreckPackage.Game;
import ShipwreckPackage.Location;
import ShipwreckPackage.Map;
import ShipwreckPackage.Player;
import ShipwreckPackage.ResourceScene;
import ShipwreckPackage.Scene;

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
        System.out.println(gameInfo);
        Scene scene1 = new Scene();
        scene1.setDescription("A nice river");
        scene1.setBlockedLocation(true);
        scene1.setDisplaySymbol("#");
        scene1.setTimeTravel(7.00);
        String sceneinfo = scene1.toString();
        System.out.println(sceneinfo);
        Map map1 = new Map();
        map1.setColumnCount(2);
        map1.setRowCount(1);
        String mapinfo = map1.toString();
        System.out.println(mapinfo);
        Location location1 = new Location();
        location1.setColumnNumber(1);
        location1.setRowNumber(2);
        location1.setVisited(true);
        String locationinfo = location1.toString();
        System.out.println(locationinfo);
        ResourceScene resourceScene1 = new ResourceScene();
        resourceScene1.setResourceAmount(2);
        resourceScene1.setResourceType("wood");
        String resourceInfo = resourceScene1.toString();
        System.out.println(resourceInfo);
        
    }
    
}
