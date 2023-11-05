/*
Guia 12 = Aplicacion Estructuras (Video 4)
@author JimeM
 */
package entities;

public abstract class Structure {
    
    protected Double coveredArea;
    protected Double totalArea;
    
    public Structure(Double totalArea) {
        this.totalArea = totalArea;
    }
    
    public abstract void calculateCoveredArea(Double width, Double height);
}