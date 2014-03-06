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
public final class Album {
    private String name;
    private int ID;
    private List<Song> songs = new ArrayList();
    
    private Album(){};
    
    private Album(Album item){
        this.name = item.name;
        this.ID = item.ID;
    }
    
    private Album(Builder item){
        this.name = item.name;
        this.ID = item.ID;
    }
    
    public static class Builder{
            private String name;
            private int ID;
            private List<Song> songs = new ArrayList();

            public Builder(int value){
                this.ID = value;
            }

            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            public Builder Album(Album item){
                name = item.name;
                return this;
            }

            public Album build(){
                return new Album(this);
            }

            public Builder setSongs(List<Song> songs) {
                this.songs = songs;
                return this;
            }
            
        }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.ID;
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
        final Album other = (Album) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }
    
    
}
