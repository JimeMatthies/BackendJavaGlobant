/*
Guia 12 = Aplicacion Dibujos (Video 5)
@author JimeM
 */
package guia12ejerciciovideo4;

import entities.Cat;
import entities.Dog;

public class Guia12EjercicioVideo4 {

    public static void main(String[] args) {
        
        Cat c = new Cat("BOMBAY", 4, true, 5, 1000d);
        Dog d = new Dog("LABRADOR", 4, true, 13, 1000d);
        
        c.calculateAge();
        c.makeNoise();
        c.purr();
        System.out.println("---------------------------------");
        d.calculateAge();
        d.makeNoise();
        d.playAtPark(4);
        
    }
    
}