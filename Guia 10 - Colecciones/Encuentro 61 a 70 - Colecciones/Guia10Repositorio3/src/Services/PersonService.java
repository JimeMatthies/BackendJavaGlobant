/*
Guia 10 = Repositorio Ejemplo ArrayList
@author JimeM
 */
package Services;

import Entity.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PersonService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Person> people;

    public PersonService() {
        this.people = new ArrayList<>();
    }

    public Person createPerson() {
        System.out.println("---------------------------------");
        System.out.println("SSN:");
        Integer snn = SC.nextInt();
        System.out.println("Name:");
        String name = SC.next();
        name = name.toUpperCase();
        System.out.println("LastName:");
        String lastname = SC.next();
        lastname = lastname.toUpperCase();

        return new Person(snn, name, lastname);
    }

    public void addPerson(Person pp) {
        people.add(pp);
    }

    public void showPerson(Person pp) {
        System.out.println("---------------------------------");
        System.out.println("Person's information: ");
        System.out.println("SSN: " + pp.getSsn());
        System.out.println("Name: " + pp.getName());
        System.out.println("Lastname: " + pp.getLastname());
    }

    public void showPeople() {
        System.out.println("---------------------------------");
        System.out.println("People from List:");
        for (Person pp : people) {
            System.out.println(pp.toString());
        }
        System.out.println("Number of people = " + people.size());
    }

    public void searchRemovePerson(String personLastName) {
        Iterator<Person> it = people.iterator();
        while (it.hasNext()) {
            if (it.next().getLastname().equals(personLastName)) {
                it.remove();
            }
        }
    }

    public void orderByLastnameAsc() {      
        Collections.sort(people,(Person p1, Person p2) -> p1.getLastname().compareTo(p2.getLastname()));
    }

}
