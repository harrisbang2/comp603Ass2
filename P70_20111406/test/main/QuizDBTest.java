/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author harri
 */
public class QuizDBTest {
    
    public QuizDBTest() {
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
     * Test of getConnection method, of class QuizDB.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        QuizDB instance = new QuizDB();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of establishConnection method, of class QuizDB.
     */
    @Test
    public void testEstablishConnection() {
        System.out.println("establishConnection");
        QuizDB instance = new QuizDB();
        instance.establishConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnections method, of class QuizDB.
     */
    @Test
    public void testCloseConnections() {
        System.out.println("closeConnections");
        QuizDB instance = new QuizDB();
        instance.closeConnections();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
