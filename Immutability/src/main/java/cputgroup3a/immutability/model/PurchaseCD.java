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
public final class PurchaseCD {
    
    private String transaction;
    private String album;
    private int ID;
    private Double price;
    
    private PurchaseCD(){};
    
    private PurchaseCD(PurchaseCD item){
        this.ID = item.ID;
        this.album = item.album;
        this.transaction = item.transaction;
        this.price = item.price;
    }
    
    private PurchaseCD(Builder item){
        this.ID = item.ID;
        this.album = item.album;
        this.transaction = item.transaction;
        this.price = item.price;
    }
    
        public static class Builder{
            
            private String transaction;
            private String album;
            private int ID;
            private Double price;
            
            public Builder(String value){
                this.transaction = value;
            }

            public Builder setAlbum(String album) {
                this.album = album;
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
            
            public Builder PurchaseCD(PurchaseCD item){
                this.album = item.album;
                this.ID = item.ID;
                this.price = item.price;
                return this;
            }
            
            public PurchaseCD build(){
                return new PurchaseCD(this);
            }

        }

    public String getTransaction() {
        return transaction;
    }

    public String getAlbum() {
        return album;
    }

    public int getID() {
        return ID;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.ID;
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
        final PurchaseCD other = (PurchaseCD) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }
    
    
}
