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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of setImg method, of class Player.
     */
    @Test
    public void testSetImg() {
        System.out.println("setImg");
        String path = "";
        Player instance = new Player();
        instance.setImg(path);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class Player.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        Player instance = new Player();
//        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of moveLeft method, of class Player.
     */
    @Test
    public void testMoveLeft() {
        System.out.println("moveLeft");
        Player instance = new Player();
        instance.moveLeft();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of moveRight method, of class Player.
     */
    @Test
    public void testMoveRight() {
        System.out.println("moveRight");
        Player instance = new Player();
        instance.moveRight();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of moveUp method, of class Player.
     */
    @Test
    public void testMoveUp() {
        System.out.println("moveUp");
        Player instance = new Player();
        instance.moveUp();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of moveDown method, of class Player.
     */
    @Test
    public void testMoveDown() {
        System.out.println("moveDown");
        Player instance = new Player();
        instance.moveDown();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isBackgroundSet method, of class Player.
     */
    @Test
    public void testIsBackgroundSet() {
        System.out.println("isBackgroundSet");
        Color black = null;
        Player instance = new Player();
        boolean expResult = false;
      //  boolean result = instance.isBackgroundSet(black);
     //   assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Backround method, of class Player.
     */
    @Test
    public void testBackround() {
        System.out.println("Backround");
        Color BLACK = null;
        Player instance = new Player();
        boolean expResult = false;
       // boolean result = instance.Backround(BLACK);
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
