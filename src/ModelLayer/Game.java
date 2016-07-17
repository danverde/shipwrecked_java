/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelLayer;

import java.io.Serializable;
/**
 *
 * @author Jack
 */
public class Game implements Serializable {
    private double time;
    private double bestTime;
    private Map map;
    private Player player;
    private Item[] items;
    private Food[] foodList;
    private Enemy[] enemy;
    public Scene[] scenes;

    public Game() {
    }

    

    public Enemy[] getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy[] enemy) {
        this.enemy = enemy;
    }

    public Food[] getFoodList() {
        return foodList;
    }

    public void setFoodList(Food[] foodList) {
        this.foodList = foodList;
    }
    

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }  
    
    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    public Scene[] getScenes() {
        return scenes;
    }

    public void setScenes(Scene[] scenes) {
        this.scenes = scenes;
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.time) ^ (Double.doubleToLongBits(this.time) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.time) != Double.doubleToLongBits(other.time)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "time=" + time + ", bestTime=" + bestTime + '}';
    }

 
}
