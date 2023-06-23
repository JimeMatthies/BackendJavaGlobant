/*
Ejemplo Video 3 = Funciones.
@author JimeM
*/
package guia7ejerciciovideo5;

import java.util.Scanner;

public class Guia7EjercicioVideo5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resultado = suma(10,5);
        System.out.println(resultado);     
        SaludoPersonalizado("Jimena");     
        String nombre = leer.next();
        SaludoPersonalizado(nombre);     
        SaludoPersonalizado(leer.next());
    }
    
    public static int suma(int a, int b){
        int c = a + b;
        return c;
    }
    
    public static void SaludoPersonalizado(String nombre){
        System.out.println("Hola " + nombre + ", como estas?");
    }
    
}
