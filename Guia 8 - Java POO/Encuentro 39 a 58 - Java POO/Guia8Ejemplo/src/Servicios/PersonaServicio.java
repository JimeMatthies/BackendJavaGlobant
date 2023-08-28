/*
Guia 8 = Ejemplo
@author JimeM
 */
package Servicios;

import java.util.Scanner;
import Entidad.Persona;

public class PersonaServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public static Persona crearPersona() {
        System.out.println("---------------------------------");
        System.out.println("Nombre de la persona:");
        String nombre = SC.next();
        System.out.println("Edad de la persona:");
        int edad = SC.nextInt();
        System.out.println("Sexo de la persona:");
        char sexo = SC.next().charAt(0);

        return new Persona(nombre, edad, sexo);
    }

    public static void mostrarPersona(Persona pp) {
        System.out.println("---------------------------------");
        System.out.println("Información de la Persona: ");
        System.out.println("Nombre: " + pp.getNombre());
        System.out.println("Edad: " + pp.getEdad());
        System.out.println("Sexo: " + pp.getSexo());
    }
}
