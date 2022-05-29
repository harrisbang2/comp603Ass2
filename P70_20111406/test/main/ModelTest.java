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
public class ModelTest {
    
    public ModelTest() {
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
     * Test of checkName method, of class Model.
     */
    @Test
    public void testCheckName() {
        System.out.println("checkName");
        String username = "";
        String password = "";
        Model instance = new Model();
        instance.checkName(username, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class Model.
     */
    @Test
    public void testRegister() throws Exception {
        System.out.println("register");
        String username = "";
        String password = "";
        Model instance = new Model();
        instance.register(username, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newQuestion method, of class Model.
     */
    @Test
    public void testNewQuestion() throws Exception {
        System.out.println("newQuestion");
        Model instance = new Model();
        instance.newQuestion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAnswer method, of class Model.
     */
    @Test
    public void testCheckAnswer() {
        System.out.println("checkAnswer");
        String answer = "";
        Model instance = new Model();
        instance.checkAnswer(answer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restartGame method, of class Model.
     */
    @Test
    public void testRestartGame() {
        System.out.println("restartGame");
        Model instance = new Model();
        instance.restartGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
