/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.Cheque;
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
public class ChequeTest {
    
    public ChequeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public static void updateTest(){
        Cheque ch = new Cheque.Builder("cheque145")
                .setID(753)
                .build();
        Assert.assertEquals(ch.getTransaction(), "cheque145");
        
        Cheque ch1 = new Cheque.Builder("cheque890")
                .Cheque(ch)
                .setID(89)
                .build();
        
        Assert.assertEquals(ch1.getID(), 89);
    }
    
    @Test
    public static void createTest(){
        Cheque ch = new Cheque.Builder("cheque456")
                .setID(753)
                .build();
        Assert.assertEquals(ch.getTransaction(), "cheque456");
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
