/*
Ejemplo Video 2 = Calificación película. (Encuesta Condicionales)
@author JimeM
*/
package guia7ejerciciovideo2;

import java.util.Scanner;

public class Guia7EjercicioVideo2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Califique la pelicula de 1 a 5 estrellas");
        int opinion = leer.nextInt();
        if (opinion >= 1 && opinion <=5){
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados de que no hayas disfrutado la película.");
                    break;
                case 3:
                    System.out.println("Has clasificado la película como buena");
                    break;
                case 4:
                    System.out.println("Has clasificado la película como muy buena");
                    break;
                case 5:
                    System.out.println("Fantastico que hayas disfrutado de un buen entretenimiento!");
                    break;
            }
        } else if (opinion < 0){
            System.out.println("¿Una opinion negativa? ¿Tan mala fué la película?");
        } else if (opinion == 0){
            System.out.println("El valor " + opinion + " no es válido y no se tomará en cuenta");
        } else {
            System.out.println(opinion + ": Wow! Se te fue la mano con la calificación!");
        }
        System.out.println("Hasta la próxima!");
    }
    
}
