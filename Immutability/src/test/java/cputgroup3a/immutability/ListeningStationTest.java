/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.ListeningStation;
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
public class ListeningStationTest {
    
    public ListeningStationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public static void testUpdate(){
        ListeningStation ls = new ListeningStation.Builder(456)
                .build();
        
        Assert.assertEquals(ls.getID(), 456);
        
        ListeningStation ls1 = new ListeningStation.Builder(69)
                .ListeningStation(ls)
                .setAlbum("Disarm The Decent")
                .build();
        
        Assert.assertEquals(ls1.getAlbum(), "Disarm The Decent");
    }
    
    @Test
    public static void testCreate(){
        ListeningStation ls = new ListeningStation.Builder(123)
                .build();
        
        Assert.assertEquals(ls.getID(), 123);
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
