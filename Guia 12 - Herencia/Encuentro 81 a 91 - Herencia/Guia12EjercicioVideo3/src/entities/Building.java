/*
Guia 12 = Aplicacion Estructuras (Video 4)
@author JimeM
 */
package entities;

public final class Building extends Structure {
    
    private Integer floors;

    public Building(Integer floors, Double totalArea) {
        super(totalArea);
        this.floors = floors;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
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
        this.coveredArea = width * height * this.floors;
    }

}
