/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author harri
 */
public class QuizGetter {  
    Connection conn;
    Statement statement;
    ResultSet result;
    int num;
   private int ans;
   int id;
   private String question;
   private String answer1;
   private String answer2;
QuizGetter(){

}
QuizGetter(int num) throws SQLException{
   this.num = num;
    QuizDB db = new QuizDB();
    db.establishConnection();
    conn = db.getConnection();
    statement = conn.createStatement();
  
    String getter ="SELECT ID,QUESTION,ANSWER,ANSWER1,ANSNUM FROM QUESTION WHERE ID="+num;
    result = statement.executeQuery(getter);
    while(result.next()){
    int id = result.getInt("ID");
    question = result.getString("QUESTION");
    answer1 = result.getString("ANSWER");
    answer2= result.getString("ANSWER1");
    ans= result.getInt("ANSNUM");
    }
}
    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

}
