/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayer;

import ModelLayer.Player;

/**
 *
 * @author Daniel
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        System.out.println("*** createPlayer function called***");
        return new Player();
    }
    
}
