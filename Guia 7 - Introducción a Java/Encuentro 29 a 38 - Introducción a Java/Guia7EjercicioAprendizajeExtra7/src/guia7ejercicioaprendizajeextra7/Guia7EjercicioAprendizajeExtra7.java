/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
@author JimeM
*/
package guia7ejercicioaprendizajeextra7;

import java.util.Scanner;

public class Guia7EjercicioAprendizajeExtra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una cantidad de numeros: ");
        int n = leer.nextInt();
        System.out.println("Eliga una version:");
        System.out.println("1.- While");
        System.out.println("2.- Do - While");
        int version = leer.nextInt();
        if ( version == 1){
            version1(n);
        }else{
            version2(n);
        }
    }

    public static void version1 (int n){
        Scanner leer = new Scanner(System.in);
        int max, min, i, num;
        double promedio;
        System.out.print("Ingrese un numero: ");
        num = leer.nextInt();
        max = num;
        min = num;
        i = 1;
        promedio = num;
        
        while (i < n){
            System.out.print("Ingrese un numero: ");
            num = leer.nextInt();
            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
            promedio += num;
            i++;
        }
        
        System.out.println("Número Maximo: " + max);
        System.out.println("Número Minimo: " + min);
        System.out.println("Promedio: " + (promedio/n));
    }

    public static void version2(int n){
        Scanner leer = new Scanner(System.in);
        int max, min, i, num;
        double promedio = 0;
        i = 0;
        max = 0;
        min = 0;
        
        do {
            System.out.print("Ingrese un numero: ");
            num = leer.nextInt();
            if ((i == 0)||(num < min)){
                min = num;
            }
            if ((i == 0)||(num > max)){
                max = num;
            }
            promedio += num;
            i++;
        }while (i < n);
        
        System.out.println("Número Maximo: " + max);
        System.out.println("Número Minimo: " + min);
        System.out.println("Promedio: " + (promedio/n));
    }
    
}