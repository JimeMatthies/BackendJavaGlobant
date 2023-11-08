/*
Guia 13 = Apuntes y Aplicación Mascotas Exceptions (Videos 1 y 2)
@author JimeM
 */
package entities;

public class Pet {

    private String name;
    private String nickname;
    private String type;
    private String breed;
    private String color;
    private Integer age;
    private String gender;
    private boolean tail;
    private int energy;

    public Pet() {
        this.energy = 1000;
    }

    public Pet(String name, String nickname, String type, String breed, String color, Integer age, String gender, boolean tail) {
        this();
        this.name = name;
        this.nickname = nickname;
        this.type = type;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.tail = tail;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
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

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", nickname=" + nickname + ", type=" + type + ", breed=" + breed + ", color=" + color + ", age=" + age + ", gender=" + gender + ", tail=" + tail + ", energy=" + energy + '}';
    }

}
