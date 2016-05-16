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
    private boolean attractShip;
    private boolean burning;

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

    public boolean isAttractShip() {
        return attractShip;
    }

    public void setAttractShip(boolean attractShip) {
        this.attractShip = attractShip;
    }

    public boolean isBurning() {
        return burning;
    }

    public void setBurning(boolean burning) {
        this.burning = burning;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.burnTime) ^ (Double.doubleToLongBits(this.burnTime) >>> 32));
        hash = 97 * hash + this.woodAmount;
        hash = 97 * hash + (this.attractShip ? 1 : 0);
        hash = 97 * hash + (this.burning ? 1 : 0);
        return hash;
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
        if (this.attractShip != other.attractShip) {
            return false;
        }
        if (this.burning != other.burning) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fire{" + "burnTime=" + burnTime + ", woodAmount=" + woodAmount + ", attractShip=" + attractShip + ", burning=" + burning + '}';
    }
    
    
    
    
}
