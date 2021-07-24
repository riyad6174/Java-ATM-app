/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Riyad
 */
public class DepositTest {
    
    public DepositTest() {
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
     * Test of getBalance method, of class Deposit.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Deposit instance = new Deposit();
        int expResult = 0;
        int result = instance.getBalance();
        assertEquals(0, result);
       
    }

    /**
     * Test of DepositMoney method, of class Deposit.
     */
    @Test
    public void testDepositMoney() {
        System.out.println("DepositMoney");
        int amount = 0;
        Deposit instance = new Deposit();
        instance.DepositMoney(amount);
        
    }

    /**
     * Test of AddDataToField method, of class Deposit.
     */
    @Test
    public void testAddDataToField() {
        System.out.println("AddDataToField");
        int balance = 0;
        Deposit instance = new Deposit();
        instance.AddDataToField(balance);
       
    }
    
}
