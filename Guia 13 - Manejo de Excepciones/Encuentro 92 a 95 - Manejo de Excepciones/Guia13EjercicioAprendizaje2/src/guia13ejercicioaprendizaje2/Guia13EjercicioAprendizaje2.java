/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
@author JimeM
 */
package guia13ejercicioaprendizaje2;

import entities.Team;

public class Guia13EjercicioAprendizaje2 {

    public static void main(String[] args) {

        Team t1 = new Team();
        for (int i = 0; i < 15; i++) {
            try {
                t1.getPlayerNumbers()[i] = i;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("");
        for (Integer player : t1.getPlayerNumbers()) {
            System.out.print(player + " ");
        }
        System.out.println("");
    }

}
