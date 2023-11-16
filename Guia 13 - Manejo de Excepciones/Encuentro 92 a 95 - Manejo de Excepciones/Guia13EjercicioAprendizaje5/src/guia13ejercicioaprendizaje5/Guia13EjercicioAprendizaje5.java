/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
@author JimeM
 */
package guia13ejercicioaprendizaje5;

import java.util.Scanner;

public class Guia13EjercicioAprendizaje5 {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in).useDelimiter("\n");
        System.out.println("GAME: Guess the number between 1 and 500");
        int num = (int) (Math.random() * 499 + 1);
        int input = 0, counter = 0;
        do {
            System.out.println("Enter a number: ");
            try {
                input = Integer.parseInt(SC.next());
                if (input > num) {
                    System.out.println("You were wrong. The real number is lower");
                } else if (input < num) {
                    System.out.println("You were wrong. The real number is higher");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Cannot turn your input into a number");
            } finally {
                System.out.println("Try again");
            }
            counter++;
            System.out.println("Attempts = " + counter);
        } while (num != input);
        System.out.println("You won! You guess the number " + num + " in " + counter + " tries");
    }
       
}