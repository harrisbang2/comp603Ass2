/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
public class Account {
    int currentScore = 0; // Store user's cumulative scores.
    int num1 = 1; // The first and second numbers of the question.
    int ans = 1;  
    private String q="pracise question what is 2 - 1";
    private String a="1.1";
    private String a2="2.2";

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public boolean isQuitFlag() {
        return quitFlag;
    }

    public void setQuitFlag(boolean quitFlag) {
        this.quitFlag = quitFlag;
    }

    public boolean isChecker() {
        return Checker;
    }

    public void setChecker(boolean Checker) {
        this.Checker = Checker;
    }
    boolean quitFlag = false; // Check if the user quit the system.
    boolean Checker = false; // Check if the user successfully login the system.
}
