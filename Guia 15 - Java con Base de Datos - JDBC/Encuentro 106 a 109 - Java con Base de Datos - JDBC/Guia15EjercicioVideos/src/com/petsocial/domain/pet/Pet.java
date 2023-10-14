/*
Guia 15 = Aplicación Mascotas JDBC (Videos 1-7)
@author JimeM
 */
package com.petsocial.domain.pet;

import com.petsocial.domain.user.User;

public class Pet {

    private int id;
    private String name;
    private String breed;
    private User user;

    public Pet() {
    }

    public Pet(int id, String name, String breed, User user) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", name=" + name + ", breed=" + breed + ", user=" + user + '}';
    }
  
}
