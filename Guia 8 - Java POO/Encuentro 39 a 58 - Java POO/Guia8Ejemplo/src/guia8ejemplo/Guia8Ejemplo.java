/*
Guia 8 = Ejemplo
@author JimeM
 */
package guia8ejemplo;

import Entidad.Persona;
import Servicios.PersonaServicio;

public class Guia8Ejemplo {

    public static void main(String[] args) {
               
        Persona p1 = new Persona();
        Persona p2 = new Persona("Jimena Matthies", 35, 'F');
        
        System.out.println("1° " + p1);
        System.out.println("2° " + p2);
        
        p1.setNombre("Rosa Carrera");
        
        System.out.println("1° Persona Nombre: " + p1.nombre);
        System.out.println("2° Persona Nombre: " + p2.nombre);
        
        PersonaServicio ps = new PersonaServicio();
        
        ps.mostrarPersona(p1);
        ps.mostrarPersona(p2);
        
    }

}
