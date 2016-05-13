/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShipwreckPackage;

import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class Fire extends Item implements Serializable{
    //class instance variables
    private double burnTime;
    private int woodAmount;

    public Fire() {
    }

    public double getBurnTime() {
        return burnTime;
    }

    public void setBurnTime(double burnTime) {
        this.burnTime = burnTime;
    }

    public int getWoodAmount() {
        return woodAmount;
    }

    public void setWoodAmount(int woodAmount) {
        this.woodAmount = woodAmount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.burnTime) ^ (Double.doubleToLongBits(this.burnTime) >>> 32));
        hash = 23 * hash + this.woodAmount;
        return hash;
    }

    @Override
    public String toString() {
        return "Fire{" + super.toString() + "burnTime=" + burnTime + ", woodAmount=" + woodAmount + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fire other = (Fire) obj;
        if (Double.doubleToLongBits(this.burnTime) != Double.doubleToLongBits(other.burnTime)) {
            return false;
        }
        if (this.woodAmount != other.woodAmount) {
            return false;
        }
        return true;
    }
        
    
}
