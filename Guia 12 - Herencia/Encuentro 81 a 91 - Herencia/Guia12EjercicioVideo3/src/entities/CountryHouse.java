/*
Guia 12 = Aplicacion Estructuras (Video 4)
@author JimeM
 */
package entities;

public final class CountryHouse extends Structure {

    private boolean TreeHouse;

    public CountryHouse(boolean TreeHouse, Double totalArea) {
        super(totalArea);
        this.TreeHouse = TreeHouse;
    }

    public boolean isTreeHouse() {
        return TreeHouse;
    }

    public void setTreeHouse(boolean TreeHouse) {
        this.TreeHouse = TreeHouse;
    }

    public Double getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(Double coveredArea) {
        this.coveredArea = coveredArea;
    }

    public Double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(Double totalArea) {
        this.totalArea = totalArea;
    }
    
    @Override
    public void calculateCoveredArea(Double width, Double height) {
        this.coveredArea = width * height;
    }
    
}
