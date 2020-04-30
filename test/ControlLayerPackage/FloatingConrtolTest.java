/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayerPackage;
import ControlLayer.FloatingControl;
import Exceptions.FloatControlException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jack
 */
public class FloatingConrtolTest {
    
    public FloatingConrtolTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of verifyBouyency method, of class FloatingConrtol.
     * @throws FloatControlException 
     */
    @Test
    public void testVerifyBouyency() throws FloatControlException {
        System.out.println("verifyBouyency");
        System.out.println("Test1");
        int characterWeight = 70;
        int logAmount = 4;
        Boolean expResult = true;
        Boolean result = FloatingControl.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        System.out.println("verifyBouyency");
        System.out.println("Test2");
        characterWeight = 70;
        logAmount = 0;
        expResult = false;
        result = FloatingControl.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        System.out.println("verifyBouyency");
        System.out.println("Test3");
        characterWeight = 59;
        logAmount = 4;
        expResult = false;
        result = FloatingControl.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        System.out.println("verifyBouyency");
        System.out.println("Test4");
        characterWeight = 201;
        logAmount = 4;
        expResult = false;
        result = FloatingControl.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        System.out.println("verifyBouyency");
        System.out.println("Test5");
        characterWeight = 60;
        logAmount = 4;
        expResult = true;
        result = FloatingControl.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        System.out.println("verifyBouyency");
        System.out.println("Test6");
        characterWeight = 200;
        logAmount = 2;
        expResult = false;
        result = FloatingControl.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        System.out.println("verifyBouyency");
        System.out.println("Test7");
        characterWeight = 100;
        logAmount = 1;
        expResult = true;
        result = FloatingControl.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        System.out.println("verifyBouyency");
        System.out.println("Test8");
        characterWeight = 100;
        logAmount = 5;
        expResult = true;
        result = FloatingControl.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        
    }
    
}
