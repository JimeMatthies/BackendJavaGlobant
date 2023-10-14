/*
Guia 15 = Aplicación Mascotas JDBC (Videos 1-7)
@author JimeM
 */
package com.petsocial.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

    protected Connection connection;
    protected ResultSet resultset;
    protected Statement statement;
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "pets";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    protected void connectBase() throws Exception {
        try {
            Class.forName(DRIVER);
            String url = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            connection = DriverManager.getConnection(url, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            connection = null;
            /*ex.printStackTrace();
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());*/
            throw ex;
        }
    }

    protected void disconnectBase() throws Exception {
        try {
            if (resultset != null) {
                resultset.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            throw ex;
        }
    }

    protected void insertUpdateDeleteBase(String sql) throws Exception {
        try {
            connectBase();
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            //connection.rollback();
            /*  Descomentar la linea anterior si desean tener en cuenta el rollback.
                Correr el siguiente script en Workbench
            
                SET autocommit=1;
                COMMIT;
            
                **Sin rollback igual anda */
            throw ex;
        } finally {
            disconnectBase();
        }
    }

    protected void readBase(String sql) throws Exception {
        try {
            connectBase();
            statement = connection.createStatement();
            resultset = statement.executeQuery(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }

}
