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
package guia8ejercicioactividadextra101;

import Entidades.Vehiculo;
import Servicios.VehiculoServicio;

public class Guia8EjercicioActividadExtra101 {

    public static void main(String[] args) {

        VehiculoServicio vs = new VehiculoServicio();
        Vehiculo[] Vehiculos = new Vehiculo[3];
        
        for (int i = 0; i < Vehiculos.length; i++) {
            Vehiculos[i] = vs.crearVehiculo();
            vs.mostrarVehiculo(Vehiculos[i]);

            System.out.println("Con 5s se desplazo: " + Vehiculos[i].moverse(5));
            System.out.println("Con 10s se desplazo: " + Vehiculos[i].moverse(10));
            System.out.println("Con 60s se desplazo: " + Vehiculos[i].moverse(60));
        }
        
        vs.desplazarse(Vehiculos);
    }

}
