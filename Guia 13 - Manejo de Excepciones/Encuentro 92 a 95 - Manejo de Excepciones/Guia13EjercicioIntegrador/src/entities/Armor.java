/*
Guia 13 = Aplicación Armadura IronMan
@author JimeM
 */
package entities;

import enums.DeviceType;
import enums.Intensity;
import java.util.ArrayList;
import java.util.List;

public class Armor {

    private String primaryColor; //red
    private String secondaryColor; //yellow
    private Integer hardness; //HRB (titanium = 80, Iron = 40)
    private Integer health; // 0-100%
    private Reactor reactor;
    private Device leftBoot;
    private Device rightBoot;
    private Device leftGlove;
    private Device rightGlove;
    private Device synthesizer;
    private Device console;

    private List<Device> devices;

    public Armor() {
        this.health = 100;
        this.createDevices();
        this.devices = new ArrayList();
        this.devices.add(this.leftBoot);
        this.devices.add(this.rightBoot);
        this.devices.add(this.leftGlove);
        this.devices.add(this.rightGlove);
        this.devices.add(this.synthesizer);
        this.devices.add(this.console);
    }

    public Armor(String primaryColor, String secondaryColor, Integer hardness) {
        this();
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.hardness = hardness;
    }

    private void createDevices() {
        this.leftBoot = new Device("LEFT BOOT", DeviceType.BOOT, 3500f, false);
        this.rightBoot = new Device("RIGHT BOOT", DeviceType.BOOT, 3500f, false);
        this.leftGlove = new Device("LEFT GLOVE", DeviceType.GLOVE, 5000f, true);
        this.rightGlove = new Device("RIGHT GLOVE", DeviceType.GLOVE, 5000f, true);
        this.synthesizer = new Device("SYNTHESIZER", DeviceType.SYNTHESIZER, 2000f, false);
        this.console = new Device("CONSOLE", DeviceType.CONSOLE, 1500f, false);
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public Integer getHardness() {
        return hardness;
    }

    public void setHardness(Integer hardness) {
        this.hardness = hardness;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Reactor getReactor() {
        return reactor;
    }

    public void setReactor(Reactor reactor) {
        this.reactor = reactor;
    }

    public Device getLeftBoot() {
        return leftBoot;
    }

    public void setLeftBoot(Device leftBoot) {
        this.leftBoot = leftBoot;
    }

    public Device getRightBoot() {
        return rightBoot;
    }

    public void setRightBoot(Device rightBoot) {
        this.rightBoot = rightBoot;
    }

    public Device getLeftGlove() {
        return leftGlove;
    }

    public void setLeftGlove(Device leftGlove) {
        this.leftGlove = leftGlove;
    }

    public Device getRightGlove() {
        return rightGlove;
    }

    public void setRightGlove(Device rightGlove) {
        this.rightGlove = rightGlove;
    }

    public Device getSynthesizer() {
        return synthesizer;
    }

    public void setSynthesizer(Device synthesizer) {
        this.synthesizer = synthesizer;
    }

    public Device getConsole() {
        return console;
    }

    public void setConsole(Device console) {
        this.console = console;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
    
    public void walk(Integer time) {
        this.reactor.useBattery(this.leftBoot.use(Intensity.BASIC, time));
        this.reactor.useBattery(this.rightBoot.use(Intensity.BASIC, time));
    }

    public void run(Integer time) {
        this.reactor.useBattery(this.leftBoot.use(Intensity.NORMAL, time));
        this.reactor.useBattery(this.rightBoot.use(Intensity.NORMAL, time));
    }

    public void propeller(Integer time) {
        this.reactor.useBattery(this.leftBoot.use(Intensity.INTENSIVE, time));
        this.reactor.useBattery(this.leftBoot.use(Intensity.INTENSIVE, time));
    }

    public void fly(Integer time) {
        this.propeller(time);
        this.reactor.useBattery(this.leftGlove.use(Intensity.NORMAL, time));
        this.reactor.useBattery(this.rightGlove.use(Intensity.NORMAL, time));
    }

    public void attack(Integer time) {
        this.reactor.useBattery(this.leftGlove.use(Intensity.INTENSIVE, time));
        this.reactor.useBattery(this.rightGlove.use(Intensity.INTENSIVE, time));
    }

    public void write() {
        this.reactor.useBattery(this.console.use(Intensity.BASIC, 1));
    }

    public void talk(Integer time) {
        this.reactor.useBattery(this.synthesizer.use(Intensity.BASIC, time));
    }

    @Override
    public String toString() {
        return "Armor{" + "primaryColor=" + primaryColor + ", secondaryColor=" + secondaryColor + ", hardness=" + hardness + ", health=" + health + ", reactor=" + reactor + ", leftBoot=" + leftBoot + ", rightBoot=" + rightBoot + ", leftGlove=" + leftGlove + ", rightGlove=" + rightGlove + ", synthesizer=" + synthesizer + ", console=" + console + ", devices=" + devices + '}';
    }

}