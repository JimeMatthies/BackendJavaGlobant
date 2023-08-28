/*
Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo" (En tipo, vamos 
a indicar si es un automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los 
métodos de moverse y frenar:
° Moverse: Es la cantidad de metros que avanzará por segundo.
° Frenar: Dejará de avanzar y se frenará 2 metros más adelante. 
En el caso de la bicicleta, se frenará y no avanzará más metros.

Referencias: 
° Un automóvil avanza 3 metros por segundo.
° Una motocicleta avanza 2 metros por segundo.
° Una bicicleta avanza 1 metro por segundo

Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es),
y mostrar por pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 
1 minuto. Luego mostrar que vehículo logró llegar más lejos luego de frenar, tras avanzar durante 
5 minutos, y cual fue la cantidad de metros que avanzó.
@author JimeM
 */
package Servicios;

import Entidades.Vehiculo;
import java.util.Scanner;

public class VehiculoServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Vehiculo crearVehiculo() {
        System.out.println("---------------------------------");
        System.out.println("Marca del vehículo:");
        String marca = SC.next();
        System.out.println("Modelo del vehículo:");
        String modelo = SC.next();
        System.out.println("Año del vehículo:");
        int anio = SC.nextInt();
        String tipo = "";
        int velocidad = 0;
        int opTipo = 0;
        while (opTipo > 3 || opTipo < 1) {
            System.out.println("Tipo del vehículo:"
                    + "\n1. Automóvil. "
                    + "\n2. Motocicleta. "
                    + "\n3. Bicicleta. ");
            opTipo = SC.nextInt();
        }
        switch (opTipo) {
            case 1:
                tipo = "Automóvil";
                velocidad = 3;
                System.out.println("Eligió la opción: " + opTipo);
                break;
            case 2:
                tipo = "Motocicleta";
                velocidad = 2;
                System.out.println("Eligió la opción: " + opTipo);
                break;
            case 3:
                tipo = "Bicicleta";
                velocidad = 1;
                System.out.println("Eligió la opción: " + opTipo);
                break;
        }

        return new Vehiculo(marca, modelo, anio, tipo, velocidad);
    }

    public void mostrarVehiculo(Vehiculo vv) {
        System.out.println("---------------------------------");
        System.out.println("Información del vehículo: ");
        System.out.println("Marca: " + vv.getMarca());
        System.out.println("Modelo: " + vv.getModelo());
        System.out.println("Año: " + vv.getAnio());
        System.out.println("Tipo: " + vv.getTipo());
        System.out.println("Velocidad: " + vv.getVelocidad() + " m/s.");
    }

    public void desplazarse(Vehiculo[] Vehiculos) {
        int distancia = Vehiculos[0].moverse(300) + Vehiculos[0].frenar();
        Vehiculo masRapido = Vehiculos[0];

        for (int i = 1; i < Vehiculos.length; i++) {
            if ((Vehiculos[i].moverse(300) + Vehiculos[i].frenar()) > distancia) {
                distancia = Vehiculos[i].moverse(300) + Vehiculos[i].frenar();
                masRapido = Vehiculos[i];
            }
        }

        System.out.println("\nDatos del Vehiculo que llegó más lejos: ");
        System.out.println(masRapido);
        System.out.println("Y se desplazó " + distancia + "metros en total. ");
    }
}
