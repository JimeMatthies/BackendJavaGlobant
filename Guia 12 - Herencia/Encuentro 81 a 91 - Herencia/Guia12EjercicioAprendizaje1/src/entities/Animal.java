/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
@author JimeM
 */
package entities;

public abstract class Animal {
    
    protected String name;
    protected String food;
    protected Integer age;
    protected String breed;

    public Animal() {
    }

    public Animal(String name, String food, Integer age, String breed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.breed = breed;
    }
    
    public abstract void feed();
    
}