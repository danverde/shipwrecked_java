/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayer;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
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
     */
    @Test
    public void testCalculateBurnTime() {
        System.out.println("calculateBurnTime");
        System.out.println("Test1");
        int woodAmount = 4;
        FireControl instance = new FireControl();
        float expResult = 6.0F;
        float result = instance.calculateBurnTime(woodAmount);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test2");
        woodAmount = 0;
        expResult = -1.0F;
        result = instance.calculateBurnTime(woodAmount);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test3");
        woodAmount = 1;
        expResult = 1.5F;
        result = instance.calculateBurnTime(woodAmount);
        assertEquals(expResult, result, 0.0);
    }
    
}
