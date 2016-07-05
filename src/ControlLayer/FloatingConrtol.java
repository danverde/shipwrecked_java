package ControlLayer;

import Exceptions.FloatControlException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jack
 */
public class FloatingConrtol {
    public static boolean verifyBouyency (int  characterWeight, int logAmount) 
            throws FloatControlException{
    // If (characterWeight < 59 or >201)
    //Return -1
    //If (logAmount <0 or > 6)
    //Return -1
    //Buoyancyforce = (4*.25)* Amount of Logs - (Character Weight* .0167 )
    //If BuoyancyForce > -1
    //Return true
    //Else 
    //Return false
    if (characterWeight < 60 || characterWeight > 200){
        throw new FloatControlException("You can't sail away in that shape,"
                                        +"your weight is way off");
    }
    if (logAmount < 1 || logAmount > 5){
        throw new FloatControlException ("Good Luck sailing with that, the logs are wrong");
    }
    
    double bouyencyForce = logAmount - (characterWeight * .0167);
    if (bouyencyForce > -1){
        return true;
    }
    else return false;

}
    

}
