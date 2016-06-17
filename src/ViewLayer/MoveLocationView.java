/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ControlLayer.MapControl;

/**
 *
 * @author Daniel
 */
public class MoveLocationView extends View{
    
    public MoveLocationView(){
        super("Please enter a Direction & a Distance /N,2/");
    }

    @Override
    public boolean doAction(String value) {
       char cDistance = value.charAt(2);
       int distance = Character.getNumericValue(cDistance);
       char direction = value.toUpperCase().charAt(0);
       
       if (direction != 'N' && direction != 'E' && direction != 'S' && direction != 'W')
       {
           System.out.println("Invalid direction. Please Enter either N, E, S, or W.");
           return false;
       }
       if (distance < 1)
       {
           System.out.println("Invalid distance. Value must be greater than 0.");
           return false;
       }

       MapControl.moveCharacter(direction, distance);
       return true;
       
    } 
}
