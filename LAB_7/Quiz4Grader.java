// LAB_7 Q7 - Quiz 4 questions, enum, pass 2 out of 4
public class Quiz4Grader {
    enum Result { CORRECT, WRONG, UNANSWERED }

    static final char[] CORRECT_ANS = { 'C', 'A', 'B', 'D' };
    static final int PASS_MARKS = 2;

    public static void main(String[] args) {
        char[] submitted = new char[4];
        for (int i = 0; i < 4; i++)
            submitted[i] = (i < args.length && args[i].length() > 0) ? args[i].toUpperCase().charAt(0) : 'X';

        int correct = 0, wrong = 0;
        System.out.println("QUESTION  SUBMITTED ANS  CORRECT ANS  RESULT");
        for (int i = 0; i < 4; i++) {
            Result r;
            if (submitted[i] == 'X') r = Result.UNANSWERED;
            else if (submitted[i] == CORRECT_ANS[i]) { r = Result.CORRECT; correct++; }
            else { r = Result.WRONG; wrong++; }
            System.out.println((i + 1) + "         " + submitted[i] + "              " + CORRECT_ANS[i] + "            " + r);
        }
        System.out.println("No. of correct answers: " + correct);
        System.out.println("No. of wrong answers: " + wrong);
        System.out.println(correct >= PASS_MARKS ? "The candidate passed." : "The candidate failed.");
    }
}
