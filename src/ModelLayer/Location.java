/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelLayer;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jack
 */
public class Location implements Serializable{
    
    public int column;
    public int row;
    public boolean visited;
    private Scene scene;
    public ArrayList<Character> character;

    public Location() {
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int columnNumber) {
        this.column = columnNumber;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int rowNumber) {
        this.row = rowNumber;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
        public ArrayList<Character> getCharacter() {
        return character;
    }

    public void setCharacter(ArrayList<Character> character) {
        this.character = character;
    }
    
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.column;
        hash = 83 * hash + this.row;
        hash = 83 * hash + (this.visited ? 1 : 0);
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
        final Location other = (Location) obj;
        if (this.column != other.column) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "column=" + column + ", row=" + row + ", visited=" + visited + '}';
    }
    
    
    
    
}
