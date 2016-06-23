/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelLayer;

import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class Inventory implements Serializable{
    //class instance variables
    private int size;
    private Character character;

    public Inventory() {
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.size;
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "size=" + size + '}';
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
        final Inventory other = (Inventory) obj;
        if (this.size != other.size) {
            return false;
        }
        return true;
    }
        
    
}
