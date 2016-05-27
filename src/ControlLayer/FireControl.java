/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayer;

/**
 *
 * @author Daniel
 */
public class FireControl {

    public float calculateBurnTime(int woodAmount){
        //int burnTime = 0;
        //if (woodAmount > 0){
        //    burnTime = woodAmount * 3 / 2;
        //} else{
        //    return -1;
        //}
        //if (burnTime <= 0){
        //    return -2;
        //}
        //return burnTime;
        
        float burnTime = 0;
        if (woodAmount > 0){
            burnTime = (float)(woodAmount * 3.0 / 2.0);
        } else{
            return -1;
        }
        if (burnTime <= 0){
            return -2;
        }
        return burnTime;
    }
}
