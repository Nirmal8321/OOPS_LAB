import java.util.Scanner;

/**
 * LAB 5 – Q7: Multiple choice quiz grader (8 questions)
 * 
 * Correct answers: 1.C, 2.A, 3.B, 4.D, 5.B, 6.C, 7.C, 8.A
 * Pass marks: 5 out of 8
 * Unanswered questions are represented by an empty input or 'X'.
 * 
 * This version reads the answers interactively from the user using a Scanner.
 */
public class QuizGrader {

    enum Result { CORRECT, WRONG, UNANSWERED }

    private static final char[] CORRECT_ANSWERS = {
        'C', 'A', 'B', 'D', 'B', 'C', 'C', 'A'
    };
    private static final int PASS_MARKS = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] submitted = new char[8];

        System.out.println("Enter your answers for the 8 questions (or press Enter for unanswered):");
        for (int i = 0; i < 8; i++) {
            System.out.printf("Question %d: ", i + 1);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                submitted[i] = 'X';
            } else {
                // Take first character, convert to uppercase
                submitted[i] = Character.toUpperCase(input.charAt(0));
            }
        }

        // Grade the quiz
        Result[] results = new Result[8];
        int correct = 0, wrong = 0, unanswered = 0;
        for (int i = 0; i < 8; i++) {
            if (submitted[i] == 'X') {
                results[i] = Result.UNANSWERED;
                unanswered++;
            } else if (submitted[i] == CORRECT_ANSWERS[i]) {
                results[i] = Result.CORRECT;
                correct++;
            } else {
                results[i] = Result.WRONG;
                wrong++;
            }
        }

        // Display report
        System.out.println("\nQUIZ GRADING REPORT");
        System.out.println("============================================================");
        System.out.printf("%-8s | %-15s | %-12s | %s\n",
                "QUESTION", "SUBMITTED ANS", "CORRECT ANS", "RESULT");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.printf("%-8d | %-15c | %-12c | %s\n",
                    i + 1, submitted[i], CORRECT_ANSWERS[i], results[i]);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("No. of correct answers   : " + correct);
        System.out.println("No. of wrong answers     : " + wrong);
        System.out.println("No. of unanswered        : " + unanswered);
        System.out.println("------------------------------------------------------------");
        System.out.println(correct >= PASS_MARKS ? "The candidate PASSED." : "The candidate FAILED.");
        System.out.println("============================================================");

        scanner.close();
    }
}