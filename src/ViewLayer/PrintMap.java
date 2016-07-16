/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ControlLayer.MapControl;
import ModelLayer.Scene;
import shipwreck.Shipwreck;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jack
 */
public class PrintMap extends View{
    
    public PrintMap(){
        super ("Print Name of file to be saved");
    }

    @Override
    public boolean doAction(String filePath) {
        Scene[] scenes = Shipwreck.getCurrentGame().getScenes();
        try (PrintWriter out = new PrintWriter(filePath)){
            out.println("\n\n         Map Description        ");
            
            for (Scene scene : scenes){
            out.printf("%n%-4s%-40s",scene.getDisplaySymbol()
                       , scene.getDescription());
            }
                    
        }  catch (IOException ex){
    System.out.println("I/O Error: " + ex.getMessage());
        
    }
    
    return true; 
    }

    
       
}
