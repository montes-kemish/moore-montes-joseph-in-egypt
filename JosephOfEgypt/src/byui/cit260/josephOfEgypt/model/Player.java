/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.josephOfEgypt.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author User
 */
public class Player implements Serializable {
    
    private String name;
    private double bestHarvest;

    public Player() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBestHarvest() {
        return bestHarvest;
    }

    public void setBestHarvest(double bestHarvest) {
        this.bestHarvest = bestHarvest;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.bestHarvest) ^ (Double.doubleToLongBits(this.bestHarvest) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bestHarvest) != Double.doubleToLongBits(other.bestHarvest)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestHarvest=" + bestHarvest + '}';
    }
    
    
    
    
    
    
    
}
