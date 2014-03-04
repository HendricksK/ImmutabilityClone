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
public final class PurchaseDevice {
    
    private String transaction;
    private String device;
    private int ID;
    private Double price;
    
    private PurchaseDevice(){};
    
    private PurchaseDevice(PurchaseDevice item){
        this.ID = item.ID;
        this.device = item.device;
        this.transaction = item.transaction;
        this.price = item.price;
    }
    
    private PurchaseDevice(Builder item){
        this.ID = item.ID;
        this.device = item.device;
        this.transaction = item.transaction;
        this.price = item.price;
    }
    
        public static class Builder{
            
            private String transaction;
            private String device;
            private int ID;
            private Double price;
            
            public Builder(String value){
                this.transaction = value;
            }

            public Builder setDevice(String device) {
                this.device = device;
                return this;
            }

            public Builder setID(int ID) {
                this.ID = ID;
                return this;
            }
            
            public Builder setPrice(Double price){
                this.price = price;
                return this;
            }
            
            public Builder PurchaseDevice(PurchaseDevice item){
                this.device = item.device;
                this.ID = item.ID;
                this.price = item.price;
                return this;
            }
            
            public PurchaseDevice build(){
                return new PurchaseDevice(this);
            }

        }

    public String getTransaction() {
        return transaction;
    }

    public String getDevice() {
        return device;
    }

    public int getID() {
        return ID;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final PurchaseDevice other = (PurchaseDevice) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }
    
    
}
