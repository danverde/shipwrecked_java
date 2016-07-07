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

    public static void main(String[] args) {
        try {    
            Shipwreck.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            Shipwreck.outFile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            Shipwreck.logFile = new PrintWriter(filePath);
            StartProgramView StartProgramView = new StartProgramView();

            StartProgramView.display();
        }
        catch(Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
        }
        finally {
            try {
                if (inFile != null)
                inFile.close();
                
                if (outFile !=null)
                outFile.close();
                
                if (logFile !=null)
                    logFile.close();
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
