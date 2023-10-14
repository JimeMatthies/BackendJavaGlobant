/*
Guia 15 = Aplicación Mascotas JDBC (Videos 1-7)
@author JimeM
 */
package com.petsocial.domain.user;

import com.petsocial.persistence.UserDAO;
import java.util.Collection;

public class UserService {

    private UserDAO dao;

    public UserService() {
        this.dao = new UserDAO();
    }

    public void createUser(String email, String password) throws Exception {
        try {
            if (email == null || email.trim().isEmpty()) {
                throw new Exception("Email is required");
            }
            if (email.contains("@") == false) {
                throw new Exception("Email must be valid");
            }
            if (password == null || password.trim().isEmpty()) {
                throw new Exception("Password is required");
            }
            if (password.length() < 8) {
                throw new Exception("Password cannot be less than 8 characters");
            }
            if (searchUserByEmail(email) != null) {
                throw new Exception(email + " already exists");
            }
            User uu = new User();
            uu.setEmail(email);
            uu.setPassword(password);
            dao.insertUser(uu);
        } catch (Exception e) {
            throw e;
        }
    }

    public void changeUserPassword(String email, String currentPassword, String newPassword) throws Exception {
        try {
            if (email == null || email.trim().isEmpty()) {
                throw new Exception("Email is required");
            }
            if (currentPassword == null || currentPassword.trim().isEmpty()) {
                throw new Exception("Current password is required");
            }
            if (newPassword == null || newPassword.trim().isEmpty()) {
                throw new Exception("Must enter new password");
            }

            User uu = dao.searchUserByEmail(email);

            if (!uu.getPassword().equals(currentPassword)) {
                throw new Exception("Current password is incorrect");
            }
            uu.setPassword(newPassword);
            dao.updateUser(uu);
        } catch (Exception e) {
            throw e;
        }
    }

    public void deleteUser(String email) throws Exception {
        try {
            if (email == null || email.trim().isEmpty()) {
                throw new Exception("Email is required");
            }
            dao.deleteUser(email);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public User searchUserByEmail(String email) throws Exception {
        try {
            if (email == null || email.trim().isEmpty()) {
                throw new Exception("Email is required");
            }
            User uu = dao.searchUserByEmail(email);
            return uu;
        } catch (Exception e) {
            throw e;
        }
    }

    public User searchUserById(Integer id) throws Exception {
        try {
            if (id == null) {
                throw new Exception("Id is required");
            }
            User uu = dao.searchUserById(id);
            return uu;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<User> listUsers() throws Exception {
        try {
            Collection<User> users = dao.listUsers();
            return users;
        } catch (Exception e) {
            throw e;
        }
    }

    public void printUsers() throws Exception {
        try {
            Collection<User> users = listUsers();
            if (users.isEmpty()) {
                throw new Exception("There are no users to print");
            } else {
                System.out.println("---------------------------------");
                for (User uu : users) {
                    System.out.println(uu);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

}