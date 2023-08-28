/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
° Un constructor por defecto.
° Un constructor con todos los atributos como parámetro.
° Métodos getters y setters de cada atributo.
° Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
° Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
@author JimeM
 */
package Servicios;

import Entidades.Movil;
import java.util.Scanner;

public class MovilServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Movil crearMovil() {

        System.out.println("---------------------------------");
        System.out.println("Marca del móvil:");
        String marca = SC.next();
        System.out.println("Precio del móvil:");
        int precio = SC.nextInt();
        System.out.println("Modelo del móvil:");
        String tipo = SC.next();
        System.out.println("Memoria RAM del móvil:");
        int memoriaRam = SC.nextInt();
        System.out.println("Almacenamiento del móvil:");
        int almacenamiento = SC.nextInt();
        System.out.println("Codigo del móvil:");
        int[] codigo = ingresarCodigo();

        return new Movil(marca, precio, tipo, memoriaRam, almacenamiento, codigo);
    }

    public void mostrarMovil(Movil mm) {
        System.out.println("---------------------------------");
        System.out.println("Información del móvil: ");
        System.out.println("Marca: " + mm.getMarca());
        System.out.println("Precio: " + mm.getPrecio());
        System.out.println("Modelo: " + mm.getModelo());
        System.out.println("Memoria RAM: " + mm.getMemoriaRam());
        System.out.println("Almacenamiento: " + mm.getAlmacenamiento());
        System.out.print("Codigo: ");
        int[] codigo = mm.getCodigo();
        for (int i = 0; i < codigo.length; i++) {
            System.out.print(codigo[i]);
        }
        System.out.println("");
    }

    public int[] ingresarCodigo() {
        int[] codigo = new int[7];
        int digitos = 0;
        int size = 0;
        String cadena = "";
        do {
            System.out.println("Ingrese el código de 7 digitos");
            digitos = SC.nextInt();
            cadena = String.valueOf(digitos);
            size = cadena.length();
        } while (size != 7);
        
        for (int i = 0; i < codigo.length; i++) {
            codigo[i] = Integer.parseInt(cadena.substring(i, i+1));
        }
        return codigo;
    }
}
