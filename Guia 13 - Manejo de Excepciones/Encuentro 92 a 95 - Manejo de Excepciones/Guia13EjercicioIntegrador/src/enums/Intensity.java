/*
Guia 13 = Aplicación Armadura IronMan
@author JimeM
 */
package enums;

public enum Intensity {
    BASIC(1), NORMAL(2), INTENSIVE(3);

    private Integer factor;

    Intensity(Integer factor) {
        this.factor = factor;
    }

    public Integer getFactor() {
        return factor;
    }
    
}
