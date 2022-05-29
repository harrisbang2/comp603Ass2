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
public class QuizGetterTest {
    
    public QuizGetterTest() {
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
     * Test of getAns method, of class QuizGetter.
     */
    @Test
    public void testGetAns() {
        System.out.println("getAns");
        QuizGetter instance = new QuizGetter();
        int expResult = 1;
        int result = instance.getAns();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAns method, of class QuizGetter.
     */
    @Test
    public void testSetAns() {
        System.out.println("setAns");
        int ans = 0;
        QuizGetter instance = new QuizGetter();
        instance.setAns(ans);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestion method, of class QuizGetter.
     */
    @Test
    public void testGetQuestion() {
        System.out.println("getQuestion");
        QuizGetter instance = new QuizGetter();
        String expResult = "";
        String result = instance.getQuestion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestion method, of class QuizGetter.
     */
    @Test
    public void testSetQuestion() {
        System.out.println("setQuestion");
        String question = "";
        QuizGetter instance = new QuizGetter();
        instance.setQuestion(question);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnswer1 method, of class QuizGetter.
     */
    @Test
    public void testGetAnswer1() {
        System.out.println("getAnswer1");
        QuizGetter instance = new QuizGetter();
        String expResult = "";
        String result = instance.getAnswer1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnswer1 method, of class QuizGetter.
     */
    @Test
    public void testSetAnswer1() {
        System.out.println("setAnswer1");
        String answer1 = "";
        QuizGetter instance = new QuizGetter();
        instance.setAnswer1(answer1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnswer2 method, of class QuizGetter.
     */
    @Test
    public void testGetAnswer2() {
        System.out.println("getAnswer2");
        QuizGetter instance = new QuizGetter();
        String expResult = "";
        String result = instance.getAnswer2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnswer2 method, of class QuizGetter.
     */
    @Test
    public void testSetAnswer2() {
        System.out.println("setAnswer2");
        String answer2 = "";
        QuizGetter instance = new QuizGetter();
        instance.setAnswer2(answer2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class QuizGetter.
     */
   
    
}
