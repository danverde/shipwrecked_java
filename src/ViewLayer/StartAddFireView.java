/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ControlLayer.FireControl;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class StartAddFireView extends View{

    public StartAddFireView() {
        super("How Much Wood do you want to burn?");
    }
    
    @Override
    public boolean doAction(String sWoodAmount){
        // parse input
        int woodAmount = Integer.parseInt(sWoodAmount);
        //check if fire is already burning
        //check inventory for a match
        
        
        float burnTime = FireControl.calculateBurnTime(woodAmount);
        while(burnTime < 0){
            if(burnTime == -1){
                System.out.println("Wood amount must be greater than 0.");
                return false;
            }
            else if (burnTime == -2){
                System.out.println("Burn time too low. Please enter more wood.");
                return false;
            }
            else{
                System.out.println("A fatal error has occured. Please try again");
                return false;
            }
        }
        System.out.println("The fire will burn for " + 
                burnTime +
                " Hours.");
        return true;
        
    }
    
}
