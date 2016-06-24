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
public class Scene implements Serializable{
    private String description;
    private double TimeTravel;
    private boolean blockedLocation;
    private String displaySymbol;
    private Location [] location;

    public Scene() {
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }
    
    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTimeTravel() {
        return TimeTravel;
    }

    public void setTimeTravel(double TimeTravel) {
        this.TimeTravel = TimeTravel;
    }

    public boolean isBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(boolean blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.TimeTravel) ^ (Double.doubleToLongBits(this.TimeTravel) >>> 32));
        hash = 97 * hash + (this.blockedLocation ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.displaySymbol);
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
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.TimeTravel) != Double.doubleToLongBits(other.TimeTravel)) {
            return false;
        }
        if (this.blockedLocation != other.blockedLocation) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", TimeTravel=" + TimeTravel + ", blockedLocation=" + blockedLocation + ", displaySymbol=" + displaySymbol + '}';
    }
    
    
    
    
}
