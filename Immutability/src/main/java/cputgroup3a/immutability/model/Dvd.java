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
public final class Dvd {
    private String album;
    private String artist;
    private int ID;
    private List<Song> playList = new ArrayList();
    
    private Dvd(){};
    
    private Dvd(Dvd item){
        this.album = item.album;
        this.artist = item.artist;
        this.ID = item.ID;
    }
    
    private Dvd(Builder item){
        this.album = item.album;
        this.artist = item.artist;
        this.ID = item.ID;
    }
    
        public static class Builder{
            private String album;
            private String artist;
            private int ID;
            private List<Song> playList = new ArrayList();
            
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

        public Builder setPlayList(List<Song> playList) {
            this.playList = playList;
            return this;
        }
        
        public Builder Dvd(Dvd item){
            this.album = item.album;
            this.artist = item.artist;
            return this;
        }
            
        public Dvd build(){
            return new Dvd(this);
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

    public List<Song> getPlayList() {
        return playList;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.ID;
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
        final Dvd other = (Dvd) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }
    
    
}
