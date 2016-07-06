/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayer;

import Exceptions.CharacterControlException;

/**
 *
 * @author Jack
 */
public class CharecterControl {
    public double calcDamage(int enemyDefence, int hungerValue, int attackType)throws CharacterControlException{

        if (hungerValue < 0 || hungerValue > 15){ 
            throw new CharacterControlException("You are wayyyy to hungry to be fighting right now"
                    + "\nHunger Value too low");
        }
        if (enemyDefence < 0 || enemyDefence > 6){
            throw new CharacterControlException("Error. Enemy Defense is too high. You can't win...");
        }
        if (attackType == 4 || attackType == 8){
           double damage = hungerValue * 0.3 + attackType - enemyDefence;
            if (damage < 0){
                return 0;
                }
            return damage;
        
        }
        else 
        throw new CharacterControlException("Invalid attack type");
    }
        

}
