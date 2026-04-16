// LAB_9 Q2 - Thread by implementing Runnable, created and started in constructor
class MyRunnable implements Runnable {
    Thread t;
    MyRunnable(String name) {
        t = new Thread(this, name);
        t.start();
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        new MyRunnable("Runnable-1");
        new MyRunnable("Runnable-2");
    }
}
