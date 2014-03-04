/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.ProductBuyer;
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
public class ProductBuyerTest {
    
    public ProductBuyerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public static void updateTest(){
        ProductBuyer pb = new ProductBuyer.Builder(789)
                .setName("Matthew Farrah")
                .build();
        
        Assert.assertEquals(pb.getName(), "Matthew Farrah");
        
        ProductBuyer pb1 = new ProductBuyer.Builder(159)
                .ProductBuyer(pb)
                .setName("Steve Jobs")
                .build();
        
        Assert.assertEquals(pb1.getName(), "Steve Jobs");
    }
    
    @Test
    public static void createTest(){
        ProductBuyer pb = new ProductBuyer.Builder(789)
                .setName("Matthew Farrah")
                .build();
        
        Assert.assertEquals(pb.getName(), "Matthew Farrah");
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
