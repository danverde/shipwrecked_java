/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShipwreckPackage;
import java.io.Serializable;

/**
 *
 * @author Jack
 */
public class Map implements Serializable{
    
    private int columnCount;
    private int rowCount;

    public Map() {
    }
    
    

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.columnCount;
        hash = 89 * hash + this.rowCount;
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
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.rowCount != other.rowCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "columnCount=" + columnCount + ", rowCount=" + rowCount + '}';
    }
    
    
    
}
