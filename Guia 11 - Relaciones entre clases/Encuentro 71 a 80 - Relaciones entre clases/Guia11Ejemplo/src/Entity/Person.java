/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
@author JimeM
 */
package Entity;

public class Person {
    
    private String name;
    private String lastname;
    private SSN ssn;

    public Person() {
    }

    public Person(String name, String lastname, SSN ssn) {
        this.name = name;
        this.lastname = lastname;
        this.ssn = ssn;
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

    public SSN getSsn() {
        return ssn;
    }

    public void setSsn(SSN ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastname=" + lastname + ", ssn=" + ssn + '}';
    }
    
}
