/*
Guia 15 = Aplicación Mascotas JDBC (Videos 1-7)
@author JimeM
 */
package com.petsocial.persistence;

import com.petsocial.domain.user.User;
import java.util.ArrayList;
import java.util.Collection;

public final class UserDAO extends DAO {

    public void insertUser(User uu) throws Exception {
        try {
            if (uu == null) {
                throw new Exception("User is required");
            }
            String sql = "INSERT INTO users (email, password)"
                    + "VALUES ( '" + uu.getEmail() + "' , '" + uu.getPassword() + "' );";
            insertUpdateDeleteBase(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            disconnectBase();
        }
    }

    public void updateUser(User uu) throws Exception {
        try {
            if (uu == null) {
                throw new Exception("User is required");
            }
            String sql = "UPDATE users SET "
                    + "password = '" + uu.getPassword() + "' WHERE email = '" + uu.getEmail() + "'";
            insertUpdateDeleteBase(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            disconnectBase();
        }
    }

    public void deleteUser(String email) throws Exception {
        try {
            String sql = "DELETE FROM users WHERE email = '" + email + "'";
            insertUpdateDeleteBase(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            disconnectBase();
        }
    }

    public User searchUserByEmail(String email) throws Exception {
        try {
            String sql = "SELECT * FROM users "
                    + " WHERE email = '" + email + "'";

            readBase(sql);
            User uu = null;
            while (resultset.next()) {
                uu = new User();
                uu.setId(resultset.getInt(1));
                uu.setEmail(resultset.getString(2));
                uu.setPassword(resultset.getString(3));
            }
            disconnectBase();
            return uu;
        } catch (Exception e) {
            disconnectBase();
            throw e;
        }
    }
    
    public User searchUserById(Integer id) throws Exception {
        try {
            String sql = "SELECT * FROM users "
                    + " WHERE id_user = '" + id + "'";
            readBase(sql);
            User uu = null;
            while (resultset.next()) {
                uu = new User();
                uu.setId(resultset.getInt(1));
                uu.setEmail(resultset.getString(2));
                uu.setPassword(resultset.getString(3));
            }
            disconnectBase();
            return uu;
        } catch (Exception e) {
            disconnectBase();
            throw e;
        }
    }

    public Collection<User> listUsers() throws Exception {
        try {
            String sql = "SELECT email, password FROM users ";
            readBase(sql);
            User uu = null;
            Collection<User> users = new ArrayList();
            while (resultset.next()) {
                uu = new User();
                uu.setEmail(resultset.getString(1));
                uu.setPassword(resultset.getString(2));
                users.add(uu);
            }
            disconnectBase();
            return users;
        } catch (Exception e) {
            e.printStackTrace();
            disconnectBase();
            throw new Exception("System Error");
        }
    }

}