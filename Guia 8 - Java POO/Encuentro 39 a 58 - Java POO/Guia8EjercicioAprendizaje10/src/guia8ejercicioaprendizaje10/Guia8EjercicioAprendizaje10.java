/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
@author JimeM
 */
package guia8ejercicioaprendizaje10;

import java.util.Arrays;

public class Guia8EjercicioAprendizaje10 {

    public static void main(String[] args) {
        double[] array50 = new double[50];
        double[] array20 = new double[20];
        
        llenar50(array50);
        imprimir(array50);
        ordenar50(array50);
        imprimir(array50);
        llenar20(array50, array20);
        imprimir(array20);
    }
    
    public static void llenar50(double[] array50){
        System.out.println("---------------------------------");
        System.out.println("ARRAY 50 LLENADO");
        System.out.println("---------------------------------");
        System.out.println(" ");
        for (int i = 0; i < array50.length; i++) {
            array50[i] = Math.random() * 98 + 1;
        }
    }
    
    public static void ordenar50(double[] array50){
        System.out.println("---------------------------------");
        System.out.println("ARRAY 50 ORDENADO");
        System.out.println("---------------------------------");
        System.out.println(" ");
        Arrays.sort(array50);
    }
     
    public static void llenar20(double[] array50, double[] array20){
        System.out.println("---------------------------------");
        System.out.println("ARRAY 20 LLENADO");
        System.out.println("---------------------------------");
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            array20[i] = array50[i];
        }
        Arrays.fill(array20, 10, 20, 0.5);
    }
    
    public static void imprimir(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");
        }
        System.out.println(" ");
    }
    
}
