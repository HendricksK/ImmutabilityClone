/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.DeviceSupplier;
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
public class DeviceSupplierTest {
    
    public DeviceSupplierTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public static void updateTest(){
        DeviceSupplier ds = new DeviceSupplier.Builder(789)
                .setProduct("Classic Handmade LP")
                .setPrice(1000.00)
                .setSupplier("Handmade Music Makers")
                .build();
        
        Assert.assertEquals(ds.getSupplier(), "Handmade Music Makers");
        
        DeviceSupplier ds1 = new DeviceSupplier.Builder(789)
                .DeviceSupplier(ds)
                .setProduct("Classic Handrcrafted Studio Monitors")
                .setPrice(1000.00)
                .setSupplier("Handmade Music Makers")
                .build();
        
        Assert.assertEquals(ds1.getProduct(), "Classic Handrcrafted Studio Monitors");
    }
    
    @Test
    public static void createTest(){
        DeviceSupplier ds = new DeviceSupplier.Builder(789)
                .setProduct("Classic Handmade LP")
                .setPrice(1000.00)
                .setSupplier("Handmade Music Makers")
                .build();
        
        Assert.assertEquals(ds.getSupplier(), "Handmade Music Makers");
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
