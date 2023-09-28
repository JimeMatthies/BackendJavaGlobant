/*
Guia 10 = Repositorio Ejemplo HashMap
@author JimeM
 */
package Services;

import Entity.Person;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private HashMap<Integer, Person> people;

    public PersonService() {
        this.people = new HashMap<>();
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
        people.put(pp.getSsn(), pp);
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
        for (Map.Entry<Integer, Person> pp : people.entrySet()) {
            Integer key = pp.getKey();
            Person value = pp.getValue();
            System.out.println("SSN: " + key);
            System.out.println("Person: " + value);
        }
        System.out.println("Number of people = " + people.size());
    }

    public void searchRemovePerson(Integer personSSN) {
        people.remove(personSSN);
    }
}
