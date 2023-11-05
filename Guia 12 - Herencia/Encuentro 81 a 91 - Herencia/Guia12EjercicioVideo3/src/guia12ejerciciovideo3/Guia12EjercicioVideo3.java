/*
Guia 12 = Aplicacion Estructuras (Video 4)
@author JimeM
 */
package guia12ejerciciovideo3;

import entities.Building;
import entities.CountryHouse;
import entities.Structure;

public class Guia12EjercicioVideo3 {

    public static void main(String[] args) {

        Building s1 = new Building(4, 300d);
        s1.calculateCoveredArea(10d, 30d);
        System.out.println("Covered Area = " + s1.getCoveredArea() + " mt2.");
        
        CountryHouse s2 = new CountryHouse(true, 1000d);
        s2.calculateCoveredArea(10d, 30d);
        System.out.println("Covered Area = " + s2.getCoveredArea() + " mt2.");
    }

}
