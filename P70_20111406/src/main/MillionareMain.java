/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author harri
 */
public class MillionareMain {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Gui view = new Gui();
        Model model = new Model();
        Controller controller = new Controller(view, model);
        model.addObserver(view);// Build connection between the view and the model.
    }
    
}
