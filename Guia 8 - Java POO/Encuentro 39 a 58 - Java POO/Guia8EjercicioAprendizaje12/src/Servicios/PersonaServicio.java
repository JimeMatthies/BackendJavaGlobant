/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
° Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
° Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
° Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
° Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
@author JimeM
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("---------------------------------");
        System.out.println("Nombre de la persona:");
        String nombre = SC.next();
        System.out.println("Año de nacimiento de la persona: (aaaa)");
        int anio = SC.nextInt();
        System.out.println("Mes de nacimiento de la persona: (mm)");
        int mes = SC.nextInt();
        System.out.println("Día de nacimiento de la persona: (dd)");
        int dia = SC.nextInt();
        Date nacimiento = new Date(anio - 1900, mes - 1, dia);

        return new Persona(nombre, nacimiento);
    }

    public void mostrarPersona(Persona pp) {
        System.out.println("---------------------------------");
        System.out.println("Información de la persona: ");
        System.out.println("Nombre: " + pp.getNombre());
        System.out.println("Fecha de Nacimiento: " + pp.getNacimiento());
    }

    public void calcularEdad(Persona pp) {
        System.out.println("---------------------------------");
        Date fechaActual = new Date();
        System.out.println("Edad de la persona: ");
        System.out.println(fechaActual.getYear() - pp.getNacimiento().getYear());
    }

    public boolean menorQue(int edad, Persona pp) {
        boolean esMenor = false;
        Date fechaActual = new Date();
        int edadPersona = fechaActual.getYear() - pp.getNacimiento().getYear();
        if (edadPersona > edad) {
            esMenor = true;
        }
        return esMenor;
    }

}
