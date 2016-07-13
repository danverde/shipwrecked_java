/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ModelLayer.Scene;
import shipwreck.Shipwreck;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Jack
 */
public class PrintMap { 
    public void printMap(ArrayList<Scene> scenes, String mapFile ){
        try(PrintWriter out = new PrintWriter(mapfile)){
            out.println("\n\n         Map Description        ");
            
            for (Scene scene : scenes){
            out.printf("%N%-4s%40s",Scene.getDisplaySymbol()
                       , Scene.getDescription());
            }
        }  catch (IOException ex){
    System.out.println("I/O Error: " + ex.getMessage());
        
    }
    
    
}
}
