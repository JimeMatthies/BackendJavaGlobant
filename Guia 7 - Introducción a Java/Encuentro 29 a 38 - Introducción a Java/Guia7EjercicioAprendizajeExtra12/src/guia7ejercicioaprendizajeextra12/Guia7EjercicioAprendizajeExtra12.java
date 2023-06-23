/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
@author JimeM
*/
package guia7ejercicioaprendizajeextra12;

public class Guia7EjercicioAprendizajeExtra12 {

    public static void main(String[] args) {
        String x, y, z;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i == 3) {
                        x = "E";
                    } else {
                        x = Integer.toString(i);
                    }
                    if (j == 3) {
                        y = "E";
                    } else {
                        y = Integer.toString(j);
                    }
                    if (k == 3) {
                        z = "E";
                    } else {
                        z = Integer.toString(k);
                    }
                    System.out.println(x + " - " + y + " - " + z);
                }
            }
        }
    }
    
}
