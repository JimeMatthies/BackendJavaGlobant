/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus 
nombres más adelante.
@author JimeM
*/
package guia7ejercicio13;

public class Guia7Ejercicio13 {

    public static void main(String[] args) {
        String[] Equipo = new String[9];
        Equipo[0] = "Jime Matthies";
        Equipo[1] = "Maria Mendez";
        Equipo[2] = "Alejandra Pereira";
        Equipo[3] = "Mariana Barrientos";
        Equipo[4] = "Yizak Matus";
        Equipo[5] = "Candy Sanchez";
        Equipo[6] = "Alberto Roman";
        Equipo[7] = "Daniel Blancas";
        Equipo[8] = "Oscar Rodriguez";
        
        for (int i = 0; i < 9; i++) {
            System.out.println(Equipo[i]);   
        }
    }
    
}
