/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayer;

/**
 *
 * @author Jack
 */
public class CharecterControl {
    public double calcDamage(int enemyDefence, int hungerValue, int attackType){
        
        //calcDamageInFight(hungervalue, attackType,  enemyDefence);
        //if (hungerValue &lt; -1 and hungerValue &gt;16);
        //return -1;
        //if (enemyDefence &lt; -1 and enemyDefence &gt;6);
        //return -2;
        //if (attackType!= 4, 8)
        //return -3;
        //damage = hungerValue * 0.3 + attackType – enemyDefence
        //if damage ( &lt; 0 ) 
        //return 0;
        //Else Return damage
        if (hungerValue < 0 || hungerValue > 15){ 
            return -1;
        }
        if (enemyDefence < 0 || enemyDefence > 6){
            return -2;
        }
        if (attackType == 4 || attackType == 8){
           double damage = hungerValue * 0.3 + attackType - enemyDefence;
            if (damage < 0){
                return 0;
                }
            return damage;
        
        }
        else 
        return -3;
    }
        

}
