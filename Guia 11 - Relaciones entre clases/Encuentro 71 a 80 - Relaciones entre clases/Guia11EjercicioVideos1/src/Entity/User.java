/*
Guia 11 = Aplicación Mascotas Relaciones (Videos 1, 6, 7, 8)
@author JimeM
 */
package Entity;

import Enum.Gender;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class User {

    private String name;
    private String lastname;
    private String country;
    private Integer ssn;
    private LocalDate birthdate;
    private Gender gender;
    private Pet favoritePet;
    private List<Pet> pets;

    public User() {
    }

    public User(String name, String lastname, String country, Integer ssn, LocalDate birthdate, Gender gender, Pet favoritePet, List<Pet> pets) {
        this.name = name;
        this.lastname = lastname;
        this.country = country;
        this.ssn = ssn;
        this.birthdate = birthdate;
        this.gender = gender;
        this.favoritePet = favoritePet;
        this.pets = pets;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Pet getFavoritePet() {
        return favoritePet;
    }

    public void setFavoritePet(Pet favoritePet) {
        this.favoritePet = favoritePet;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.lastname);
        hash = 59 * hash + Objects.hashCode(this.country);
        hash = 59 * hash + Objects.hashCode(this.ssn);
        hash = 59 * hash + Objects.hashCode(this.birthdate);
        hash = 59 * hash + Objects.hashCode(this.gender);
        hash = 59 * hash + Objects.hashCode(this.favoritePet);
        hash = 59 * hash + Objects.hashCode(this.pets);
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
        final User other = (User) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        if (!Objects.equals(this.birthdate, other.birthdate)) {
            return false;
        }
        if (this.gender != other.gender) {
            return false;
        }
        if (!Objects.equals(this.favoritePet, other.favoritePet)) {
            return false;
        }
        if (!Objects.equals(this.pets, other.pets)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" 
                + "name=" + name + ", lastname=" + lastname 
                + ", country=" + country + ", ssn=" + ssn 
                + ", birthdate=" + birthdate + ", gender=" + gender 
                + ",\n favoritePet=" + favoritePet 
                + ",\n pets=" + pets + '}';
    }

}
