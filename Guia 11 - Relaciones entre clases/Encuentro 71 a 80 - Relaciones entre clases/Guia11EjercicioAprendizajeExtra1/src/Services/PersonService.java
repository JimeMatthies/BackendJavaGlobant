/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a tener que contar con 
muchas personas y muchos perros. El programa deberá preguntarle a cada persona, que perro según su nombre, quiere 
adoptar. Dos personas no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado, se 
le debe informar a la persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las personas con sus 
respectivos perros.
@author JimeM
 */
package Services;

import Entity.Person;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonService {

    private static final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Person> people;
    DogService ds;

    public PersonService() {
        this.people = new ArrayList();
        this.ds = new DogService();
        loadPeople();
    }

    public Person createPerson() {
        System.out.println("---------------------------------");
        System.out.println("Name:");
        String name = SC.next();
        name = name.toUpperCase();
        System.out.println("LastName:");
        String lastname = SC.next();
        lastname = lastname.toUpperCase();
        System.out.println("Age:");
        int age = SC.nextInt();
        System.out.println("SSN:");
        int snn = SC.nextInt();

        return new Person(name, lastname, age, snn);
    }

    public void addPerson(Person pp) {
        people.add(pp);
    }

    public void showPerson(Person pp) {
        System.out.println("---------------------------------");
        System.out.println("Person's information: ");
        System.out.println("Name: " + pp.getName());
        System.out.println("Lastname: " + pp.getLastname());
        System.out.println("Age: " + pp.getAge());
        System.out.println("SSN: " + pp.getSsn());
        System.out.println("Dog: " + pp.getDog());
    }

    public void showPeople() {
        System.out.println("---------------------------------");
        System.out.println("People from List:");
        people.forEach(pp -> System.out.println(pp.toString()));
        System.out.println("Number of people = " + people.size());
    }

    public void adoptDog() {
        ds.showDogs();
        for (int i = 0; i < people.size(); i++) {
            System.out.println("Hello " + people.get(i).getName());
            System.out.println("Please enter name of the dog you want to adopt");
            if (!ds.searchAdoptDog(SC.next(), people.get(i))) {
                i--;
            }
        }
    }
    
    public void loadPeople() {
        people.add(new Person("Jimena", "Veliz", 66, 76947333));
        people.add(new Person("Jime", "Matthies", 36, 166247985));
        people.add(new Person("Adolfo", "Matthies", 61, 76974357));
    }

}
