/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.io.PrintWriter;
import shipwreck.Shipwreck;

/**
 *
 * @author Jack
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = Shipwreck.getOutFile();
    private static  final PrintWriter logFile = Shipwreck.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        errorFile.println(
        "----------------------------------------"
        + "n- ERROR -" + errorMessage
        + "----------------------------------------");
        
    // log error
    logFile.println(className + " - "+ errorMessage);
    }
    
}
