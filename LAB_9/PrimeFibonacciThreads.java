// LAB_9 Q6 - 25 primes and 50 Fibonacci; Fib priority 8, Prime 5; Fib sleeps after 50, then continue
import java.util.ArrayList;
import java.util.List;

public class PrimeFibonacciThreads {
    static List<Integer> primes = new ArrayList<>();
    static long[] fib = new long[51];
    static final Object lock = new Object();
    static boolean primesDone = false;

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread fibThread = new Thread(() -> {
            fib[1] = fib[2] = 1;
            for (int i = 3; i <= 50; i++) fib[i] = fib[i - 1] + fib[i - 2];
            System.out.println("First 50 Fibonacci computed.");
            synchronized (lock) {
                try { while (!primesDone) lock.wait(); } catch (InterruptedException e) {}
            }
            System.out.println("Fibonacci thread continuing (e.g. next terms).");
        });
        Thread primeThread = new Thread(() -> {
            for (int n = 2; primes.size() < 25; n++)
                if (isPrime(n)) primes.add(n);
            System.out.println("First 25 primes: " + primes);
            synchronized (lock) { primesDone = true; lock.notifyAll(); }
        });
        fibThread.setPriority(8);
        primeThread.setPriority(5);
        fibThread.start();
        primeThread.start();
        fibThread.join();
        primeThread.join();
        System.out.println("Fib[50] = " + fib[50]);
    }
}
