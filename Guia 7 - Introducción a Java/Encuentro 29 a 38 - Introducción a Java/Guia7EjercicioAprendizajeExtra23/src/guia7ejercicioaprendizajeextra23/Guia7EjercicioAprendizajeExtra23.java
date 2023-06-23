/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
@author JimeM
*/
package guia7ejercicioaprendizajeextra23;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra23 {

    public static void main(String[] args) {
        String palabras[] = new String[5];
        String matriz[][] = new String[20][20];
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = " ";
            }
        }
        
        LeerPalabras(palabras);
        LlenarMatriz(palabras, matriz);
        ImprimirMatriz(matriz);
    }

    public static void LeerPalabras(String[] palabras) {
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println((i+1) + "° Palabra: (3 y 5 caracteres)");
                palabras[i] = leer.next();
            } while (palabras[i].length() > 5 || palabras[i].length() < 3);
        }
    }

    public static void LlenarMatriz(String[] palabras, String[][] matriz) {
        for (int i = 0; i < 5; i++) {
            boolean ocupada = false;
            int filaRandom, columnaRandom;
            do {
                filaRandom = (int) (Math.random() * 20 - 1);
                columnaRandom = (int) (Math.random() * 16 - 1);
                for (int j = 0; j < 20; j++) {
                    if (!matriz[filaRandom][j].equals(" ")) {
                        ocupada = true;
                        break;
                    } else {
                        ocupada = false;
                    }
                }
            } while (ocupada);
            for (int j = columnaRandom; j < columnaRandom + palabras[i].length(); j++) {
                matriz[filaRandom][j] = palabras[i].toUpperCase().substring(j - columnaRandom, (j - columnaRandom) + 1);
            }
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j].equals(" ")) {
                    matriz[i][j] =  Integer.toString((int) (Math.random() * 9));
                }
            }
        }
    }

    public static void ImprimirMatriz(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}