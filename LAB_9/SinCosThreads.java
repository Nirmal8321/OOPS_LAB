// LAB_9 Q3 - sin(x) and cos(x) using thread (series) vs Math class
public class SinCosThreads {
    static double x;
    static double sinResult, cosResult;

    static double sinSeries(double x, int terms) {
        double sum = 0, term = x;
        for (int n = 0; n < terms; n++) {
            sum += term;
            term *= -x * x / ((2 * n + 2) * (2 * n + 3));
        }
        return sum;
    }

    static double cosSeries(double x, int terms) {
        double sum = 1, term = 1;
        for (int n = 1; n < terms; n++) {
            term *= -x * x / ((2 * n - 1) * (2 * n));
            sum += term;
        }
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        x = Math.PI / 4;
        Thread tSin = new Thread(() -> sinResult = sinSeries(x, 20));
        Thread tCos = new Thread(() -> cosResult = cosSeries(x, 20));
        tSin.start();
        tCos.start();
        tSin.join();
        tCos.join();
        System.out.println("By threads (series): sin=" + sinResult + " cos=" + cosResult);
        System.out.println("By Math class:       sin=" + Math.sin(x) + " cos=" + Math.cos(x));
    }
}
