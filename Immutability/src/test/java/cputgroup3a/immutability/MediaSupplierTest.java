/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.MediaSupplier;
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
public class MediaSupplierTest {
    
    public MediaSupplierTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public static void updateTest(){
        MediaSupplier ms = new MediaSupplier.Builder(789)
                .setProduct("Jay Z, Blue Magic")
                .setPrice(100.00)
                .setSupplier("Sony BMG")
                .build();
        
        Assert.assertEquals(ms.getSupplier(), "Sony BMG");
        
        MediaSupplier ms1 = new MediaSupplier.Builder(789)
                .MediaSupplier(ms)
                .setProduct("Blood Hound Gang")
                .setPrice(100.00)
                .setSupplier("Universal Music")
                .build();
        
        Assert.assertEquals(ms1.getProduct(), "Blood Hound Gang");
    }
    
    @Test
    public static void createTest(){
        MediaSupplier ms = new MediaSupplier.Builder(789)
                .setProduct("Jay Z, Blue Magic")
                .setPrice(100.00)
                .setSupplier("Sony BMG")
                .build();
        
        Assert.assertEquals(ms.getSupplier(), "Sony BMG");
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
