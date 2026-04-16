// LAB_10 Q6 - Applet: text from keyboard, moving right to left; KeyEvent
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MovingTextApplet extends Applet implements Runnable, KeyListener {
    String text = "Type here";
    int x = 400;
    Thread t;

    public void init() {
        setBackground(Color.WHITE);
        addKeyListener(this);
        setFocusable(true);
    }

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE && text.length() > 0)
            text = text.substring(0, text.length() - 1);
        else if (e.getKeyCode() == KeyEvent.VK_ENTER)
            text += " ";
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {
        if (!Character.isISOControl(e.getKeyChar()))
            text += e.getKeyChar();
    }

    public void run() {
        while (true) {
            x -= 2;
            if (x + getFontMetrics(getFont()).stringWidth(text) < 0) x = getWidth();
            repaint();
            try { Thread.sleep(30); } catch (InterruptedException ex) {}
        }
    }

    public void paint(Graphics g) {
        g.drawString(text, x, 50);
    }
}
