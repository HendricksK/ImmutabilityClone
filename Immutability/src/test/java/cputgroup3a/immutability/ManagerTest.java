/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.Manager;
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
public class ManagerTest {
    
    public ManagerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public static void updateTest(){
        Manager m = new Manager.Builder(789)
                .setName("Matthew Farrah")
                .build();
        
        Assert.assertEquals(m.getName(), "Matthew Farrah");
        
        Manager m1 = new Manager.Builder(159)
                .Manager(m)
                .setName("Maximilian Jehosefat")
                .build();
        
        Assert.assertEquals(m1.getName(), "Maximilian Jehosefat");
    }
    
    @Test
    public static void createTest(){
        Manager m = new Manager.Builder(147)
                .setName("Jesse James")
                .build();
        
        Assert.assertEquals(m.getName(), "Jesse James");
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
