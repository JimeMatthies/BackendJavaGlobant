/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto.
@author JimeM
 */
package Servicios;

import Entidades.Meses;
import java.util.Scanner;

public class MesesServicio {
    
    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");

    public Meses crearMeses() {
        System.out.println("---------------------------------");
        System.out.println("Cuantos Meses:");
        int cantidad = SC.nextInt();
        String[] meses = new String[cantidad];
        for(int i = 0; i < meses.length; i++) {
           System.out.println("Ingrese el mes:");
           meses[i] = SC.next();
        }

        return new Meses(meses);
    }

    public void mostrarMeses(Meses mm) {
        System.out.println("---------------------------------");
        System.out.print("Meses: ");
        String[] meses = mm.getMeses();
        for (int i = 0; i < meses.length; i++) {
            if (i == meses.length - 1) {
                System.out.print(meses[i] + ".");
            } else {
                System.out.print(meses[i] + ", ");
            } 
        }
        System.out.println("");
    }
    
    public Meses crearAnio(){
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", 
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        
        return new Meses(meses);
    }
    
    public void adivinarMes(Meses mm){
        System.out.println("---------------------------------");
        System.out.println("Adivina el mes secreto!");
        int posicion = (int) (Math.random() * 120) % 12;
        String mesSecreto = mm.getMeses()[posicion];
        String mes;
        do {
            System.out.println("Ingrese un mes: ");
            mes = SC.next().toLowerCase();
            if (mes.equals(mesSecreto)) {
                System.out.println("!Has acertado!");
            } else {
                System.out.println("No has acertado, intentalo de nuevo");
            }
        } while(!mes.equals(mesSecreto));
    }
}
