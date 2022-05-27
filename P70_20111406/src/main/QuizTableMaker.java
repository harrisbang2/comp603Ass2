package main;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuizTableMaker{

    QuizDB dbManager;
    Connection conn;
    Statement statement;

    public QuizTableMaker() {
        dbManager = new QuizDB();
        conn = dbManager.getConnection();
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String[] args) {
        QuizTableMaker sbs = new QuizTableMaker();
if(sbs.checkTableExisting("Question")==false){
 try {
            sbs.statement.addBatch("CREATE  TABLE Question  (ID  INT,   Question   VARCHAR(50),   answer   VARCHAR(20),answer1   VARCHAR(20)   ,ansnum   INT)");
            sbs.statement.addBatch(""
                    + "INSERT INTO Question VALUES ("
                    + "1, 'q1', 'Fiction', 'Fiction', 1),\n"
                    + "(2, 'q2', 'Fiction', 'Fiction', 2),\n"
                    + "(3, 'q3', 'Fiction', 'Fiction', 1),\n"
                    + "(4, 'q4', 'Non-fiction', 'Fiction', 2),\n"
                    + "(5, 'Far Eastern Odyssey', 'Fiction', 'Non-fiction', 1),\n"
                    + "(6, 'Open', 'Non-fiction', 'Fiction', 2),\n"
                    + "(7, 'Big Java', 'Textbook', 'Fiction', 1),\n"
                    + "(8, 'Financial Accounting', 'Fiction', 'Textbook', 2)");
            sbs.statement.executeBatch();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        sbs.closeConnection();
    }

}
       

    public void closeConnection() {
        this.dbManager.closeConnections();
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
}
