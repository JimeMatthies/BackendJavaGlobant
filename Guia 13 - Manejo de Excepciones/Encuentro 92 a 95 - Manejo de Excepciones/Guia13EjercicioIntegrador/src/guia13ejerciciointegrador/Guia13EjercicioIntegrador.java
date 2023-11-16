/*
Guia 13 = Aplicación Armadura IronMan
@author JimeM
 */
package guia13ejerciciointegrador;

import entities.Armor;
import services.Jarvis;

public class Guia13EjercicioIntegrador {

    public static void main(String[] args) {

        Jarvis jarvis = new Jarvis(new Armor("RED", "YELLOW", 40));
        jarvis.generalState();
        jarvis.batteryState();
        
    }

}
