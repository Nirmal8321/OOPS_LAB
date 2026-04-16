// LAB_10 Q1 - Applet: date and time like digital clock
// Run with: appletviewer DigitalClockApplet.html (or use JFrame for standalone)
import java.applet.Applet;
import java.awt.*;
import java.util.Calendar;

public class DigitalClockApplet extends Applet implements Runnable {
    Thread t;
    String timeStr = "";

    public void init() {
        setBackground(Color.BLACK);
        setForeground(Color.GREEN);
        setFont(new Font("Monospaced", Font.BOLD, 24));
    }

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            Calendar c = Calendar.getInstance();
            timeStr = String.format("%02d:%02d:%02d  %02d/%02d/%04d",
                c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND),
                c.get(Calendar.DATE), c.get(Calendar.MONTH) + 1, c.get(Calendar.YEAR));
            repaint();
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }

    public void paint(Graphics g) {
        g.drawString(timeStr, 20, 40);
    }
}
