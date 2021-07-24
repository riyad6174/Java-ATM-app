/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
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
public class WithdrawTest {
    
    public WithdrawTest() {
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
     * Test of withrawMoney method, of class Withdraw.
     */
    @Test
    public void testWithrawMoney() {
       
        
        Balance balance = new Balance();
        balance.DepositMoney(900);
        balance.withrawMoney(500);
        Assert.assertEquals(400, balance.getBalance());
        
    }

    /**
     * Test of changeData method, of class Withdraw.
     */
    @Test
    public void testChangeData() {
       
        int amnt = 0;
        Withdraw instance = new Withdraw();
        instance.changeData(amnt);
      
    }
    
}
