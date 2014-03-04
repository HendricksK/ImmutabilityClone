/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability;

import cputgroup3a.immutability.model.Song;
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
public class SongTest {
    
    public SongTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public static void updateSong(){
        Song s = new Song.Builder(12)
                .setAlbum("Lie, Lie, Lie")
                .setName("Lie, Lie, Lie")
                .setTrack(3)
                .build();
        Assert.assertEquals(s.getAlbum(), "Lie, Lie, Lie");
        
        Song s1 = new Song.Builder(16)
                .Song(s)
                .setName("Angel")
                .build();
        
        Assert.assertEquals(s1.getName(), "Angel");
    }
    
    @Test
    public static void createSong(){
        Song s = new Song.Builder(12)
                .setAlbum("Lie, Lie, Lie")
                .setName("Lie, Lie, Lie")
                .setTrack(3)
                .build();
        
        Assert.assertEquals(s.getTrackNum(), 3);
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
