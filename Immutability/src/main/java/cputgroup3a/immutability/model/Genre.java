/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.immutability.model;

import java.util.Objects;

/**
 *
 * @author kurvin
 */
public final class Genre {
    
    private String name;
    private int ID;
    
    private Genre(){};
    
    private Genre(Builder item){
        name = item.name;
        ID = item.ID;
    }
    
    private Genre(Genre item){
        this.ID = item.ID;
        this.name = item.name;
    }
    
        public static class Builder{
            private String name;
            private int ID;

            public Builder(int value){
                this.ID = value;
            }

            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            public Builder Genre(Genre item){
                name = item.name;
                return this;
            }

            public Genre build(){
                return new Genre(this);
            }


        }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.name);
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
        final Genre other = (Genre) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}
