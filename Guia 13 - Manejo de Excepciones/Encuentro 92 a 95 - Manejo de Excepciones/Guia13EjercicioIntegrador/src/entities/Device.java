/*
Guia 13 = Aplicación Armadura IronMan
@author JimeM
 */
package entities;

import enums.DeviceType;
import enums.Intensity;

public class Device {

    private String name;
    private DeviceType type;
    private Float energyConsumption;
    private Boolean weapon;
    private Boolean broken;
    private Boolean destroyed;

    public Device() {
        this.broken = false;
        this.destroyed = false;
    }

    public Device(String name, DeviceType type, Float energyConsumption, Boolean weapon) {
        this();
        this.name = name;
        this.type = type;
        this.energyConsumption = energyConsumption;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public Float getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(Float energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public Boolean getWeapon() {
        return weapon;
    }

    public void setWeapon(Boolean weapon) {
        this.weapon = weapon;
    }

    public Boolean getBroken() {
        return broken;
    }

    public void setBroken(Boolean broken) {
        this.broken = broken;
    }

    public Boolean getDestroyed() {
        return destroyed;
    }

    public void setDestroyed(Boolean destroyed) {
        this.destroyed = destroyed;
    }
    
    public Float use(Intensity intensity, Integer time) {
        this.takingDamage();
        return intensity.getFactor() * time * this.energyConsumption;
    }

    public void takingDamage() {
        this.broken = Math.random() <= 0.3;
    }

    public void repare() {
        this.broken = Math.random() <= 0.6;
        if (this.broken){
            this.destroy();
        }
    }

    public void destroy() {
        this.destroyed = Math.random() <= 0.3;
    }

    @Override
    public String toString() {
        return "Device{" + "name=" + name + ", type=" + type + ", energyConsumption=" + energyConsumption + ", weapon=" + weapon + ", broken=" + broken + ", destroyed=" + destroyed + '}';
    }

}
