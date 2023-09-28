/*
Guia 10 = Repositorio Ejemplo HashMap
@author JimeM
 */
package guia10repositorio4;

import Services.PersonService;
import java.util.Scanner;

public class Guia10Repositorio4 {

    public static void main(String[] args) {
        
        Scanner SC = new Scanner(System.in);
        PersonService ps = new PersonService();

        System.out.println("How many people you want to add?");
        byte amount = SC.nextByte();
        
        for (int i = 0; i < amount; i++) {
            ps.addPerson(ps.createPerson());
        }
        ps.showPeople();
        System.out.println("Enter the SSN of the person you want to delete");
        Integer personSSN = SC.nextInt();
        ps.searchRemovePerson(personSSN);
        ps.showPeople();
    }
    
}
