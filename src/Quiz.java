import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions;

    public Quiz() {

        questions = new ArrayList<>();

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

    public int startQuiz(Scanner scanner) {

        int score = 0;

        for (int i = 0; i < questions.size(); i++) {

            Question question = questions.get(i);

            System.out.println("\nQ" + (i + 1) + ". " + question.getQuestion());

            System.out.println("1. " + question.getOption1());
            System.out.println("2. " + question.getOption2());
            System.out.println("3. " + question.getOption3());
            System.out.println("4. " + question.getOption4());

            int answer;

            while (true) {

                System.out.print("Enter your answer (1-4): ");

                if (scanner.hasNextInt()) {

                    answer = scanner.nextInt();

                    if (answer >= 1 && answer <= 4) {
                        break;
                    }

                    System.out.println("Please enter a number between 1 and 4.");

                } else {

                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                }
            }

            if (answer == question.getCorrectAnswer()) {
                System.out.println("Correct! ✅");
                score++;
            } else {
                System.out.println("Wrong! ❌");
            }
        }

        return score;
    }
}