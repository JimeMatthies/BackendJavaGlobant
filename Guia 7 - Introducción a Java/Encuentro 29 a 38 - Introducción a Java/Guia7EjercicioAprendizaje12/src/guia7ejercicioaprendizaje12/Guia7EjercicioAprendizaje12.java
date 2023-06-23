/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
@author JimeM
*/
package guia7ejercicioaprendizaje12;

import java.util.Scanner;

public class Guia7EjercicioAprendizaje12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a RS232");
        String phrase;
        int rights = 0;
        int wrongs = 0;
        
        System.out.println("A continuación ingrese cadenas.");
        System.out.println("Para finalizar ingrese el FDE = &&&&&");
        
        do {
            System.out.println("Ingrese una frase");
            phrase = leer.nextLine();
            
            if (phrase.length() == 5  && phrase.substring(0,1).equals("X") && phrase.substring(4).equals("O")) {
                rights += 1;
            } else {
                if (!phrase.equals("&&&&&")){
                    wrongs += 1;
                }
            }
        } while (!"&&&&&".equals(phrase));
        
        System.out.println("Total cadenas correctas: " + rights);
        System.out.println("Total cadenas incorrectas: " + wrongs);
    }
    
}
