/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    Connection conn = null;
    final static String url = "jdbc:derby://localhost:1527/Millionare";
    final static String dbusername = "abc";  //your DB username
    final static String dbpassword = "abc";   //your DB password


    public void dbsetup() {
        try {
            conn = DriverManager.getConnection(url, dbusername, dbpassword);
            Statement statement = conn.createStatement();
            String tableName = "Account";

            if (!checkTableExisting(tableName)) {
                statement.executeUpdate("CREATE TABLE " + tableName + " (userid VARCHAR(12), password VARCHAR(12), score INT)");
            }
          
            statement.close();

        } catch (Throwable e) {
            System.out.println("error");
        }
    }

    public Account checkName(String username, String password) {
        Account acc = new Account(); // Initialize an instance of Data.
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT userid, password, score FROM UserInfo "
                    + "WHERE userid = '" + username + "'");
            if (rs.next()) {
                String pass = rs.getString("password");
                System.out.println("***" + pass);
                System.out.println("found user");
                /**
                 * If the username exists in the USERINFO table, and the
                 * password is correct, change the value of relating attributes
                 * of data. Otherwise, keep loginFlag as false.
                 */
                if (password.compareTo(pass) == 0) {
                    acc.currentScore = rs.getInt("score");
                    acc.Checker = true;
                } else {
                    acc.Checker = false;
                }
            } else {
                /**
                 * If the username does not exist in the USERINFO table, then
                 * create a new account by using the inputted username and
                 * password.
                 */
                System.out.println("no such user");
               
                acc.currentScore = 0;
                acc.Checker = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acc; //Back to checkName() of Model.java.
    }
    
    public Account register(String username, String password) throws SQLException{
                 Account acc = new Account(); // Initialize an instance of Data.
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT userid, password, score FROM UserInfo "
                    + "WHERE userid = '" + username + "'");
            if (rs.next()) {
                String pass = rs.getString("password");
                System.out.println("***" + pass);
                System.out.println("found user");
                //pop off panel?
                if (password.compareTo(pass) == 0) {
                    acc.currentScore = rs.getInt("score");
                    acc.Checker = true;
                } else {
                    acc.Checker = false;
                }
            } else {
       
                System.out.println("no such user");
                statement.executeUpdate("INSERT INTO UserInfo "
                        + "VALUES('" + username + "', '" + password + "', 0)");
                statement.executeBatch();
                acc.currentScore = 0;
                acc.Checker = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acc; //Back to checkName() of Model.java.
}
    private boolean checkTableExisting(String newTableName) {
        boolean exists = false;
        try {
            System.out.println("check existing tables.... ");
            String[] types = {"TABLE"};
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rsDBMeta = dbmd.getTables(null, null, null, null);//types);
            //Statement dropStatement=null;
            while (rsDBMeta.next()) {
                String tableName = rsDBMeta.getString("TABLE_NAME");
                if (tableName.compareToIgnoreCase(newTableName) == 0) {
                    System.out.println(tableName + "  is there");
                    exists = true;
                }
            }
            if (rsDBMeta != null) {
                rsDBMeta.close();
            }
        } catch (SQLException ex) {
        }
        return exists;
    }
   
    public void SaveGame(int score, String username) {
        Statement statement;
        try {
            statement = conn.createStatement();
            statement.executeUpdate("UPDATE UserInfo SET score=" + score + " WHERE userid='" + username + "'");
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
