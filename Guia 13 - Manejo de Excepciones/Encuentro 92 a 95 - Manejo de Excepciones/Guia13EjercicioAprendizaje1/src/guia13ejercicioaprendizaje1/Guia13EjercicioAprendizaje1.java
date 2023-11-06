/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
@author JimeM
 */
package guia13ejercicioaprendizaje1;

import entities.Person;
import services.PersonService;

public class Guia13EjercicioAprendizaje1 {

    public static void main(String[] args) {

        Person pp = null;
        PersonService ps = new PersonService();
        try {
            System.out.println(ps.isAdult(pp));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

}