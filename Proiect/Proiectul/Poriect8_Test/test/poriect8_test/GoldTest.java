/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poriect8_test;

import java.awt.Color;
import java.awt.Graphics;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hcamp
 */
public class GoldTest {
    
    public GoldTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isPressed method, of class Gold.
     */
    @Test
    public void testIsPressed() {
        System.out.println("isPressed");
        Gold instance = new Gold();
        boolean expResult = false;
        boolean result = instance.isPressed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsPressed method, of class Gold.
     */
    @Test
    public void testSetIsPressed() {
        System.out.println("setIsPressed");
        boolean isPressed = false;
        Gold instance = new Gold();
        instance.setIsPressed(isPressed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImg method, of class Gold.
     */
    @Test
    public void testSetImg() {
        System.out.println("setImg");
        String path = "";
        Gold instance = new Gold();
        instance.setImg(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class Gold.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        Gold instance = new Gold();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePosition method, of class Gold.
     */
    @Test
    public void testChangePosition() {
        System.out.println("changePosition");
        Gold instance = new Gold();
        instance.changePosition();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeColor method, of class Gold.
     */
    @Test
    public void testChangeColor() {
        System.out.println("changeColor");
        Color RED = null;
        Gold instance = new Gold();
        instance.changeColor(RED);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Backround method, of class Gold.
     */
    @Test
    public void testBackround() {
        System.out.println("Backround");
        Color BLACK = null;
        Gold instance = new Gold();
        boolean expResult = false;
        boolean result = instance.Backround(BLACK);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
