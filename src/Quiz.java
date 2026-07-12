import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions;
    private int score;

    public Quiz() {

        questions = new ArrayList<>();
        score = 0;

        loadQuestions();
    }

    private void loadQuestions() {

        questions.add(new Question(
                "Which language is used to develop Android Apps?",
                "Python",
                "Java",
                "C",
                "HTML",
                2));

        questions.add(new Question(
                "Which keyword is used to create an object in Java?",
                "class",
                "new",
                "this",
                "void",
                2));

        questions.add(new Question(
                "Which company developed Java?",
                "Microsoft",
                "Google",
                "Sun Microsystems",
                "Apple",
                3));

        questions.add(new Question(
                "Which loop executes at least once?",
                "for",
                "while",
                "do-while",
                "foreach",
                3));

        questions.add(new Question(
                "Which symbol is used for single-line comments in Java?",
                "/* */",
                "//",
                "#",
                "<!-- -->",
                2));
    }
}