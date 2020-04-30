package ModelLayer;

import java.io.Serializable;

/******************
 * @author Daniel
 ********************/
public class Character implements Serializable {
    
    //class instance variables
    private String name;
    private int health;
    private int attack;
    private int defense;
    private int hunger;
    private Inventory inventory;
    private Location location;
    private Game[] game;
    private Player [] player;

    public Character() {
    }

    public Character(int meat) {
      
    }
    
    public Player[] getPlayer() {
        return player;
    }

    public void setPlayer(Player[] player) {
        this.player = player;
    }
    
    
    public Inventory getInventory() {
        return inventory;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }
    
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.health;
        hash = 43 * hash + this.attack;
        hash = 43 * hash + this.defense;
        hash = 43 * hash + this.hunger;
        return hash;
    }

    @Override
    public String toString() {
        return "Character{"+ ", health=" + health + ", attack=" + attack + ", defense=" + defense + ", hunger=" + hunger + '}';
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
        if (this.attack != other.attack) {
            return false;
        }
        if (this.defense != other.defense) {
            return false;
        }
        if (this.hunger != other.hunger) {
            return false;
        }
        return true;
    }
    
    
}
