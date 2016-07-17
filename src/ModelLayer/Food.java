/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelLayer;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jack
 */
public class Food implements Serializable  {
    private int quantiy;
    private String foodType;
    public int hungerFilled;

    public int getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getHungerFilled() {
        return hungerFilled;
    }

    public void setHungerFilled(int hungerFilled) {
        this.hungerFilled = hungerFilled;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.quantiy;
        hash = 73 * hash + Objects.hashCode(this.foodType);
        hash = 73 * hash + this.hungerFilled;
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
        final Food other = (Food) obj;
        if (this.quantiy != other.quantiy) {
            return false;
        }
        if (this.hungerFilled != other.hungerFilled) {
            return false;
        }
        if (!Objects.equals(this.foodType, other.foodType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Food{" + "quanitiy=" + quantiy + ", foodType=" + foodType + ", hungerFilled=" + hungerFilled + '}';
    }
    
    
}
