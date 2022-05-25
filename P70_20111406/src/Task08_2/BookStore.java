package Task08_2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookStore {

    private final DBManager dbManager;
    private final Connection conn;
    private Statement statement;

    public BookStore() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();

    }

    public void connectBookStoreDB() {
        try {
            this.statement = conn.createStatement();
            this.checkExistedTable("BOOK");
            this.statement.addBatch("CREATE  TABLE BOOK  (BOOKID  INT,   TITLE   VARCHAR(50),   CATEGORY   VARCHAR(20),   PRICE   FLOAT)");
            this.statement.addBatch("INSERT INTO BOOK VALUES (1, 'Slum Dog Millionaire', 'Fiction', 19.90),\n"
                    + "(2, 'Run Mummy Run', 'Fiction', 28.00),\n"
                    + "(3, 'The Land of Painted Caves', 'Fiction', 15.40),\n"
                    + "(4, 'Cook with Jamie', 'Non-fiction', 55.20),\n"
                    + "(5, 'Far Eastern Odyssey', 'Non-fiction', 24.90),\n"
                    + "(6, 'Open', 'Non-fiction', 33.60),\n"
                    + "(7, 'Big Java', 'Textbook', 55.00),\n"
                    + "(8, 'Financial Accounting', 'Textbook', 24.80)");
            this.statement.executeBatch();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void createPromotionTable() {
        try {
            /* You may need the following SQL statements for this method:
            
            * Create the table:
            CREATE TABLE PROMOTION (CATEGORY VARCHAR(20), DISCOUNT INT);
            
            * Insert records into the table:
            INSERT INTO PROMOTION VALUES ('Fiction', 0),
            ('Non-fiction', 10),
            ('Textbook', 20);
            
             */
            this.statement = conn.createStatement();
            this.checkExistedTable("PROMOTION");
            this.statement.addBatch("CREATE TABLE PROMOTION (CATEGORY VARCHAR(20), DISCOUNT INT)");
            this.statement.addBatch("INSERT INTO PROMOTION VALUES ('Fiction', 0),\n"
                    + "('Non-fiction', 10),\n"
                    + "('Textbook', 20)");
            this.statement.executeBatch();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void createWeekSpecialTable(ResultSet rs) {

        try {
            this.checkExistedTable("WEEKSPECIAL");
            this.statement = conn.createStatement();
            this.statement.addBatch("CREATE TABLE WEEKSPECIAL (TITLE   VARCHAR(50), SPECIALPRICE FLOAT)");
            while (rs.next()) {
                String title = rs.getString("TITLE");
                float price = rs.getFloat("PRICE");
                int discount = rs.getInt("DISCOUNT");
                float new_price = price * (100 - discount) / 100;
                this.statement.addBatch("INSERT INTO WEEKSPECIAL VALUES('" + title + "'," + new_price + ")");
            }
            this.statement.executeBatch();
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ResultSet getWeekSpecial() {
 
        ResultSet rs = null;
        try {
            rs = this.statement.executeQuery("SELECT TITLE, PRICE, DISCOUNT "
                    + "FROM BOOK, PROMOTION "
                    + "WHERE BOOK.CATEGORY=PROMOTION.CATEGORY");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;

    }

    public void checkExistedTable(String name) {
        try {
            DatabaseMetaData dbmd = this.conn.getMetaData();
            String[] types = {"TABLE"};
            statement = this.conn.createStatement();
            ResultSet rs = dbmd.getTables(null, null, null, types);

            while (rs.next()) {
                String table_name = rs.getString("TABLE_NAME");
                System.out.println(table_name);
                if (table_name.equalsIgnoreCase(name)) {
                    statement.executeUpdate("Drop table " + name);
                    System.out.println("Table " + name + " has been deleted.");
                    break;
                }
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void closeConnection() {
        this.dbManager.closeConnections();
    }

}
