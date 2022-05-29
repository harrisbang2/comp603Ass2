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
    
  public void maketable(){
    QuizTableMaker sbs = new QuizTableMaker();
       if(sbs.checkTableExisting("Question")==false){
       try {
            sbs.statement.addBatch("CREATE  TABLE Question  (ID  INT,   Question   VARCHAR(50),   answer   VARCHAR(20),answer1   VARCHAR(20)   ,ansnum   INT)");
            sbs.statement.addBatch(""
                    + "INSERT INTO Question VALUES ("
                    + "1, 'Is naruto fiction?(ans should be 1 or 2)','1.Fiction', '2.non-Fiction', 1),\n"
                    + "(2, 'Q2 Is AUT in North Korea?(ans should be 1 or 2)', '1.yup', '2.nope', 2),\n"
                    + "(3, 'Q3 Where is Dunedin(ans should be 1 or 2)', '1.south island', '2.north island', 1),\n"
                    + "(4, 'Q4 Harry potter is a(ans should be 1 or 2)', '1.Non-fiction', '2.Fiction', 2),\n"
                    + "(5, 'Q5 apple is a:(ans should be 1 or 2)', '1.fruit', '2.vegetable', 1),"
                    +"(6,'That is the End of the questions...(for now) gg!', '.', '.', 52)"
            );
            sbs.statement.executeBatch();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        sbs.closeConnection();
  }
       
  }

}
