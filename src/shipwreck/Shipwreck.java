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
import ModelLayer.Scene;
import ModelLayer.Character;
import ModelLayer.Weather;
import ModelLayer.ResourceScene;
import ModelLayer.Inventory;
import ModelLayer.Item;
import ModelLayer.Fire;
import ModelLayer.Enemy;
import ViewLayer.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jack
 */
public class Shipwreck {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    private static PrintWriter mapFile = null;
    private static PrintWriter itemsFile = null;

    public static void main(String[] args) {
        try {
            Shipwreck.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            Shipwreck.outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            Shipwreck.logFile = new PrintWriter(filePath);

            String mapPath = "map.txt";
            Shipwreck.mapFile = new PrintWriter(mapPath);

            String itemsPath = "items.txt";
            Shipwreck.itemsFile = new PrintWriter(itemsPath);

            StartProgramView StartProgramView = new StartProgramView();
            StartProgramView.display();
            
        } catch (Throwable te) {
            System.out.println("\nException: " + te.toString() +
                               "\nMessage: " + te.getMessage());
            te.printStackTrace();
        } finally {
            try {
                if (inFile != null) {
                    Shipwreck.inFile.close();
                }

                if (outFile != null) {
                    Shipwreck.outFile.close();
                }

                if (logFile != null) {
                    Shipwreck.logFile.close();
                }
                
                if (mapFile != null) {
                    Shipwreck.mapFile.close();
                }
                
                if (itemsFile != null) {
                    Shipwreck.itemsFile.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Shipwreck.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Shipwreck.logFile = logFile;
    }

    public static PrintWriter getMapFile() {
        return mapFile;
    }

    public static void setMapFile(PrintWriter mapFile) {
        Shipwreck.mapFile = mapFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutfile(PrintWriter outfile) {
        Shipwreck.outFile = outfile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader infile) {
        Shipwreck.inFile = infile;
    }

    public static PrintWriter getItemsFile() {
        return itemsFile;
    }

    public static void setItemsFile(PrintWriter itemsFile) {
        Shipwreck.itemsFile = itemsFile;
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
