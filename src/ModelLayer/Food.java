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
    private int quanitiy;
    private String foodType;
    private int hungerFilled;

    public int getQuanitiy() {
        return quanitiy;
    }

    public void setQuanitiy(int quanitiy) {
        this.quanitiy = quanitiy;
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
        hash = 73 * hash + this.quanitiy;
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
        if (this.quanitiy != other.quanitiy) {
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
        return "Food{" + "quanitiy=" + quanitiy + ", foodType=" + foodType + ", hungerFilled=" + hungerFilled + '}';
    }
    
    
}
