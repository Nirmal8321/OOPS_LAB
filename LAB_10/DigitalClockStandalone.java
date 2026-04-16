// LAB_10 Q1 - Standalone JFrame version of digital clock (no appletviewer needed)
import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class DigitalClockStandalone extends JPanel implements Runnable {
    Thread t;
    String timeStr = "";

    public DigitalClockStandalone() {
        setBackground(Color.BLACK);
        setForeground(Color.GREEN);
        setFont(new Font("Monospaced", Font.BOLD, 24));
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

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.drawString(timeStr, 20, 40);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Digital Clock");
        f.add(new DigitalClockStandalone());
        f.setSize(350, 80);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
