/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShipwreckPackage;

import java.io.Serializable;
import java.util.Objects;
        
/**
 *
 * @author Daniel
 */
public class Item implements Serializable{
    //class instance variables
    private int quantity;
    private String itemType;

    public Item() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.quantity;
        hash = 89 * hash + Objects.hashCode(this.itemType);
        return hash;
    }

    @Override
    public String toString() {
        return "Item{" + "quantity=" + quantity + ", itemType=" + itemType + '}';
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
        final Item other = (Item) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }
       
    
}
