package ShipwreckPackage;

import java.io.Serializable;
import java.util.Objects;

/******************
 * @author Daniel
 ********************/
public class Character implements Serializable {
    
    //class instance variables
    private String type;
    private int health;
    private int coordinates;
    private int attack;
    private int defense;
    private int hunger;

    public Character() {
    }
  
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.type);
        hash = 43 * hash + this.health;
        hash = 43 * hash + this.coordinates;
        hash = 43 * hash + this.attack;
        hash = 43 * hash + this.defense;
        hash = 43 * hash + this.hunger;
        return hash;
    }

    @Override
    public String toString() {
        return "Character{" + "type=" + type + ", health=" + health + ", coordinates=" + coordinates + ", attack=" + attack + ", defense=" + defense + ", hunger=" + hunger + '}';
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
        final Character other = (Character) obj;
        if (this.health != other.health) {
            return false;
        }
        if (this.coordinates != other.coordinates) {
            return false;
        }
        if (this.attack != other.attack) {
            return false;
        }
        if (this.defense != other.defense) {
            return false;
        }
        if (this.hunger != other.hunger) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    
}
