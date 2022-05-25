
package main;

import java.util.Observable;
import java.util.Random;


public class Model extends Observable {

    public Database db;
    public Account acc;
    public int answer = 0;
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
    
    public void newQuestion() {
        this.acc.num1 = getNumber();
        this.acc.num2 = getNumber();
        this.answer = this.acc.num1 + this.acc.num2; // Store the correct answer.
    }

    public int getNumber() {
        Random generator = new Random();
        int i = generator.nextInt(100);
        return i;
    }

    public void checkAnswer(String answer) {
        if (answer.equals(this.answer + "")) {
            acc.currentScore += 10;
        } else {
            acc.currentScore -= 10;
        }
        this.newQuestion(); // Generate a new question for user.
        this.setChanged(); 
        this.notifyObservers(this.acc);
    }

    public void quitGame() {
     
        this.db.SaveGame(this.acc.currentScore, this.username); 
        this.acc.quitFlag = true; 
        this.setChanged();
        this.notifyObservers(this.acc);
    }
}
