
package main;

import java.sql.SQLException;
import java.util.Observable;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Model extends Observable {
    QuizGetter quizget = new QuizGetter();
    public Database db;
    public Account acc;
    public int answer = 1;
    public String username; // To store the user name for later use.
    private int i = 1;
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
            try {
                this.newQuestion();
            } catch (SQLException ex) {
                System.out.println("Model.Checkname() Quizget having prob");
            }
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
    public void newQuestion() throws SQLException {
        quizget = new QuizGetter(i);
        i++;
        this.acc.num1 = quizget.num;
        this.acc.setQ(quizget.getQuestion());
        this.acc.setA(quizget.getAnswer1());
        this.acc.setA2(quizget.getAnswer2());
        this.acc.setAns(i);
        this.answer = quizget.getAns(); // Store the correct answer.
        
    }
/// 숫자 받는법

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
        try {
            this.newQuestion(); // Generate a new question for user.
        } catch (SQLException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setChanged(); 
        this.notifyObservers(this.acc);
    }
    public void restartGame() {
        this.db.SaveGame(this.acc.currentScore, this.username); 
        this.setChanged();
        this.notifyObservers(this.acc);
    }

}
