/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
° Constructores, tanto el vacío como el parametrizado.
° Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
° Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
° Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
° Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
° Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
° Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
@author JimeM
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearAhorcado() {
        System.out.println("---------------------------------");
        System.out.println("Ingrese la palabra a buscar:");
        String palabraSecreta = SC.next();
        int longitud = palabraSecreta.length();
        String[] palabra = new String[longitud];
        for (int i = 0; i < longitud; i++) {
            palabra[i] = palabraSecreta.toUpperCase().substring(i, i + 1);
        }
        System.out.println("Intentos máximos del juego:");
        int intentos = SC.nextInt();

        return new Ahorcado(palabra, intentos);
    }

    public void mostrarAhorcado(Ahorcado aa) {
        System.out.println("---------------------------------");
        System.out.println("Información del juego: ");
        System.out.print("Palabra: ");
        String[] palabra = aa.getPalabra();
        for (String letra : palabra) {
            System.out.print(letra);
        }
        System.out.println("");
        System.out.println("Intentos: " + aa.getIntentos());
        System.out.println("Letras Encontradas: " + aa.getEncontradas());
    }

    public void longitudPalabra(Ahorcado aa) {
        System.out.print("Longitud de la palabra: ");
        System.out.println(aa.getPalabra().length);
        ;
    }

    public boolean buscarLetra(Ahorcado aa) {
        System.out.println("---------------------------------");
        System.out.println("Escriba la letra a buscar:");
        String ll = SC.next().toUpperCase();
        boolean encontrada = false;
        if (aa.getEncontradas().contains(ll)) {
            System.out.println("La letra " + ll + " ya se intentó");
        } else {
            for (String letra : aa.getPalabra()) {
                if (ll.toUpperCase().equals(letra)) {
                    aa.setEncontradas(aa.getEncontradas() + ll.toUpperCase());
                    encontrada = true;
                }
            }
        }
        return encontrada;
    }

    public void intentosAhorcado(Ahorcado aa) {
        aa.setIntentos(aa.getIntentos() - 1);
        System.out.println("Intentos restantes: " + aa.getIntentos());
    }

    public void juegoAhorcado(Ahorcado aa) {
        System.out.println("---------------------------------");
        System.out.println("¡BIENVENIDO AL JUEGO DE AHORCADO!");
        do {
            if (!buscarLetra(aa)) {
                longitudPalabra(aa);
                System.out.println("¡La letra no se encontro!"); 
                System.out.print("Letras encontradas hasta ahora: ");
                System.out.println(aa.getEncontradas());
                intentosAhorcado(aa);
                if (aa.getIntentos() == 0) {
                    System.out.println("Se acabaron los intentos");
                    mostrarAhorcado(aa);
                }
            } else {
                longitudPalabra(aa);
                System.out.println("¡La letra se encontro!");
                System.out.print("Letras encontradas hasta ahora: ");
                System.out.println(aa.getEncontradas());
                System.out.println("Intentos restantes: " + aa.getIntentos());
            }
        } while (aa.getIntentos() > 0 && !comprobar(aa));
    }

    public boolean comprobar(Ahorcado aa) {
        String ll = aa.getEncontradas();
        for (String letra : aa.getPalabra()) {
            if (!ll.contains(letra)) {
                return false;
            }
        }
        System.out.println("¡TODAS LAS LETRAS FUERON ENCONTRADAS!");
        mostrarAhorcado(aa);
        return true;
    }
}
