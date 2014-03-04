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
public final class Artist {
    
    private String alias;
    private String names;
    private int ID;
    
    private Artist(){};
    
    private Artist(Builder item){
        names = item.names;
        ID = item.ID;
        alias = item.alias;
    }
    
    private Artist(Artist item){
        this.names = item.names;
        this.ID = item.ID;
        this.alias = item.alias;
    }

    public String getAlias() {
        return alias;
    }

    public String getNames() {
        return names;
    }

    public int getID() {
        return ID;
    }
    
    
    
        public static class Builder{
            private String alias;
            private String names;
            private int ID;

            public Builder(int value){
                this.ID = value;
            }

            public Builder setName(String value) {
                this.names = value;
                return this;
            }

            public Builder setAlias(String alias) {
                this.alias = alias;
                return this;
            }
            
            public Builder Artist(Artist item){
                names = item.names;
                alias = item.alias;
                return this;
            }

            public Artist build(){
                return new Artist(this);
            }


        }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.alias);
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
        final Artist other = (Artist) obj;
        if (!Objects.equals(this.alias, other.alias)) {
            return false;
        }
        return true;
    }
        
    
}
