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
public final class Cashier {
    
    private String Name;
    private int ID;
    private List<PurchaseCD> cdPurchases = new ArrayList();
    private List<PurchaseDevice> devicePurchases = new ArrayList();
    private List<PurchaseDvd> dvdPurchases = new ArrayList();
    private List<PurchaseVinyl> vinylPurchases = new ArrayList();
    
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
        private List<PurchaseCD> cdPurchases = new ArrayList();
        private List<PurchaseDevice> devicePurchases = new ArrayList();
        private List<PurchaseDvd> dvdPurchases = new ArrayList();
        private List<PurchaseVinyl> vinylPurchases = new ArrayList();
        
        public Builder(int ID){
            this.ID = ID;
        }
        
        public Builder setName(String value){
            this.Name = value;
            return this;
        }

        public Builder setCdPurchases(List<PurchaseCD> cdPurchases) {
            this.cdPurchases = cdPurchases;
            return this;
        }

        public Builder setDevicePurchases(List<PurchaseDevice> devicePurchases) {
            this.devicePurchases = devicePurchases;
            return this;
        }

        public Builder setDvdPurchases(List<PurchaseDvd> dvdPurchases) {
            this.dvdPurchases = dvdPurchases;
            return this;
        }

        public Builder setVinylPurchases(List<PurchaseVinyl> vinylPurchases) {
            this.vinylPurchases = vinylPurchases;
            return this;
        }
        
        public Builder Cashier(Cashier item){
            this.Name = item.Name;
            this.cdPurchases = item.cdPurchases;
            this.devicePurchases = item.devicePurchases;
            this.dvdPurchases = item.dvdPurchases;
            this.vinylPurchases = item.vinylPurchases;
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

    public List<PurchaseCD> getCdPurchases() {
        return cdPurchases;
    }

    public List<PurchaseDevice> getDevicePurchases() {
        return devicePurchases;
    }

    public List<PurchaseDvd> getDvdPurchases() {
        return dvdPurchases;
    }

    public List<PurchaseVinyl> getVinylPurchases() {
        return vinylPurchases;
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
