
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
        QuizTableMaker quiz = new QuizTableMaker();
        quiz.maketable();
        Gui view = new Gui();
        Model model = new Model();
        Controller controller = new Controller(view, model);
        model.addObserver(view);
    }
    
}
