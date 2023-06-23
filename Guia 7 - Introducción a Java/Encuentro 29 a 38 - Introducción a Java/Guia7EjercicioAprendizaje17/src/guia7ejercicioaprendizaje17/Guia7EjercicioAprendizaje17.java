/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
@author JimeM
*/
package guia7ejercicioaprendizaje17;

import java.util.Random;
import java.util.Scanner;

public class Guia7EjercicioAprendizaje17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        int[] vector = new int[N];

        for (int i = 0; i < N; i++) {
            vector[i] = random.nextInt(99999);
        }
        
        DigitsCounter(vector, N);
    }

    public static void DigitsCounter(int[] vector, int N) {
        int oneD = 0;
        int twoD = 0;
        int threeD = 0;
        int fourD = 0;
        int fiveD = 0;

        for (int i = 0; i < N; i++) {
            if (vector[i] == 0) {
                oneD++;
            } else {
                int counter = 0;
                for (int j = Math.abs(vector[i]); j > 0; j /= 10) {
                    counter++;
                }
                switch (counter) {
                    case 1:
                        oneD++;
                        break;
                    case 2:
                        twoD++;
                        break;
                    case 3:
                        threeD++;
                        break;
                    case 4:
                        fourD++;
                        break;
                    case 5:
                        fiveD++;
                        break;
                }
            }
        }
        
        System.out.println("Numeros con 1 digito: " + oneD);
        System.out.println("Numeros con 2 digito: " + twoD);
        System.out.println("Numeros con 3 digito: " + threeD);
        System.out.println("Numeros con 4 digito: " + fourD);
        System.out.println("Numeros con 5 digito: " + fiveD);
    }
    
}
