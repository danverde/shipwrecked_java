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
public class Location implements Serializable{
    
    private int columnNumber;
    private int rowNumber;
    private boolean visited;
    private Scene scene;
    private Character[] character;

    public Location() {
    }

    public Character[] getCharacter() {
        return character;
    }

    public void setCharacter(Character[] character) {
        this.character = character;
    }
    
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
    
    
    public int getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.columnNumber;
        hash = 83 * hash + this.rowNumber;
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
        if (this.columnNumber != other.columnNumber) {
            return false;
        }
        if (this.rowNumber != other.rowNumber) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "columnNumber=" + columnNumber + ", rowNumber=" + rowNumber + ", visited=" + visited + '}';
    }
    
    
    
    
}
