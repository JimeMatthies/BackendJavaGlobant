/*
Se está realizando una calculadora grafica, y se requiere calcular algunas áreas y perímetros de unas figuras
geométricas. Las figuras son las siguientes:
° Cuadrado
° Rectángulo
° Triangulo
° Circulo
° Hexágono
° Pentágono
° Rombo
El usuario debe elegir la figura geométrica, luego debe ingresar el/los dato/s de la figura geométrica elegida y le debe
mostrar por pantalla el área y el perímetro.
Aclaración: Si el usuario elige una figura, se debe crear un objeto de esa figura seleccionada, y realizar los cálculos
para luego mostrar en pantalla.
@author JimeM
 */
package Servicios;

import Entidades.FiguraGeometrica;
import java.util.Scanner;

public class FiguraGeometricaServicio {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public FiguraGeometrica crearFiguraGeometrica() {
        System.out.println("---------------------------------");
        System.out.println("Tipo de la figura geometrica:");
        int op = 0;
        String tipo = "";
        double perimetro = 0;
        double area = 0;
        while (op < 1 || op > 7) {
            System.out.println("Seleccione una opción: ");
            System.out.println("1. CUADRADO");
            System.out.println("2. RECTÁNGULO");
            System.out.println("3. TRIÁNGULO");
            System.out.println("4. CÍRCULO");
            System.out.println("5. HEXÁGONO");
            System.out.println("6. PENTÁGONO");
            System.out.println("7. ROMBO");
            op = SC.nextInt();
        }
        switch (op) {
            case 1:
                tipo = "CUADRADO";
                System.out.println("Lado del cuadrado:");
                double lado = SC.nextDouble();
                perimetro = 4 * lado;
                area = lado * lado;
                break;
            case 2:
                tipo = "RECTÁNGULO";
                System.out.println("Base del rectángulo:");
                double base = SC.nextDouble();
                System.out.println("Altura del rectángulo: ");
                double altura = SC.nextDouble();
                perimetro = (base + altura) * 2;
                area = base * altura;
                break;
            case 3:
                tipo = "TRIÁNGULO";
                System.out.println("1° lado del triángulo:");
                double lado1 = SC.nextDouble();
                System.out.println("2° lado del triángulo:");
                double lado2 = SC.nextDouble();
                System.out.println("3° lado del triángulo:");
                double lado3 = SC.nextDouble();
                perimetro = lado1 + lado2 + lado3;
                double s = (lado1 + lado2 + lado3) / 2;
                area = (Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3)));
                break;
            case 4:
                tipo = "CÍRCULO";
                System.out.println("Radio del círculo:");
                double radio = SC.nextDouble();
                perimetro = 2 * Math.PI * radio;
                area = Math.PI * radio * radio;
                break;
            case 5:
                tipo = "HEXÁGONO";
                System.out.println("Lado del hexágono:");
                double ladoh = SC.nextDouble();
                double apotema = Math.sqrt(Math.pow(ladoh, 2) - Math.pow((ladoh/2), 2));
                System.out.println();
                System.out.println(apotema);
                perimetro = 6 * ladoh;
                area = (perimetro * apotema) / 2;
                break;
            case 6:
                tipo = "PENTÁGONO";
                System.out.println("Lado del pentágono:");
                double ladop = SC.nextDouble();
                System.out.println("Apotema del pentágono:");
                double apotemap = SC.nextDouble();
                perimetro = 5 * ladop;
                area = (perimetro * apotemap) / 2;
                break;
            case 7:
                tipo = "ROMBO";
                System.out.println("Diagonal mayor del rombo:");
                double dMayor = SC.nextDouble();
                System.out.println("Diagonal menor del rombo:");
                double dMenor = SC.nextDouble();
                double lador = Math.sqrt(Math.pow(dMayor / 2, 2) + Math.pow(dMenor / 2, 2));
                perimetro = 4 * lador;
                area = (dMayor * dMenor) / 2;
                break;
            default:
                System.out.println("Tipo no válido");
        }

        return new FiguraGeometrica(tipo, perimetro, area);
    }

    public void mostrarFiguraGeometrica(FiguraGeometrica fg) {
        System.out.println("---------------------------------");
        System.out.println("Información de la figura geometrica: ");
        System.out.println("Tipo: " + fg.getTipo());
        System.out.println("Perimetro: " + fg.getPerimetro());
        System.out.println("Area: " + fg.getArea());
    }

}
