/*
Guia 8 = Aplicación Mascotas (Videos 1 - 9)
@author JimeM
 */
package Servicios;

import java.util.Scanner;
import Entidades.Mascota;

public class MascotaServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Mascota crearMascota() {
        System.out.println("---------------------------------");
        System.out.println("Nombre de la mascota:");
        String nombre = SC.next();
        System.out.println("Apodo de la mascota:");
        String apodo = SC.next();
        System.out.println("Tipo de animal que es la mascota:");
        String tipo = SC.next();
        System.out.println("Raza de la mascota:");
        String raza = SC.next();
        System.out.println("Color de la mascota:");
        String color = SC.next();
        System.out.println("Edad de la mascota:");
        int edad = SC.nextInt();
        System.out.println("La mascota tiene cola? true/false");
        boolean cola = SC.nextBoolean();

        return new Mascota(nombre, apodo, tipo, raza, color, edad, cola);
    }

    public void mostrarMascota(Mascota mm) {
        System.out.println("---------------------------------");
        System.out.println("Información de la mascota: ");
        System.out.println("Nombre: " + mm.getNombre());
        System.out.println("Apodo: " + mm.getApodo());
        System.out.println("Tipo: " + mm.getTipo());
        System.out.println("Raza: " + mm.getRaza());
        System.out.println("Color: " + mm.getColor());
        System.out.println("Edad: " + mm.getEdad());
        System.out.println("Cola?: " + mm.isCola());
        System.out.println("Energía: " + mm.getEnergia());
    }
}
