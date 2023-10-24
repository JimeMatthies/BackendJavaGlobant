/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a tener que contar con 
muchas personas y muchos perros. El programa deberá preguntarle a cada persona, que perro según su nombre, quiere 
adoptar. Dos personas no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado, se 
le debe informar a la persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las personas con sus 
respectivos perros.
@author JimeM
 */
package Entity;

public class Person {
    
    private String name;
    private String lastname;
    private int age;
    private int ssn;
    private Dog dog;

    public Person() {
    }

    public Person(String name, String lastname, int age, int ssn) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.ssn = ssn;
    }
    
    public Person(String name, String lastname, int age, int ssn, Dog dog) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.ssn = ssn;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastname=" + lastname + ", age=" + age + ", ssn=" + ssn + ", dog=" + dog + '}';
    }
    
}