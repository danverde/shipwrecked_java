/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayer;

import ControlLayer.CharecterControl;
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
        
    
     
        System.out.println("calcDamage");
        System.out.println("Test2");
        enemyDefence = 3;
        hungerValue = -1;
        attackType = 4;
        expResult = -1.0;
        result = instance.calcDamage(enemyDefence, hungerValue, attackType);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcDamage");
        System.out.println("Test3");
        enemyDefence = 3;
        hungerValue = 10;
        attackType = 3;
        expResult = -3.0;
        result = instance.calcDamage(enemyDefence, hungerValue, attackType);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcDamage");
        System.out.println("Test4");
        enemyDefence = 11;
        hungerValue = 10;
        attackType = 4;
        expResult = -2.0;
        result = instance.calcDamage(enemyDefence, hungerValue, attackType);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcDamage");
        System.out.println("Test5");
        enemyDefence =-1;
        hungerValue = 10;
        attackType = 4;
        expResult = -2.0;
        result = instance.calcDamage(enemyDefence, hungerValue, attackType);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcDamage");
        System.out.println("Test6");
        enemyDefence = 3;
        hungerValue = 16;
        attackType = 4;
        expResult = -1.0;
        result = instance.calcDamage(enemyDefence, hungerValue, attackType);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcDamage");
        System.out.println("Test7");
        enemyDefence = 5;
        hungerValue = 0;
        attackType = 4;
        expResult = 0.0;
        result = instance.calcDamage(enemyDefence, hungerValue, attackType);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcDamage");
        System.out.println("Test8");
        enemyDefence = 3;
        hungerValue = 15;
        attackType = 4;
        expResult = 5.5;
        result = instance.calcDamage(enemyDefence, hungerValue, attackType);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcDamage");
        System.out.println("Test9");
        enemyDefence = 3;
        hungerValue = 0;
        attackType = 4;
        expResult = 1.0;
        result = instance.calcDamage(enemyDefence, hungerValue, attackType);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcDamage");
        System.out.println("Test10");
        enemyDefence = 0;
        hungerValue = 10;
        attackType = 4;
        expResult = 7.0;
        result = instance.calcDamage(enemyDefence, hungerValue, attackType);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcDamage");
        System.out.println("Test11");
        enemyDefence = 3;
        hungerValue = 10;
        attackType = 4;
        expResult = 4.0;
        result = instance.calcDamage(enemyDefence, hungerValue, attackType);
        assertEquals(expResult, result, 0.0);
    }
}
