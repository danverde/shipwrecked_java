/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShipwreckPackage;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Jack
 */
public class ResourceScene implements Serializable{
    private String resourceType;
    private int resourceAmount;

    public ResourceScene() {
    }
    
    

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public int getResourceAmount() {
        return resourceAmount;
    }

    public void setResourceAmount(int resourceAmount) {
        this.resourceAmount = resourceAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.resourceType);
        hash = 37 * hash + this.resourceAmount;
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
        final ResourceScene other = (ResourceScene) obj;
        if (this.resourceAmount != other.resourceAmount) {
            return false;
        }
        if (!Objects.equals(this.resourceType, other.resourceType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResourceScene{" + "resourceType=" + resourceType + ", resourceAmount=" + resourceAmount + '}';
    }
    
    
    
    
}
