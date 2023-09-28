/*
Guia 10 = Repositorio Ejemplo HashSet
@author JimeM
 */
package Entity;

import java.util.Objects;

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
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.ssn);
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.lastname);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Person{" + "ssn=" + ssn + ", name=" + name + ", lastname=" + lastname + '}';
    }

}