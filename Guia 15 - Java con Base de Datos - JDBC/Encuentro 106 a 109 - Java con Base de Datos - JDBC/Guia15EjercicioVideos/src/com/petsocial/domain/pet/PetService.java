/*
Guia 15 = Aplicación Mascotas JDBC (Videos 1-7)
@author JimeM
 */
package com.petsocial.domain.pet;

import com.petsocial.domain.user.User;
import com.petsocial.persistence.PetDAO;
import java.util.Collection;

public class PetService {

    private PetDAO dao;

    public PetService() {
        this.dao = new PetDAO();
    }

    public void createPet(String name, String breed, User user) throws Exception {
        try {
            if (name == null || name.trim().isEmpty()) {
                throw new Exception("Name is required");
            }
            if (breed == null || breed.trim().isEmpty()) {
                throw new Exception("Breed is required");
            }
            if (user == null) {
                throw new Exception("User is required");
            }
            Pet pp = new Pet();
            pp.setName(name);
            pp.setBreed(breed);
            pp.setUser(user);
            dao.insertPet(pp);
        } catch (Exception e) {
            throw e;
        }
    }

    public void changePet(int id_pet, String name, String breed, int id_user) throws Exception {
        try {
            if (id_pet < 0) {
                throw new Exception("Pet Id is required");
            }
            if (name == null || name.trim().isEmpty()) {
                throw new Exception("Name is required");
            }
            if (breed == null || breed.trim().isEmpty()) {
                throw new Exception("Breed is required");
            }
            if (id_user < 0) {
                throw new Exception("User Id is required");
            }
            Pet pp = searchPetById(id_pet);
            dao.updatePet(pp);
        } catch (Exception e) {
            throw e;
        }
    }

    public void deletePet(int id_pet) throws Exception {
        try {
            if (id_pet < 0) {
                throw new Exception("Pet Id is required");
            }
            dao.deletePet(id_pet);
        } catch (Exception e) {
            throw e;
        }
    }

    public Pet searchPetById(int id_pet) throws Exception {
        try {
            if (id_pet < 0) {
                throw new Exception("Pet Id is required");
            }
            Pet pp = dao.searchPetById(id_pet);
            if (pp == null) {
                throw new Exception("Pet not found with this id");
            }
            return pp;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Pet> listPets() throws Exception {
        try {
            Collection<Pet> pets = dao.listPets();
            return pets;
        } catch (Exception e) {
            throw e;
        }
    }

    public void printPets() throws Exception {
        try {
            Collection<Pet> pets = listPets();
            if (pets.isEmpty()) {
                throw new Exception("There are no pets to print");
            } else {
                System.out.println("---------------------------------");
                for (Pet pp : pets) {
                    System.out.println(pp.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
