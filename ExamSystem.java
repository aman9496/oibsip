import java.util.Scanner;

public class ExamSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the online exam system!");
        System.out.println("Please answer the following questions:");

        System.out.println("Question 1: What is the capital of India?");
        System.out.println("a. Mumbai");
        System.out.println("b. New Delhi");
        System.out.println("c. Kolkata");
        System.out.print("Enter your answer: ");
        String answer1 = sc.nextLine();

        if (answer1.equals("b")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect.");
        }

        System.out.println("Question 2: What is the largest planet in our solar system?");
        System.out.println("a. Earth");
        System.out.println("b. Jupiter");
        System.out.println("c. Mars");
        System.out.print("Enter your answer: ");
        String answer2 = sc.nextLine();

        if (answer2.equals("b")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect.");
        }

        System.out.println("Question 3: Who is the CEO of google?");
        System.out.println("a. Satya Nadella");
        System.out.println("b. Bill Gates");
        System.out.println("c. Sunder pichi");
        System.out.print("Enter your answer: ");
        String answer3 = sc.nextLine();

        if (answer3.equals("c")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect.");
        }

        System.out.println();
        System.out.println("Your score is " + score + "/3.");
    }
}
