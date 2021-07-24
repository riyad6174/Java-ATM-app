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
public class TransferTest {
    
    public TransferTest() {
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
     * Test of TransferMoney method, of class Transfer.
     */
    @Test
    public void testTransferMoney() {
        System.out.println("TransferMoney");
        int transAmount = 0;
        Transfer instance = new Transfer();
        instance.TransferMoney(transAmount);
       
    }

    /**
     * Test of changeData method, of class Transfer.
     */
    @Test
    public void testChangeData() {
        System.out.println("changeData");
        int amnt = 0;
        Transfer instance = new Transfer();
        instance.changeData(amnt);
       
    }
    
}
