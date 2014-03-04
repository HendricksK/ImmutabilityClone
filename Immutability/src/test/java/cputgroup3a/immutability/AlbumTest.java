/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.Album;
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
public class AlbumTest {
    
    public AlbumTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public static void updateTest(){
        Album a = new Album.Builder(14)
                .setName("Toxicity")
                .build();
        
        Assert.assertEquals(a.getName(), "Toxicity");
        
        Album a1 = new Album.Builder(78)
                .Album(a)
                .setName("Acceptance Speech")
                .build();
        
        Assert.assertEquals(a1.getName(), "Acceptance Speech");
    }
    
    @Test
    public static void createTest(){
        Album a = new Album.Builder(14)
                .setName("Toxicity")
                .build();
        
        Assert.assertEquals(a.getName(), "Toxicity");
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
