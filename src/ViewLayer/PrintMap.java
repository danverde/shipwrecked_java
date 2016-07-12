/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ModelLayer.Scene;
import java.io.PrintWriter;
import static java.lang.System.out;
import shipwreck.Shipwreck;

/**
 *
 * @author Jack
 */
public class PrintMap {
    
    private static final PrintWriter mapFile = Shipwreck.getOutFile();

    public static void display(String DisplaySymbol, String Description){
        out.printf("%N%-4s%40s",Scene.getDisplaySymbol()
                       , Scene.getDescription()
        );

}
    
}
