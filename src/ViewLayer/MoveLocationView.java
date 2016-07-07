/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import ControlLayer.MapControl;
import Exceptions.MapControlException;

/**
 *
 * @author Daniel
 */
public class MoveLocationView extends View{
    
    public MoveLocationView(){
        super("Please enter a Direction & a Distance /N,2/");
    }

    @Override
    public boolean doAction(String value){
       try{
       char cDistance = value.charAt(2);
       int distance = Character.getNumericValue(cDistance);
       char direction = value.toUpperCase().charAt(0);
       
       if (direction != 'N' && direction != 'E' && direction != 'S' && direction != 'W')
       {
           throw new MapControlException("Invalid direction. Please Enter either N, E, S, or W.");
       }
       if (distance < 1 || distance > 5)
       {
           throw new MapControlException ("Invalid distance. Value must be greater than 0 & less than 6");
       }

       MapControl.moveCharacter(direction, distance);
       return true;
       }
       catch (MapControlException mce){
       this.console.println(mce.getMessage());
           return false;   
       }
    } 
}
