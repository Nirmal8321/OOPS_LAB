// LAB_5 Q7 - Multiple choice quiz grader, 8 questions, enum, program arguments
public class QuizGrader {
    enum Result { CORRECT, WRONG, UNANSWERED }

    static final char[] CORRECT_ANS = { 'C', 'A', 'B', 'D', 'B', 'C', 'C', 'A' };
    static final int PASS_MARKS = 5;

    public static void main(String[] args) {
        char[] submitted = new char[8];
        for (int i = 0; i < 8; i++)
            submitted[i] = (i < args.length && args[i].length() > 0) ? args[i].toUpperCase().charAt(0) : 'X';

        Result[] results = new Result[8];
        int correct = 0, wrong = 0, unanswered = 0;
        for (int i = 0; i < 8; i++) {
            if (submitted[i] == 'X') {
                results[i] = Result.UNANSWERED;
                unanswered++;
            } else if (submitted[i] == CORRECT_ANS[i]) {
                results[i] = Result.CORRECT;
                correct++;
            } else {
                results[i] = Result.WRONG;
                wrong++;
            }
        }

        System.out.println("QUESTION  SUBMITTED ANS  CORRECT ANS  RESULT");
        for (int i = 0; i < 8; i++)
            System.out.println((i + 1) + "         " + submitted[i] + "              " + CORRECT_ANS[i] + "            " + results[i]);
        System.out.println("No. of correct answers: " + correct);
        System.out.println("No. of wrong answers: " + wrong);
        System.out.println("No. of questions unanswered: " + unanswered);
        System.out.println(correct >= PASS_MARKS ? "The candidate passed." : "The candidate failed.");
    }
}
