/*
Guia 13 = Aplicación Armadura IronMan
@author JimeM
 */
package entities;

public class Reactor {

    private final Float maxBattery = Float.MAX_VALUE;
    private Float battery;

    public Reactor() {
        this.battery = this.maxBattery;
    }

    public Float getMaxBattery() {
        return maxBattery;
    }

    public Float getBattery() {
        return battery;
    }

    public void setBattery(Float battery) {
        this.battery = battery;
    }

    public void useBattery(Float consume) {
        this.battery -= consume;
    }

}
