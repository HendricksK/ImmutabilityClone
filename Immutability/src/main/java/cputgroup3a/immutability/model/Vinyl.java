/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kurvin
 */
public final class Vinyl {
    private String album;
    private String artist;
    private int ID;
    private List<Song> songList = new ArrayList();
    
    private Vinyl(){};
    
    private Vinyl(Vinyl item){
        this.album = item.album;
        this.artist = item.artist;
        this.ID = item.ID;
    }
    
    private Vinyl(Builder item){
        this.album = item.album;
        this.artist = item.artist;
        this.ID = item.ID;
    }
    
        public static class Builder{
            private String album;
            private String artist;
            private int ID;
            private List<Song> songList = new ArrayList();
            
            public Builder(int ID){
                this.ID = ID;
            }

        public Builder setAlbum(String album) {
            this.album = album;
            return this;
        }

        public Builder setArtist(String artist) {
            this.artist = artist;
            return this;
        }

        public Builder setSongList(List<Song> songList) {
            this.songList = songList;
            return this;
        }
      
        
        public Builder Vinyl(Vinyl item){
            this.album = item.album;
            this.artist = item.artist;
            this.songList = item.songList;
            return this;
        }
            
        public Vinyl build(){
            return new Vinyl(this);
        }    
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public int getID() {
        return ID;
    }

    public List<Song> getSongList() {
        return songList;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vinyl other = (Vinyl) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }
    
    
}
