/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.PurchaseVinyl;
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
public class PurchaseVinylTest {
    
    public PurchaseVinylTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public static void updateTest(){
        PurchaseVinyl pv = new PurchaseVinyl.Builder("card456")
                .setAlbum("21 Stones")
                .setID(78)
                .setPrice(129.99)
                .build();
        
        Assert.assertEquals(pv.getPrice(), 129.99);
        
        PurchaseVinyl pv1 = new PurchaseVinyl.Builder("card456")
                .PurchaseVinyl(pv)
                .setAlbum("Electric Ladyland")
                .setID(78)
                .setPrice(300.56)
                .build();
        
        Assert.assertEquals(pv1.getPrice(), 300.56);
        Assert.assertEquals(pv1.getAlbum(), "Electric Ladyland");
        
    }
    
    @Test
    public static void createTest(){
        PurchaseVinyl pv = new PurchaseVinyl.Builder("card456")
                .setAlbum("21 Stones")
                .setID(78)
                .setPrice(129.99)
                .build();
        
        Assert.assertEquals(pv.getPrice(), 129.99);
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
