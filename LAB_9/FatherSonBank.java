// LAB_9 Q7 - Father deposits until balance > 2000; Son withdraws until < 500; wait/notify
import java.util.Random;

public class FatherSonBank {
    static double balance = 600;
    static final double TARGET_HIGH = 2000, TARGET_LOW = 500;
    static final Object lock = new Object();
    static Random rand = new Random();

    static class Father extends Thread {
        public void run() {
            try {
                while (true) {
                    synchronized (lock) {
                        while (balance >= TARGET_HIGH) lock.wait();
                        double amt = rand.nextInt(200) + 1;
                        balance += amt;
                        System.out.println("Father deposited " + amt + ", balance=" + balance);
                        if (balance >= TARGET_HIGH) lock.notifyAll();
                    }
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {}
        }
    }

    static class Son extends Thread {
        public void run() {
            try {
                while (true) {
                    synchronized (lock) {
                        while (balance <= TARGET_HIGH) lock.wait();
                        if (balance <= TARGET_LOW) continue;
                        double amt = rand.nextInt(150) + 1;
                        if (balance - amt < TARGET_LOW) amt = balance - TARGET_LOW;
                        balance -= amt;
                        System.out.println("Son withdrew " + amt + ", balance=" + balance);
                        if (balance < TARGET_LOW) lock.notifyAll();
                    }
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Father().start();
        new Son().start();
        Thread.sleep(5000);
        System.out.println("Final balance: " + balance);
    }
}
