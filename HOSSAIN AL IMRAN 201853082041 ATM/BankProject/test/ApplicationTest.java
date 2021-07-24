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
public class ApplicationTest {
    
    public ApplicationTest() {
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
     * Test of CreateFolder method, of class Application.
     */
    @Test
    public void testCreateFolder() {
        
        Application instance = new Application();
        instance.CreateFolder();
      
    }

    /**
     * Test of readFile method, of class Application.
     */
    @Test
    public void testReadFile() {
       
        Application instance = new Application();
        instance.readFile();
      
    }

    /**
     * Test of logic method, of class Application.
     */
    @Test
    public void testLogic() {
       
        String user = "100001";
        String pass = "1111";
        Application instance = new Application();
        instance.logic(user, pass);
    
    }

    /**
     * Test of countLines method, of class Application.
     */
    @Test
    public void testCountLines() {
    
        Application instance = new Application();
        instance.countLines();
      
    }

    /**
     * Test of main method, of class Application.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Application.main(args);
     
    }
    
}
