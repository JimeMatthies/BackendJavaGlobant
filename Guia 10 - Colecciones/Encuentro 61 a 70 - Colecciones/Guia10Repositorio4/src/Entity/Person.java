/*
Guia 10 = Repositorio Ejemplo HashMap
@author JimeM
 */
package Entity;

public class Person {
    
    private Integer ssn;
    private String name;
    private String lastname;

    public Person() {
    }

    public Person(Integer ssn, String name, String lastname) {
        this.ssn = ssn;
        this.name = name;
        this.lastname = lastname;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
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

    @Override
    public String toString() {
        return "Person{" + "ssn=" + ssn + ", name=" + name + ", lastname=" + lastname + '}';
    }

}