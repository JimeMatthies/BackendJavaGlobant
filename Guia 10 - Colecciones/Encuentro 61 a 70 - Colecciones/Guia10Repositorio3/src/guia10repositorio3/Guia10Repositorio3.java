/*
Guia 10 = Repositorio Ejemplo ArrayList
@author JimeM
 */
package guia10repositorio3;

import Services.PersonService;
import java.util.Scanner;

public class Guia10Repositorio3 {

    public static void main(String[] args) {
        
        Scanner SC = new Scanner(System.in).useDelimiter("\n");
        PersonService ps = new PersonService();

        System.out.println("How many people you want to add?");
        byte amount = SC.nextByte();
        for (int i = 0; i < amount; i++) {
            ps.addPerson(ps.createPerson());
        }
        ps.showPeople();
        System.out.println("Enter the last name of the person you want to delete");
        String personLastName = SC.next();
        personLastName = personLastName.toUpperCase();
        ps.searchRemovePerson(personLastName);
        ps.orderByLastnameAsc();
        ps.showPeople();
        
    }
    
}
