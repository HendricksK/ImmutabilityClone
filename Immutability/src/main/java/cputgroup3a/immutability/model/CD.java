/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability.model;

/**
 *
 * @author kurvin
 */
public class CD {
    private String album;
    private String artist;
    private int ID;
    
    private CD(){};
    
    private CD(CD item){
        this.album = item.album;
        this.artist = item.artist;
        this.ID = item.ID;
    }
    
    private CD(Builder item){
        this.album = item.album;
        this.artist = item.artist;
        this.ID = item.ID;
    }
    
        public static class Builder{
            private String album;
            private String artist;
            private int ID;
            
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
        
        public Builder CD(CD item){
            this.album = item.album;
            this.artist = item.artist;
            return this;
        }
            
        public CD build(){
            return new CD(this);
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
        
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.ID;
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
        final CD other = (CD) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }
        
        
}
