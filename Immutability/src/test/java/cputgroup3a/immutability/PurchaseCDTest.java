/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.PurchaseCD;
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
public class PurchaseCDTest {
    
    public PurchaseCDTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public static void updateTest(){
        PurchaseCD pc = new PurchaseCD.Builder("card456")
                .setAlbum("Meglomaniac")
                .setID(78)
                .setPrice(129.99)
                .build();
        
        Assert.assertEquals(pc.getPrice(), 129.99);
        
        PurchaseCD pc1 = new PurchaseCD.Builder("card456")
                .PurchaseCD(pc)
                .setAlbum("Stairway To Heaven")
                .setID(78)
                .setPrice(300.56)
                .build();
        
        Assert.assertEquals(pc1.getPrice(), 300.56);
        Assert.assertEquals(pc1.getAlbum(), "Stairway To Heaven");
        
    }
    
    @Test
    public static void createTest(){
        PurchaseCD pc = new PurchaseCD.Builder("card456")
                .setAlbum("Meglomaniac")
                .setID(78)
                .setPrice(129.99)
                .build();
        
        Assert.assertEquals(pc.getPrice(), 129.99);
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
