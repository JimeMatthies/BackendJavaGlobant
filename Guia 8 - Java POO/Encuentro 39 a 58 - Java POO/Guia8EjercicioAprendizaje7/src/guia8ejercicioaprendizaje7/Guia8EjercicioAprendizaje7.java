/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
° Un constructor por defecto.
° Un constructor con todos los atributos como parámetro.
° Métodos getters y setters de cada atributo.
° Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona.
Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje.
° Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
° Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
@author JimeM
 */
package guia8ejercicioaprendizaje7;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Guia8EjercicioAprendizaje7 {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        //Persona p1 = ps.crearPersona();
        //ps.mostrarPersona(p1);

        Persona[] personas = new Persona[4];
        double[] IMCs = new double[4];
        boolean[] adultos = new boolean[4];

        personas[0] = ps.crearPersona("CL", 32, "M", 58, 1.62);
        personas[1] = ps.crearPersona("Dara", 38, "M", 40, 1.62);
        personas[2] = ps.crearPersona("Bom", 39, "M", 59, 1.65);
        personas[3] = ps.crearPersona("Minzy", 29, "M", 58, 1.62);

        for (int i = 0; i < personas.length; i++) {
            //personas[i] = ps.crearPersona();
            IMCs[i] = ps.calcularIMC(personas[i]);
            adultos[i] = ps.esMayorDeEdad(personas[i]);
        }

        toPrint(personas);
        contarIMC(IMCs);
        contarEDAD(adultos);
    }

    private static void toPrint(Persona[] personas) {
        System.out.println("---------------------------------");
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].toString());
        }
    }

    private static void contarIMC(double[] IMCs) {
        int debajo = 0, ideal = 0, sobre = 0;
        for (int i = 0; i < IMCs.length; i++) {
            if (IMCs[i] == -1) {
                debajo++;
            } else if (IMCs[i] == 0) {
                ideal++;
            } else {
                sobre++;
            }
        }
        System.out.println("---------------------------------");
        System.out.println("Personas debajo del peso ideal: " + debajo);
        System.out.println("Personas con peso ideal: " + ideal);
        System.out.println("Personas sobre el peso ideal : " + sobre);
    }

    private static void contarEDAD(boolean[] adultos) {
        int mayor = 0, menor = 0;
        for (int i = 0; i < adultos.length; i++) {
            if (adultos[i] == true) {
                mayor++;
            } else {
                menor++;
            }
        }
        System.out.println("---------------------------------");
        System.out.println("Personas mayor de edad: " + mayor);
        System.out.println("Personas menor de edad: " + menor);
    }
}
