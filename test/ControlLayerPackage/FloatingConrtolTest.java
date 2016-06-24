/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlLayerPackage;

import ControlLayer.FloatingConrtol;
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
     */
    @Test
    public void testVerifyBouyency() {
        System.out.println("verifyBouyency");
        System.out.println("Test1");
        int characterWeight = 70;
        int logAmount = 4;
        FloatingConrtol instance = new FloatingConrtol();
        String expResult = "True";
        String result = instance.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        System.out.println("verifyBouyency");
        System.out.println("Test2");
        characterWeight = 70;
        logAmount = 0;
        instance = new FloatingConrtol();
        expResult = "-2";
        result = instance.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        System.out.println("verifyBouyency");
        System.out.println("Test3");
        characterWeight = 59;
        logAmount = 4;
        instance = new FloatingConrtol();
        expResult = "-1";
        result = instance.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        System.out.println("verifyBouyency");
        System.out.println("Test4");
        characterWeight = 201;
        logAmount = 4;
        instance = new FloatingConrtol();
        expResult = "-1";
        result = instance.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        System.out.println("verifyBouyency");
        System.out.println("Test5");
        characterWeight = 60;
        logAmount = 4;
        instance = new FloatingConrtol();
        expResult = "True";
        result = instance.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        System.out.println("verifyBouyency");
        System.out.println("Test6");
        characterWeight = 200;
        logAmount = 2;
        instance = new FloatingConrtol();
        expResult = "False";
        result = instance.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        System.out.println("verifyBouyency");
        System.out.println("Test7");
        characterWeight = 100;
        logAmount = 1;
        instance = new FloatingConrtol();
        expResult = "True";
        result = instance.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
         System.out.println("verifyBouyency");
        System.out.println("Test8");
        characterWeight = 100;
        logAmount = 5;
        instance = new FloatingConrtol();
        expResult = "True";
        result = instance.verifyBouyency(characterWeight, logAmount);
        assertEquals(expResult, result);
        
        
    }
    
}
