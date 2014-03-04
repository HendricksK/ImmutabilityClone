/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.Vinyl;
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
public class VinylTest {
    
    public VinylTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public static void testUpdate(){
        Vinyl v = new Vinyl.Builder(89)
                .build();
        
        Assert.assertEquals(v.getID(), 89);
        
        Vinyl v1 = new Vinyl.Builder(69)
                .Vinyl(v)
                .setArtist("The Manhattans")
                .build();
        
        Assert.assertEquals(v1.getArtist(), "The Manhattans");
    }
    
    @Test
    public static void testCreate(){
        Vinyl v = new Vinyl.Builder(123)
                .build();
        
        Assert.assertEquals(v.getID(), 123);
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
