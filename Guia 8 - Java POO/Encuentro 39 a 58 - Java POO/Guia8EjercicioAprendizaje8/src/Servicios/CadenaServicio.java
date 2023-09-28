/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
@author JimeM
 */
package Servicios;

import java.util.Scanner;
import Entidades.Cadena;

public class CadenaServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        System.out.println("---------------------------------");
        System.out.println("Ingrese Frase:");
        String frase = SC.next();
        int longitudFrase = frase.length();

        return new Cadena(frase, longitudFrase);
    }

    public void mostrarCadena(Cadena cc) {
        System.out.println("---------------------------------");
        System.out.println("Información de la cadena: ");
        System.out.println("Frase: " + cc.getFrase());
        System.out.println("Longitud de la cadena: " + cc.getLongitudFrase());
    }

    public void mostrarVocales(Cadena cc) {
        int contador = 0;
        String frase = cc.getFrase().toLowerCase();
        System.out.println("---------------------------------");
        for (int i = 0; i < cc.getLongitudFrase(); i++) {
            if (frase.substring(i, i + 1).contains("a") || frase.substring(i, i + 1).contains("e")
                    || frase.substring(i, i + 1).contains("i") || frase.substring(i, i + 1).contains("o")
                    || frase.substring(i, i + 1).contains("u")) {
                contador++;
            }
        }
        System.out.println("(MOSTRAR VOCALES) Numero de vocales encontradas: " + contador);
    }

    public void invertirFrase(Cadena cc) {
        StringBuilder invertida = new StringBuilder(cc.getFrase());
        System.out.println("---------------------------------");
        System.out.println("(INVERTIR FRASE) Frase Invertida: " + invertida.reverse().toString());
    }

    public void vecesRepetido(Cadena cc) {
        int contador = 0;
        System.out.println("---------------------------------");
        System.out.println("(VECES REPETIDO) Ingresa caracter a buscar: ");
        String letra = SC.next();
        String frase = cc.getFrase().toLowerCase();

        for (int i = 0; i < cc.getLongitudFrase(); i++) {
            if (frase.substring(i, i + 1).contains(letra)) {
                contador++;
            }
        }
        System.out.println("(VECES REPETIDO) La letra " + letra + " se encontro " + contador + " veces.");
    }

    public void compararLongitud(Cadena cc) {
        System.out.println("---------------------------------");
        System.out.println("(COMPARAR LONGITUD) 2da frase a comparar");
        String frase2 = SC.next();
        System.out.println(cc.getFrase().compareTo(frase2));
    }

    public void unirFrases(Cadena cc) {
        System.out.println("---------------------------------");
        System.out.println("(UNIR FRASES) 2da frase a uni");
        String frase2 = SC.next();
        System.out.println(cc.getFrase().concat(frase2));
    }

    public void reemplazar(Cadena cc) {
        System.out.println("---------------------------------");
        System.out.println("(REEMPLAZAR) Caracter de reemplazo");
        String caracter = SC.next();
        String nuevaFrase = "";
        for (int i = 0; i < cc.getLongitudFrase(); i++) {
            if (cc.getFrase().toLowerCase().substring(i, i + 1).equals("o")) {
                nuevaFrase = nuevaFrase.concat(caracter);
            } else {
                nuevaFrase = nuevaFrase.concat(cc.getFrase().substring(i, i + 1));
            }
        }
        System.out.println("(REEMPLAZAR) Frase obtenida con el nuevo caracter: ");
        System.out.println(nuevaFrase);
    }

    public void contiene(Cadena cc) {
        System.out.println("---------------------------------");
        System.out.println("(CONTIENE) Letra a buscar: ");
        String letra = SC.next();
        System.out.println("(CONTIENE) ¿Contiene la frase?: ");
        System.out.println(cc.getFrase().contains(letra));
    }
}