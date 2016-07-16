/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayer;

import Exceptions.MapControlException;
import ModelLayer.FightScene;
import ModelLayer.Location;
import ModelLayer.Map;
import ModelLayer.Scene;
import shipwreck.Shipwreck;
import ModelLayer.Character;
import ModelLayer.ResourceScene;
/**
 *
 * @author Daniel
 */
public class MapControl {
    
    public static Map createMap() {
        Scene[] scenes = createScenes();
        Shipwreck.getCurrentGame().setScenes(createScenes());
        Map map = new Map(5, 5);


        
        MapControl.assignSceneLocations(map, scenes);

        return map;
    }

    public static void moveCharacter(char direction, int distance) throws MapControlException {
        // get current location
        int col = Shipwreck.getCurrentGame().getPlayer().getCharacter().getLocation().getColumn();
        int row = Shipwreck.getCurrentGame().getPlayer().getCharacter().getLocation().getRow();

        Character gameCharacter = Shipwreck.getPlayer().getCharacter();
        Location[][] locations = Shipwreck.getCurrentGame().getMap().getLocations();

        switch (direction) {
            case 'N':
                distance -= row;
                if (distance < 0) {
                    throw new MapControlException("You can't walk off the map silly!");
                }
                locations[row][col].getCharacters().remove(gameCharacter);
                for (int r = row; r >= distance; r--) {
                    locations[r][col].setVisited(true);
                    if (locations[r][col].getScene().isBlockedLocation()) {
                        gameCharacter.setLocation(locations[r + 1][col]);
                        locations[r + 1][col].getCharacters().add(gameCharacter);
                        throw new MapControlException("You were blocked by " + locations[r][col].getScene().getDescription());

                    }
                    row--;
                }
                gameCharacter.setLocation(locations[row + 1][col]);
                locations[row + 1][col].getCharacters().add(gameCharacter);
                break;
            case 'E':
                distance += col;
                if (distance > 5) {
                    throw new MapControlException("You can't walk off the map silly!");
                }
                locations[row][col].getCharacters().remove(gameCharacter);
                for (int c = col; c <= distance; c++) {
                    locations[row][c].setVisited(true);
                    if (locations[row][c].getScene().isBlockedLocation()) {
                        gameCharacter.setLocation(locations[row][c - 1]);
                        locations[row][c - 1].getCharacters().add(gameCharacter);
                        throw new MapControlException("You were blocked by " + locations[row][c].getScene().getDescription());

                    }
                    col++;
                }
                gameCharacter.setLocation(locations[row][col - 1]);
                locations[row][col - 1].getCharacters().add(gameCharacter);
                break;
            case 'S':
                distance += row;
                if (distance > 5) {
                    throw new MapControlException("You can't walk off the map silly!");
                }
                locations[row][col].getCharacters().remove(gameCharacter);
                for (int r = row; r <= distance; r++) {
                    locations[r][col].setVisited(true);
                    if (locations[r][col].getScene().isBlockedLocation()) {
                        gameCharacter.setLocation(locations[r - 1][col]);
                        locations[r - 1][col].getCharacters().add(gameCharacter);
                        throw new MapControlException("You were blocked by " + locations[r][col].getScene().getDescription());

                    }
                    row++;
                }
                gameCharacter.setLocation(locations[row - 1][col]);
                locations[row - 1][col].getCharacters().add(gameCharacter);
            case 'W':
                distance -= col;
                if (distance < 0) {
                    throw new MapControlException("You can't walk off the map silly!");
                }
                locations[row][col].getCharacters().remove(gameCharacter);
                for (int c = col; c >= distance; c--) {
                    locations[row][c].setVisited(true);
                    if (locations[row][c].getScene().isBlockedLocation()) {
                        gameCharacter.setLocation(locations[row][c + 1]);
                        locations[row][c + 1].getCharacters().add(gameCharacter);
                        throw new MapControlException("You were blocked by " + locations[row][c].getScene().getDescription());

                    }
                    col--;
                }
                gameCharacter.setLocation(locations[row][col + 1]);
                locations[row][col + 1].getCharacters().add(gameCharacter);
                break;
            default:
                throw new MapControlException("Something went wrong. We're sorry.");
        }
    }

    public enum Scenes {
        Camp,
        Forest,
        Enemy,
        Cliff,
        Town,
        Stone,
        Beach,
        Water;
    }

    public static void assignSceneLocations(Map map, Scene[] scenes) {
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

    public static Scene[] createScenes() {

        Scene[] scenes = new Scene[Scenes.values().length];

        Scene beach = new Scene();
        beach.setDescription("Beach");
        beach.setDisplaySymbol("  B ");
        beach.setBlockedLocation(false);
        beach.setTimeTravel(2);
        scenes[Scenes.Beach.ordinal()] = beach;

        Scene campScene = new Scene();
        campScene.setDescription("Camp");
        campScene.setDisplaySymbol("  C ");
        campScene.setBlockedLocation(false);
        campScene.setTimeTravel(2);
        scenes[Scenes.Camp.ordinal()] = campScene;

        Scene forestScene = new Scene();
        forestScene.setDescription("Forest");
        forestScene.setDisplaySymbol("  F ");
        forestScene.setBlockedLocation(false);
        forestScene.setVisited(true);
        forestScene.setTimeTravel(2);
        scenes[Scenes.Forest.ordinal()] = forestScene;

        Scene enemyScene = new FightScene();
        enemyScene.setDescription("Look out for that enemy. Don't get killed.");
        enemyScene.setDisplaySymbol("  E ");
        enemyScene.setBlockedLocation(true);
        enemyScene.setTimeTravel(2);
        scenes[Scenes.Enemy.ordinal()] = enemyScene;

        Scene cliffScene = new Scene();
        cliffScene.setDescription("Cliffs");
        cliffScene.setDisplaySymbol(" CL ");
        cliffScene.setBlockedLocation(true);
        cliffScene.setVisited(true);
        cliffScene.setTimeTravel(2);
        scenes[Scenes.Cliff.ordinal()] = cliffScene;

        Scene townScene = new Scene();
        townScene.setDescription("Town");
        townScene.setDisplaySymbol("  T ");
        townScene.setBlockedLocation(false);
        townScene.setTimeTravel(2);
        scenes[Scenes.Town.ordinal()] = townScene;

        ResourceScene stoneScene = new ResourceScene();
        stoneScene.setDescription("Stone");
        stoneScene.setDisplaySymbol("  F ");
        stoneScene.setResourceType("Stone");
        stoneScene.setBlockedLocation(false);
        stoneScene.setTimeTravel(2);
        scenes[Scenes.Stone.ordinal()] = stoneScene;

        Scene waterScene = new Scene();
        waterScene.setDescription("Water");
        waterScene.setDisplaySymbol("  W ");
        waterScene.setBlockedLocation(true);
        waterScene.setTimeTravel(2);
        scenes[Scenes.Water.ordinal()] = waterScene;

        return scenes;
    }
}

