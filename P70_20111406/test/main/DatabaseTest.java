/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
public class DatabaseTest {
    
    public DatabaseTest() {
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
     * Test of dbsetup method, of class Database.
     */
    @Test
    public void testDbsetup() {
        System.out.println("dbsetup");
        Database instance = new Database();
        instance.dbsetup();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkName method, of class Database.
     */
    @Test
    public void testCheckName() {
        System.out.println("checkName");
        String username = "";
        String password = "";
        Database instance = new Database();
        Account expResult = null;
        Account result = instance.checkName(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class Database.
     */
    @Test
    public void testRegister() throws Exception {
        System.out.println("register");
        String username = "";
        String password = "";
        Database instance = new Database();
        Account expResult = null;
        Account result = instance.register(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SaveGame method, of class Database.
     */
    @Test
    public void testSaveGame() {
        System.out.println("SaveGame");
        int score = 0;
        String username = "";
        Database instance = new Database();
        instance.SaveGame(score, username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
