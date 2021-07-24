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
public class CreateAccountTest {
    
    public CreateAccountTest() {
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

   
    @Test
    public void testCreateFolder() {
      
        CreateAccount instance = new CreateAccount();
        instance.CreateFolder();
      
    }

    
    @Test
    public void testReadFile() {
       
        CreateAccount instance = new CreateAccount();
        instance.readFile();
     
    }

    
    @Test
    public void testAddData() throws Exception {
        System.out.println("addData");
        String accTextField = "100001";
        String passTextField = "1111";
        String nameTextField = "riyad";
        String TypeTextField = "saving";
        String finalTextField = "5";
        CreateAccount instance = new CreateAccount();
        instance.addData(accTextField, passTextField, nameTextField, TypeTextField, finalTextField);
      
    }

   
    @Test
    public void testLogic() {
        System.out.println("logic");
        String accTextField = "100001";
        String passTextField = "1111";
        String nameTextField = "riyad";
        String TypeTextField = "saving";
        String finalTextField = "5";
        CreateAccount instance = new CreateAccount();
        instance.logic(accTextField, passTextField, nameTextField, TypeTextField, finalTextField);
       
    }

   
    @Test
    public void testCountLines() {
        System.out.println("countLines");
        CreateAccount instance = new CreateAccount();
        instance.countLines();
       
    }
    
}
