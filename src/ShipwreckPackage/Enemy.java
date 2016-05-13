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
public class Enemy extends Character implements Serializable{
    //class instance variables
    private int meat;

    public Enemy() {
    }

    public int getMeat() {
        return meat;
    }

    public void setMeat(int meat) {
        this.meat = meat;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.meat;
        return hash;
    }

    @Override
    public String toString() {
        return "Enemy{" + super.toString() + "meat=" + meat + '}';
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
        final Enemy other = (Enemy) obj;
        if (this.meat != other.meat) {
            return false;
        }
        return true;
    }
        
    
}
