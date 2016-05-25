/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayerPackage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jack
 */
public class CharecterControlTest {
    
    public CharecterControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcDamage method, of class CharecterControl.
     */
    @Test
    public void testCalcDamage() {
        System.out.println("calcDamage");
        System.out.println("Test1");
        int enemyDefence = 3;
        int hungerValue = 10;
        int attackType = 4;
        CharecterControl instance = new CharecterControl();
        double expResult = 4.0;
        double result = instance.calcDamage(enemyDefence, hungerValue, attackType);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
