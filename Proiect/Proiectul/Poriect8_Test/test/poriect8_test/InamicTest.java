/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poriect8_test;

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
public class InamicTest {
    
    public InamicTest() {
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
     * Test of isPressedR method, of class Inamic.
     */
    @Test
    public void testIsPressedR() {
        System.out.println("isPressedR");
        Inamic instance = new Inamic();
        boolean expResult = false;
        boolean result = instance.isPressedR();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsPressedR method, of class Inamic.
     */
    @Test
    public void testSetIsPressedR() {
        System.out.println("setIsPressedR");
        boolean isPressedR = false;
        Inamic instance = new Inamic();
        instance.setIsPressedR(isPressedR);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImg method, of class Inamic.
     */
    @Test
    public void testSetImg() {
        System.out.println("setImg");
        String path = "";
        Inamic instance = new Inamic();
        instance.setImg(path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class Inamic.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        Inamic instance = new Inamic();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePosition method, of class Inamic.
     */
    @Test
    public void testChangePosition() {
        System.out.println("changePosition");
        Inamic instance = new Inamic();
        instance.changePosition();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
