/*
Guia 10 = Aplicación Mascotas Conjuntos (Videos 1 - 8)
@author JimeM
 */
package Entity;

import java.util.Objects;

public class Pet implements Comparable<Pet> {

    private String name;
    private String nickname;
    private String type;
    private String breed;
    private String color;
    private Integer age;
    private boolean tail;  
    private int energy;

    public Pet() {
        this.energy = 1000;
    }

    public Pet(String name, String nickname, String type, String breed, String color, int age, boolean tail) {
        this.name = name;
        this.nickname = nickname;
        this.type = type;
        this.breed = breed;
        this.color = color;
        this.age = age;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
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
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.nickname);
        hash = 43 * hash + Objects.hashCode(this.type);
        hash = 43 * hash + Objects.hashCode(this.breed);
        hash = 43 * hash + Objects.hashCode(this.color);
        hash = 43 * hash + Objects.hashCode(this.age);
        hash = 43 * hash + (this.tail ? 1 : 0);
        hash = 43 * hash + this.energy;
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
        final Pet other = (Pet) obj;
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
        if (!Objects.equals(this.breed, other.breed)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", nickname=" + nickname + ", type=" + type + ", breed=" + breed + ", color=" + color + ", age=" + age + ", tail=" + tail + ", energy=" + energy + '}';
    }

    @Override
    public int compareTo(Pet pp) {
        return pp.getName().compareTo(this.name);
    }
    
}