/*
Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
      todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
      los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
      tratamientos.
    o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
      real que represente el costo del tratamiento (previo al descuento) y determine el
      importe en efectivo a pagar por dicho socio.
@author JimeM
*/
package guia7ejercicioaprendizajeextra5;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese tipo de socio (A, B o C):");
        char socio = leer.next().charAt(0);
        System.out.print("Ingrese costo del tratamiento:");
        int costo = leer.nextInt();

        switch (socio) {
            case 'A':
                System.out.println("El costo del tratamiento con el descuento de un 50% es de " + costo * 0.5);
                break;
            case 'B':
                System.out.println("El costo del tratamiento con el descuento es un 35% es de " + costo * (1 - 0.35));
                break;
            case 'C':
                System.out.println("El costo del tratamiento no tiene descuento, por lo tanto su valor es de " + costo);
                break;
            default:
                System.out.println("Tipo de socio no válido");
        }
    }
    
}
