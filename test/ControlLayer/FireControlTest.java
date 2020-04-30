/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayer;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Exceptions.FireControlException;

import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class FireControlTest {
    
    public FireControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calculateBurnTime method, of class FireControl.
     * @throws FireControlException 
     */
    @Test
    public void testCalculateBurnTime() throws FireControlException {
        System.out.println("calculateBurnTime");
        System.out.println("Test1");
        int woodAmount = 4;
        float expResult = 6.0F;
        float result = FireControl.calculateBurnTime(woodAmount);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test2");
        woodAmount = 0;
        expResult = -1.0F;
        result = FireControl.calculateBurnTime(woodAmount);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test3");
        woodAmount = 1;
        expResult = 1.5F;
        result = FireControl.calculateBurnTime(woodAmount);
        assertEquals(expResult, result, 0.0);
    }
    
}
