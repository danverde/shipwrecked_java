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
public class StartAddFireView {
private String promptMessage;

    public StartAddFireView() {
        this.promptMessage = "How Much Wood do you want to burn?";
    }
    
    public void displayStartAddFire(){
        boolean done = false;
        do{
            //String menuOption = this.getInput();
            int woodAmount = this.getInput();
            /*if (menuOption.toUpperCase().equals("E")){
                return;
            }*/
            done = this.doAction(woodAmount);
        } while (!done);
    }
    
    
    public int getInput(){
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        Boolean valid = false;
        
        while (!valid){
            //System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            int woodAmount = Integer.parseInt(value);
            
            if (woodAmount <= 0){
                System.out.println("\nInvald value: Must be greater than 0");
                continue;
            }
            return woodAmount;
            }
        return 0;
    }
    
    public boolean doAction(int woodAmount){
        //check if fire is already burning
        //check inventory for a match
        
    }
    
    public int startAddFire(){
        
        //Fire fire = new Fire();
        //check to see if a fire is already burning
        //check for & use a match
        
        //enter amount of wood to be burned
        

        System.out.println("The fire will burn for " + 
                FireControl.calculateBurnTime(woodAmount)+
                " Hours.");
        
        //fire.setWoodAmount(woodAmount);
        //fire.calculateBurnTime(woodAmount);*/
        return 3;
    }
    
    
}
