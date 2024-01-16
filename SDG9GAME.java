import java.util.Scanner;

public class SDG9GAME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;

        System.out.println("Welcome to the SDG 9 Quiz - Industry, Innovation, and Infrastructure");
        System.out.println("Answer the following questions with the correct option (A, B, C, or D).");

        // Question 1
        System.out.println("\n1. What does SDG 9 primarily focus on?");
        System.out.println("A. Quality Education");
        System.out.println("B. Gender Equality");
        System.out.println("C. Industry, Innovation, and Infrastructure");
        System.out.println("D. Clean Water and Sanitation");
        char answer1 = Character.toUpperCase(scanner.next().charAt(0));
        if (answer1 == 'C') {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Incorrect. The correct answer is C.");
        }

        // Question 2
        System.out.println("\n2. Which of the following is a key component of SDG 9?");
        System.out.println("A. Reducing Inequality");
        System.out.println("B. Affordable and Clean Energy");
        System.out.println("C. Industry and Infrastructure");
        System.out.println("D. Good Health and Well-being");
        char answer2 = Character.toUpperCase(scanner.next().charAt(0));
        if (answer2 == 'C') {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Incorrect. The correct answer is C.");
        }

        // Question 3
        System.out.println("\n3. Which type of infrastructure is emphasized in SDG 9?");
        System.out.println("A. Roads and Highways");
        System.out.println("B. Social Media");
        System.out.println("C. Space Exploration");
        System.out.println("D. Telecommunications");
        char answer3 = Character.toUpperCase(scanner.next().charAt(0));
        if (answer3 == 'D') {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Incorrect. The correct answer is D.");
        }

        // Question 4
        System.out.println("\n4. What is the role of innovation in SDG 9?");
        System.out.println("A. It is not relevant");
        System.out.println("B. It is a key driver of sustainable development");
        System.out.println("C. It only applies to the healthcare sector");
        System.out.println("D. It increases social inequality");
        char answer4 = Character.toUpperCase(scanner.next().charAt(0));
        if (answer4 == 'B') {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Incorrect. The correct answer is B.");
        }

        // Question 5
        System.out.println("\n5. Which industry is NOT associated with SDG 9?");
        System.out.println("A. Information Technology");
        System.out.println("B. Renewable Energy");
        System.out.println("C. Manufacturing");
        System.out.println("D. Agriculture");
        char answer5 = Character.toUpperCase(scanner.next().charAt(0));
        if (answer5 == 'D') {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Incorrect. The correct answer is D.");
        }

        // Question 6
        System.out.println("\n6. What is the importance of resilient infrastructure in SDG 9?");
        System.out.println("A. It helps in increasing pollution");
        System.out.println("B. It reduces the impact of disasters");
        System.out.println("C. It is not relevant to SDG 9");
        System.out.println("D. It only benefits wealthy nations");
        char answer6 = Character.toUpperCase(scanner.next().charAt(0));
        if (answer6 == 'B') {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Incorrect. The correct answer is B.");
        }

        // Question 7
        System.out.println("\n7. What role does sustainable industrialization play in SDG 9?");
        System.out.println("A. It contributes to environmental degradation");
        System.out.println("B. It hinders economic growth");
        System.out.println("C. It is a key driver of economic development");
        System.out.println("D. It only benefits developed countries");
        char answer7 = Character.toUpperCase(scanner.next().charAt(0));
        if (answer7 == 'C') {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Incorrect. The correct answer is C.");
        }

        // Question 8
        System.out.println("\n8. Which of the following is an example of sustainable infrastructure?");
        System.out.println("A. Single-use plastics");
        System.out.println("B. Coal-fired power plants");
        System.out.println("C. High-speed rail systems");
        System.out.println("D. Deforestation");
        char answer8 = Character.toUpperCase(scanner.next().charAt(0));
        if (answer8 == 'C') {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Incorrect. The correct answer is C.");
        }

        // Question 9
        System.out.println("\n9. How does SDG 9 contribute to poverty reduction?");
        System.out.println("A. By increasing social inequality");
        System.out.println("B. By promoting sustainable economic growth");
        System.out.println("C. It has no impact on poverty");
        System.out.println("D. By promoting excessive consumption");
        char answer9 = Character.toUpperCase(scanner.next().charAt(0));
        if (answer9 == 'B') {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Incorrect. The correct answer is B.");
        }

        // Check if the user has answered 7 questions correctly
        if (correctAnswers >= 7) {
            System.out.println("\nCongratulations! You got " + correctAnswers + " questions correct. Game over!");
        } else {
            System.out.println("\nSorry, you did not answer enough questions correctly. Better luck next time!");
        }
    }
}
