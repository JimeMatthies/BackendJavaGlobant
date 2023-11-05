/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo.
La clase edificio tendrá como métodos:
° Método calcularSuperficie(): calcula la superficie del edificio.
° Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
° Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o Abierto, 
esta clase implementará los dos métodos abstractos y los atributos del padre.
° Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas por oficina y número de pisos. 
Esta clase implementará los dos métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el usuario dirá cuántas personas 
entran en cada oficina, cuantas oficinas y el número de piso (suponiendo que en cada piso hay una oficina). 
Crear el método cantPersonas(), que muestre cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener dos polideportivos y 
dos edificios de oficinas. Luego, recorrer este array y ejecutar los métodos calcularSuperficie y calcularVolumen 
en cada Edificio. Se deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son techados y cuantos abiertos. 
Y para la clase EdificioDeOficinas deberemos llamar al método cantPersonas() y mostrar los resultados de cada edificio 
de oficinas.
@author JimeM
 */
package guia12ejercicioaprendizajeextra2;

import entities.Building;
import entities.OfficeBuilding;
import entities.SportCenter;
import enums.InstallationType;
import java.util.ArrayList;
import java.util.List;
import services.BuildingService;

public class Guia12EjercicioAprendizajeExtra2 {

    public static void main(String[] args) {
        
        List<Building> buildings = new ArrayList();
        buildings.add(new SportCenter("Monumental", InstallationType.STADIUM, 50, 30, 100));
        buildings.add(new SportCenter("Movistar", InstallationType.ARENA, 60, 30, 70));
        buildings.add(new OfficeBuilding(15, 30, 15, 30, 65, 80));
        buildings.add(new OfficeBuilding(25, 40, 25, 50, 70, 90));

        BuildingService bs = new BuildingService();
        bs.countSportCenters(buildings);
        bs.showOfficeBuildings(buildings);
        bs.showSurfaceVolume(buildings);
    }
    
}
