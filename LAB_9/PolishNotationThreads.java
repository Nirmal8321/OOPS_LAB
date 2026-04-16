// LAB_9 Q5 - Polish notation AB*CD/+ -> A*B+C/D using two threads
public class PolishNotationThreads {
    static volatile double result1, result2;
    static char[] expr = "AB*CD/+".toCharArray();

    public static void main(String[] args) throws InterruptedException {
        // Assume A=2,B=3,C=4,D=2 for demo
        final double A = 2, B = 3, C = 4, D = 2;
        Thread t1 = new Thread(() -> result1 = A * B);
        Thread t2 = new Thread(() -> result2 = C / D);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        double result = result1 + result2;
        System.out.println("AB*CD/+ with A=2,B=3,C=4,D=2 -> A*B+C/D = " + result1 + "+" + result2 + " = " + result);
    }
}
