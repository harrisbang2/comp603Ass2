
package main;

import java.sql.SQLException;
import java.util.Observable;
import java.util.Random;


public class Model extends Observable {

    public Database db;
    public Account acc;
    public int answer = 1;
    public String username; // To store the user name for later use.
    
    /**
     * Step 2:
     * Initialize the instance of Database in the constructor,
     * and build the connection between the program and the database.
     * 
     * Go to Database.java for Step 3.
     */
    public Model() {
        this.db = new Database();
        this.db.dbsetup();
    }
    /**
     * Step 6:
     * 
     * @param username
     * @param password 
     */
    public void checkName(String username, String password) {
        this.username = username; // Store username
        this.acc = this.db.checkName(username, password); 
        if (acc.Checker) {
            this.newQuestion();
        }
        this.setChanged(); 
        this.notifyObservers(this.acc); 
    }
    public void register(String username, String password) throws SQLException {
        this.username = username; // Store username
        this.acc = this.db.register(username, password); 
        if (acc.Checker) {
            this.newQuestion();
        }
        this.setChanged(); 
        this.notifyObservers(this.acc); 
    }
    public void newQuestion() {
        this.acc.num1 = getNumber();
        this.acc.a ="answer";
        this.answer = this.acc.num1; // Store the correct answer.
    }
/// 숫자 받는법
    public int getNumber() {
        Random generator = new Random();
        int i = generator.nextInt(4);
        return i;
    }
// 답 체크
    public void checkAnswer(String answer) {
        if (answer.equals(this.answer + "")) {
            acc.currentScore += 100;
        } else {
            this.db.SaveGame(this.acc.currentScore, this.username);
            this.acc.quitFlag = true;
            this.setChanged();
            this.notifyObservers(this.acc);
        }
        this.newQuestion(); // Generate a new question for user.
        this.setChanged(); 
        this.notifyObservers(this.acc);
    }
    public void restartGame() {
        this.db.SaveGame(this.acc.currentScore, this.username); 
        this.acc.quitFlag = true; 
        this.setChanged();
        this.notifyObservers(this.acc);
    }

}
