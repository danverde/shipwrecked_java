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
public class Map implements Serializable{
    
    private int numCols;
    private int numRows;
    private Game[] game;
    public Location[][] locations;

    public Map(int numRows, int numCols) {
        
        if(numRows < 1 || numCols < 1)
        {
            System.out.println("Number of Rows & Columns must be greater than 1");
            return;
        }
        
        this.numRows = numRows;
        this.numCols = numCols;
        
        this.locations = new Location[numRows][numCols];
        
        for (int row = 0; row < numRows; row++){
            for (int col = 0; col < numCols; col++){
                Location location = new Location();
                location.setColumn(col);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][col] = location;
            }
        }
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    public int getNumCols() {
        return numCols;
    }

    public void setNumCols(int numCols) {
        this.numCols = numCols;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }
  
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.numCols;
        hash = 89 * hash + this.numRows;
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
        final Map other = (Map) obj;
        if (this.numCols != other.numCols) {
            return false;
        }
        if (this.numRows != other.numRows) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "columnCount=" + numCols + ", rowCount=" + numRows + '}';
    }
    
    
    
}
