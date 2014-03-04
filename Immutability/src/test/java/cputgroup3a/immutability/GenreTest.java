/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.Genre.Builder;
import cputgroup3a.immutability.model.Genre;
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
public class GenreTest {
    
    public GenreTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public static void testUpdate(){
        Genre g = new Genre.Builder(10)
                .setName("Metal Core")
                .build();
        
        Assert.assertEquals(g.getID(), 10);
        
        Genre g1 = new Genre.Builder(12)
                .Genre(g)
                .setName("Metal")
                .build();
        
        System.out.println("" + g1.getID());
        Assert.assertEquals(g1.getID(), 12);
        Assert.assertEquals(g1.getName(), "Metal");
    }
    
    @Test
    public static void testCreate(){
        Genre g = new Genre.Builder(10)
                .setName("Metal Core")
                .build();
        
        Assert.assertEquals(g.getID(), 10);
        Assert.assertEquals(g.getName(), "Metal Core");
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
