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
public class AccountTest {
    
    public AccountTest() {
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
     * Test of getCurrentScore method, of class Account.
     */
    @Test
    public void testGetCurrentScore() {
        System.out.println("getCurrentScore");
        Account instance = new Account();
        int expResult = 0;
        int result = instance.getCurrentScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentScore method, of class Account.
     */
    @Test
    public void testSetCurrentScore() {
        System.out.println("setCurrentScore");
        int currentScore = 0;
        Account instance = new Account();
        instance.setCurrentScore(currentScore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNum1 method, of class Account.
     */
    @Test
    public void testGetNum1() {
        System.out.println("getNum1");
        Account instance = new Account();
        int expResult = 0;
        int result = instance.getNum1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNum1 method, of class Account.
     */
    @Test
    public void testSetNum1() {
        System.out.println("setNum1");
        int num1 = 0;
        Account instance = new Account();
        instance.setNum1(num1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAns method, of class Account.
     */
    @Test
    public void testGetAns() {
        System.out.println("getAns");
        Account instance = new Account();
        int expResult = 0;
        int result = instance.getAns();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAns method, of class Account.
     */
    @Test
    public void testSetAns() {
        System.out.println("setAns");
        int ans = 0;
        Account instance = new Account();
        instance.setAns(ans);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQ method, of class Account.
     */
    @Test
    public void testGetQ() {
        System.out.println("getQ");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getQ();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQ method, of class Account.
     */
    @Test
    public void testSetQ() {
        System.out.println("setQ");
        String q = "";
        Account instance = new Account();
        instance.setQ(q);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getA method, of class Account.
     */
    @Test
    public void testGetA() {
        System.out.println("getA");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setA method, of class Account.
     */
    @Test
    public void testSetA() {
        System.out.println("setA");
        String a = "";
        Account instance = new Account();
        instance.setA(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getA2 method, of class Account.
     */
    @Test
    public void testGetA2() {
        System.out.println("getA2");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getA2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setA2 method, of class Account.
     */
    @Test
    public void testSetA2() {
        System.out.println("setA2");
        String a2 = "";
        Account instance = new Account();
        instance.setA2(a2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isQuitFlag method, of class Account.
     */
    @Test
    public void testIsQuitFlag() {
        System.out.println("isQuitFlag");
        Account instance = new Account();
        boolean expResult = false;
        boolean result = instance.isQuitFlag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuitFlag method, of class Account.
     */
    @Test
    public void testSetQuitFlag() {
        System.out.println("setQuitFlag");
        boolean quitFlag = false;
        Account instance = new Account();
        instance.setQuitFlag(quitFlag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isChecker method, of class Account.
     */
    @Test
    public void testIsChecker() {
        System.out.println("isChecker");
        Account instance = new Account();
        boolean expResult = false;
        boolean result = instance.isChecker();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChecker method, of class Account.
     */
    @Test
    public void testSetChecker() {
        System.out.println("setChecker");
        boolean Checker = false;
        Account instance = new Account();
        instance.setChecker(Checker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
