/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.Cashier;
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
public class CashierTest {
    
    public CashierTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public static void updateTest(){
        Cashier c = new Cashier.Builder(789)
                .setName("Joseph McIntyre")
                .build();
        
        Assert.assertEquals(c.getName(), "Joseph McIntyre");
        
        Cashier c1 = new Cashier.Builder(159)
                .Cashier(c)
                .setName("Steve Jobs")
                .build();
        
        Assert.assertEquals(c1.getName(), "Steve Jobs");
    }
    
    @Test
    public static void createTest(){
        Cashier c = new Cashier.Builder(789)
                .setName("John McInfly")
                .build();
        
        Assert.assertEquals(c.getName(), "John McInfly");
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
