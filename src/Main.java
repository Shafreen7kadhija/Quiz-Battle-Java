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

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Quiz will start soon...");
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