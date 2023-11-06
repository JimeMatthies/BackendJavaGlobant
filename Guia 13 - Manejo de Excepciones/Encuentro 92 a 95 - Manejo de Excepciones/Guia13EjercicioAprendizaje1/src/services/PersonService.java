/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
@author JimeM
 */
package services;

import entities.Person;
import java.util.Scanner;

public class PersonService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Person createPerson() {
        System.out.println("---------------------------------");
        System.out.println("Person's name:");
        String name = SC.next().toUpperCase();
        System.out.println("Person's age:");
        Integer age = SC.nextInt();
        String gender;
        do {
            System.out.println("Person Gender: F/M");
            gender = SC.next().toUpperCase();
            if (!(gender.equals("F") || gender.equals("M"))) {
                System.out.println("Wrong option. Enter valid gender");
            }
        } while (!(gender.equals("F") || gender.equals("M")));
        System.out.println("Person's weight:");
        Double weight = SC.nextDouble();
        System.out.println("Person's height:");
        Double height = SC.nextDouble();

        return new Person(name, age, gender, weight, height);
    }

    public void mostrarPersona(Person pp) {
        System.out.println("---------------------------------");
        System.out.println("Person's Info: ");
        System.out.println("Name: " + pp.getName());
        System.out.println("Age: " + pp.getAge());
        System.out.println("Gender: " + pp.getGender());
        System.out.println("weight: " + pp.getWeight());
        System.out.println("Height: " + pp.getHeight());
    }

    public Double calculateIMC(Person pp) {
        Double imc = pp.getWeight()/ (pp.getHeight()* pp.getHeight());
        Double result;
        System.out.println("---------------------------------");
        if (imc < 20) {
            System.out.println("(CALCULATE IMC) Under weight");
            result = -1d;
        } else if (imc <= 25) {
            System.out.println("(CALCULATE IMC) Ideal weight");
            result = 0d;
        } else {
            System.out.println("(CALCULATE IMC) Over weight");
            result = 1d;
        }
        return result;
    }

    public boolean isAdult(Person pp) {
        boolean adult = false;
        if (pp.getAge()>= 18) {
            adult = true;
        }
        return adult;
    }

}
