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
public class Cashier {
    
    private String Name;
    private int ID;
    
    private Cashier(){};
    
    private Cashier(Cashier item){
        this.Name = item.Name;
        this.ID = item.ID;
    }
    
    private Cashier(Builder item){
        this.Name = item.Name;
        this.ID = item.ID;
    }
    
    public static class Builder{
        private String Name;
        private int ID;
        
        public Builder(int ID){
            this.ID = ID;
        }
        
        public Builder setName(String value){
            this.Name = value;
            return this;
        }
        
        public Builder Cashier(Cashier item){
            this.Name = item.Name;
            return this;
        }
        
        public Cashier build(){
            return new Cashier(this);
        }
    }

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.ID;
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
        final Cashier other = (Cashier) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }
    
    
}
