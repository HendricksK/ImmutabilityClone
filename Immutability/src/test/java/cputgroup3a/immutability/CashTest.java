/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.Cash;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author kurvin
 */
public class CashTest {
    
    public CashTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public static void updateTest(){
        Cash c = new Cash.Builder("cash145")
                .setID(753)
                .build();
        Assert.assertEquals(c.getTransaction(), "cash145");
        
        Cash c1 = new Cash.Builder("cash890")
                .Cash(c)
                .setID(89)
                .build();
        
        Assert.assertEquals(c1.getID(), 89);
    }
    
    @Test
    public static void createTest(){
        Cash c = new Cash.Builder("cash123")
                .setID(753)
                .build();
        Assert.assertEquals(c.getTransaction(), "cash123");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
