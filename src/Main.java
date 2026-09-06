import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("            QUIZ BATTLE");
        System.out.println("========================================");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("\nWelcome " + name + "!");

        while (true) {

            System.out.println("\n1. Start Quiz");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice;

                while (true) {

                    System.out.print("Enter your choice (1-2): ");

                    if (scanner.hasNextInt()) {

                        choice = scanner.nextInt();

                        if (choice == 1 || choice == 2) {
                            break;
                        }

                        System.out.println("Please enter 1 or 2.");

                    } else {

                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next();
                    }
                }

            switch (choice) {

                case 1:
                    Quiz quiz = new Quiz();

                    int score = quiz.startQuiz(scanner);

                    System.out.println("\n========== RESULT ==========");
                    System.out.println("Player: " + name);
                    System.out.println("Score: " + score + "/5");
                    System.out.println("============================");

                    break;

                case 2:
                    System.out.println("Thank you for playing!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}