/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.PurchaseDevice;
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
public class PurchaseDeviceTest {
    
    public PurchaseDeviceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public static void updateTest(){
        PurchaseDevice pd = new PurchaseDevice.Builder("card456")
                .setDevice("Sony Mp3 Player")
                .setID(78)
                .setPrice(899.95)
                .build();
        
        Assert.assertEquals(pd.getPrice(), 899.95);
        
        PurchaseDevice pd1 = new PurchaseDevice.Builder("card456")
                .PurchaseDevice(pd)
                .setDevice("Classic LP Record Player")
                .setID(78)
                .setPrice(1450.95)
                .build();
        
        Assert.assertEquals(pd1.getPrice(), 1450.95);
        Assert.assertEquals(pd1.getDevice(), "Classic LP Record Player");
        
    }
    
    @Test
    public static void createTest(){
        PurchaseDevice pd = new PurchaseDevice.Builder("card456")
                .setDevice("Sony Mp3 Player")
                .setID(78)
                .setPrice(899.95)
                .build();
        
        Assert.assertEquals(pd.getPrice(), 899.95);
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
