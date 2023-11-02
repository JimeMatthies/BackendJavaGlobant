/*
Guia 11 = Aplicación Mascotas Relaciones (Videos 1, 6, 7, 8)
@author JimeM
 */
package Entity;

import Enum.Gender;
import java.util.Objects;

public class Pet<T> {
    
    private String name;
    private String nickname;
    private String type;
    private T breed;
    private String color;
    private Integer age;
    private Gender gender;
    private boolean tail;  
    private int energy;
    
    public Pet() {
        this.energy = 1000;
    }

    //For examples
    public Pet(String name, String nickname, String type) {
        this.name = name;
        this.nickname = nickname;
        this.type = type;
        this.energy = 1000;
    }

    public Pet(String name, String nickname, String type, T breed, String color, Integer age, Gender gender, boolean tail) {
        this.name = name;
        this.nickname = nickname;
        this.type = type;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.tail = tail;
        this.energy = 1000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public T getBreed() {
        return breed;
    }

    public void setBreed(T breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * Function for walking the pet
     * @param energyLoss
     * @return energy
     */
    public int walking (int energyLoss){
        energy -= energyLoss;
        return energy;
    }
    
    /**
     * Functon for walking the pet by laps
     * @param energyLoss
     * @param laps
     * @return energy
     */ 
    public int walking(int energyLoss, int laps){
        energy -= (energyLoss * laps);
        return energy;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.nickname);
        hash = 41 * hash + Objects.hashCode(this.type);
        hash = 41 * hash + Objects.hashCode(this.breed);
        hash = 41 * hash + Objects.hashCode(this.color);
        hash = 41 * hash + Objects.hashCode(this.age);
        hash = 41 * hash + Objects.hashCode(this.gender);
        hash = 41 * hash + (this.tail ? 1 : 0);
        hash = 41 * hash + this.energy;
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
        final Pet<?> other = (Pet<?>) obj;
        if (this.tail != other.tail) {
            return false;
        }
        if (this.energy != other.energy) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.breed, other.breed)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (this.gender != other.gender) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", nickname=" + nickname + ", type=" + type + ", breed=" + breed + ", color=" + color + ", age=" + age + ", gender=" + gender + ", tail=" + tail + ", energy=" + energy + '}';
    }
    
}