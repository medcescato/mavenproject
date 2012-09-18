/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.mavenproject.HelloWorldSB;
import static org.junit.Assert.*;

/**
 *
 * @author Maurício
 */
public class HelloWorldSBTest {
    
    public HelloWorldSBTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
    /**
     * Test of hello method, of class HelloWorldSB.
     */
    @org.junit.Test
    public void testHello() throws Exception {
        System.out.println("hello");
        String name = "Mario";
        HelloWorldSB instance = new HelloWorldSB();
        String expResult = "[EJB 3.1] Hello, World ! Mr/Mrs Mario!";
        String result = instance.hello(name);
        assertEquals(expResult, result);
    }
}
