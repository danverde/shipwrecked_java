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
            System.out.println("\n" + this.promptMessage);
            
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
