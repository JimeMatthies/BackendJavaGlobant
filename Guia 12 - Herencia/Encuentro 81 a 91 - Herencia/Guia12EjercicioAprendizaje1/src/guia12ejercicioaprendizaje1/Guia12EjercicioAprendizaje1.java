/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
@author JimeM
 */
package guia12ejercicioaprendizaje1;

import entities.Animal;
import entities.Cat;
import entities.Dog;
import entities.Horse;

public class Guia12EjercicioAprendizaje1 {

    public static void main(String[] args) {
        
        Animal d1 = new Dog("Nala", "Fideos", 13, "COCKER_SPANIEL");
        d1.feed();
        
        Animal d2 = new Dog("Coca", "Pollo", 13, "LABRADOR");
        d2.feed();
        
        Animal d3 = new Dog("Milky", "Apio", 1, "LABRADOR");
        d3.feed();
        
        Animal c1 = new Cat("Doja", "Tuna", 2, "BOMBAY");
        c1.feed();
        
        Animal h1 = new Horse("Bojack", "Grass", 10, "FRIESIAN");
        h1.feed();
        
    }
    
}
