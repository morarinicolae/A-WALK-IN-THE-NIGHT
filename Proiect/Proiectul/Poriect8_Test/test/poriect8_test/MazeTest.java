/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poriect8_test;

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
public class MazeTest {
    
    public MazeTest() {
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
     * Test of main method, of class Maze.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Maze.main(args);
     
    }
    @Test
    public void testLoadMap() {
        System.out.println("loadMap");
        String str = "";
        Maze instance = null;
    }
    
}
