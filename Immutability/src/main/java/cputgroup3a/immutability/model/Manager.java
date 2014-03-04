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
public final class Manager {
    
    private String Name;
    private int ID;
    
    private Manager(){};
    
    private Manager(Manager item){
        this.Name = item.Name;
        this.ID = item.ID;
    }
    
    private Manager(Builder item){
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
        
        public Builder Manager(Manager item){
            this.Name = item.Name;
            return this;
        }
        
        public Manager build(){
            return new Manager(this);
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
        hash = 97 * hash + this.ID;
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
        final Manager other = (Manager) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }
    
    
}
