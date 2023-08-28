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
package Servicios;

import java.util.Scanner;
import Entidades.Persona;

public class PersonaServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("---------------------------------");
        System.out.println("Nombre de la persona:");
        String nombre = SC.next();
        System.out.println("Edad de la persona:");
        int edad = SC.nextInt();
        String sexo;
        do {
            System.out.println("Sexo de la persona: H/M/O");
            sexo = SC.next();
            sexo = sexo.toUpperCase();
            if (!(sexo.equals("H") || sexo.equals("M") || sexo.equals("O"))) {
                System.out.println("Opcion incorrecta. Ingresa un valor válido");
            }
        } while (!(sexo.equals("H") || sexo.equals("M") || sexo.equals("O")));
        System.out.println("Peso de la persona:");
        double peso = SC.nextDouble();
        System.out.println("Altura de la persona:");
        double altura = SC.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public static Persona crearPersona(String nombre, int edad, String sexo, double peso, double altura) {
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public void mostrarPersona(Persona pp) {
        System.out.println("---------------------------------");
        System.out.println("Información de la Persona: ");
        System.out.println("Nombre: " + pp.getNombre());
        System.out.println("Edad: " + pp.getEdad());
        System.out.println("Sexo: " + pp.getSexo());
        System.out.println("Peso: " + pp.getPeso());
        System.out.println("Altura: " + pp.getAltura());
    }

    public double calcularIMC(Persona pp) {
        double imc = pp.getPeso() / (pp.getAltura() * pp.getAltura());
        double valor;
        System.out.println("---------------------------------");
        if (imc < 20) {
            System.out.println("(CALCULAR IMC) Debajo de su peso");
            valor = -1;
        } else if (imc <= 25) {
            System.out.println("(CALCULAR IMC) Peso ideal");
            valor = 0;
        } else {
            System.out.println("(CALCULAR IMC) Sobrepeso");
            valor = 1;
        }
        return valor;
    }

    public boolean esMayorDeEdad(Persona pp) {
        boolean adulto = false;
        if (pp.getEdad() >= 18) {
            adulto = true;
        }
        return adulto;
    }

}
