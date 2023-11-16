/*
Guia 13 = Aplicación Armadura IronMan
@author JimeM
 */
package services;

import entities.Armor;

public class Jarvis {

    private Armor ironman;

    public Jarvis() {
    }

    public Jarvis(Armor ironman) {
        this.ironman = ironman;
    }

    public void generalState() {
        System.out.println(ironman.toString());
    }

    public void batteryState() {
        System.out.println("100%");
    }
}
