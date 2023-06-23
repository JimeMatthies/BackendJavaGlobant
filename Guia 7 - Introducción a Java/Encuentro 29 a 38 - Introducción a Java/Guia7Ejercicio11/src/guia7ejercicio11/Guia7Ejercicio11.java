/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada
de la siguiente manera: cada vocal se reemplaza por el carácter que se indica 
en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la 
codificación correspondiente. Utilice la estructura “según” para la 
transformación. Por ejemplo, si el usuario ingresa: 
"Ayer, lunes, salimos a las once y 10."
La salida del programa debería ser: 
"@y#r, l*n#s, s@l$m%s @ l@s %nc# y 10."
@author JimeM
*/
package guia7ejercicio11;

import java.util.Scanner;

public class Guia7Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String text = leer.nextLine();
        String newtext = ChangeVocals(text);
        System.out.println(newtext);
    }
    
    public static String ChangeVocals (String text) {   
        text = text.toLowerCase().replace("a", "@");
        text = text.toLowerCase().replace("e", "#");
        text = text.toLowerCase().replace("i", "$");
        text = text.toLowerCase().replace("o", "%");
        text = text.toLowerCase().replace("u", "*");     
        return text;  
    }
    
}