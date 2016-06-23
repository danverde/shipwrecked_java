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
 * @author Daniel
 */
public class Weather implements Serializable{
    //class instance variables
    private double weatherDuration;
    private String weatherType;
    private Game[] game;

    public Weather() {
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }
    
    public double getWeatherDuration() {
        return weatherDuration;
    }

    public void setWeatherDuration(double weatherDuration) {
        this.weatherDuration = weatherDuration;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.weatherDuration) ^ (Double.doubleToLongBits(this.weatherDuration) >>> 32));
        hash = 19 * hash + Objects.hashCode(this.weatherType);
        return hash;
    }

    @Override
    public String toString() {
        return "Weather{" + "weatherDuration=" + weatherDuration + ", weatherType=" + weatherType + '}';
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
        final Weather other = (Weather) obj;
        if (Double.doubleToLongBits(this.weatherDuration) != Double.doubleToLongBits(other.weatherDuration)) {
            return false;
        }
        if (!Objects.equals(this.weatherType, other.weatherType)) {
            return false;
        }
        return true;
    }
    
    
}
