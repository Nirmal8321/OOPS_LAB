// LAB_9 Q1 - Thread by extending Thread, started from main of another class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }
}

public class ThreadExtendDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("Thread-A");
        t2.setName("Thread-B");
        t1.start();
        t2.start();
    }
}
