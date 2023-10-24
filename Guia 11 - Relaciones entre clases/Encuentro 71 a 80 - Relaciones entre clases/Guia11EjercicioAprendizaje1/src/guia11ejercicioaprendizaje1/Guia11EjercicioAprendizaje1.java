/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
@author JimeM
 */
package guia11ejercicioaprendizaje1;

import Entity.Dog;
import Entity.Person;

public class Guia11EjercicioAprendizaje1 {

    public static void main(String[] args) {

        Dog d1 = new Dog("Nala", "Cocker", 15, "Small");
        Dog d2 = new Dog("Coca", "Labrador", 13, "Medium");
        Dog d3 = new Dog("Milky", "Labrador", 1, "Big");
        Person p1 = new Person("Jimena", "Veliz", 66, 76947333, d1);
        Person p2 = new Person("Jime", "Matthies", 36, 166247985, d2);
        Person p3 = new Person("Adolfo", "Matthies", 61, 76974357, d3);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }

}
