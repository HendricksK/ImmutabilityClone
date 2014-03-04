/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.CD;
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
public class CDTest {
    
    public CDTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public static void testUpdate(){
        CD c = new CD.Builder(70)
                .build();
        
        Assert.assertEquals(c.getID(), 70);
        
        CD c1 = new CD.Builder(69)
                .CD(c)
                .setArtist("Ellie Golding")
                .build();
        
        Assert.assertEquals(c1.getArtist(), "Ellie Golding");
    }
    
    @Test
    public static void testCreate(){
        CD c = new CD.Builder(70)
                .build();
        
        Assert.assertEquals(c.getID(), 70);
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
