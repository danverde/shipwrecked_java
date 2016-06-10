/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayerPackage;

/**
 *
 * @author Jack
 */
public class FloatingConrtol {
    public String verifyBouyency (int  characterWeight, int logAmount){
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
        return "-1";
    }
    if (logAmount < 1 || logAmount > 5){
        return "-2";
    }
    
    double bouyencyForce = logAmount - (characterWeight * .0167);
    if (bouyencyForce > -1){
        return "True";
    }
    else return "False";

}
    

}
