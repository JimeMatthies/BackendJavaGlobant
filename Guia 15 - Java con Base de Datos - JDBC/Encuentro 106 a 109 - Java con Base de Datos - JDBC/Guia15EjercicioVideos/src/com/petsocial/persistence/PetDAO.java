/*
Guia 15 = Aplicación Mascotas JDBC (Videos 1-7)
@author JimeM
 */
package com.petsocial.persistence;

import com.petsocial.domain.pet.Pet;
import com.petsocial.domain.user.User;
import com.petsocial.domain.user.UserService;
import java.util.ArrayList;
import java.util.Collection;

public final class PetDAO extends DAO {

    private final UserService us;

    public PetDAO() {
        this.us = new UserService();
    }

    public void insertPet(Pet pp) throws Exception {
        try {
            if (pp == null) {
                throw new Exception("Pet is required");
            }
            String sql = "INSERT INTO pets (name, breed, id_user) "
                    + "VALUES ( '" + pp.getName() + "' , '" + pp.getBreed() + "' ," + pp.getUser().getId() + " );";
            insertUpdateDeleteBase(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            disconnectBase();
        }
    }

    public void updatePet(Pet pp) throws Exception {
        try {
            if (pp == null) {
                throw new Exception("Pet is required");
            }
            String sql = "UPDATE pets SET "
                    + " name = '" + pp.getName() + "' , breed = '" + pp.getBreed() + "' , id_user = " + pp.getUser().getId()
                    + " WHERE id_pet = '" + pp.getId() + "'";
            insertUpdateDeleteBase(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            disconnectBase();
        }
    }

    public void deletePet(int id) throws Exception {
        try {
            String sql = "DELETE FROM pets WHERE id_pet = " + id + "";
            insertUpdateDeleteBase(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            disconnectBase();
        }
    }

    public Pet searchPetById(int id) throws Exception {
        try {
            String sql = "SELECT * FROM pets WHERE id_pet = " + id + "";
            readBase(sql);
            Pet pp = null;
            while (resultset.next()) {
                pp = new Pet();
                pp.setId(resultset.getInt(1));
                pp.setName(resultset.getString(2));
                pp.setBreed(resultset.getString(3));
                Integer id_user = resultset.getInt(4);
                User uu = us.searchUserById(id_user);
                pp.setUser(uu);
            }
            disconnectBase();
            return pp;
        } catch (Exception e) {
            disconnectBase();
            throw e;
        }
    }
    
    public Collection<Pet> listPets() throws Exception {
        try {
            String sql = "SELECT * FROM pets ";
            readBase(sql);
            Pet pp = null;
            Collection<Pet> pets = new ArrayList();
            while (resultset.next()) {
                pp = new Pet();
                pp.setId(resultset.getInt(1));
                pp.setName(resultset.getString(2));
                pp.setBreed(resultset.getString(3));
                Integer id_user = resultset.getInt(4);
                User uu = us.searchUserById(id_user);
                pp.setUser(uu);
                pets.add(pp);
            }
            disconnectBase();
            return pets;
        } catch (Exception e) {
            e.printStackTrace();
            disconnectBase();
            throw e;
        }
    }

}