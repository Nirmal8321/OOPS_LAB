// LAB_10 Q5 - Name in three font styles, different sizes
import javax.swing.*;
import java.awt.*;

public class FontStylesName extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        String name = "Your Name";
        g.setFont(new Font("Serif", Font.PLAIN, 20));
        g.drawString(name, 20, 40);
        g.setFont(new Font("SansSerif", Font.BOLD, 28));
        g.drawString(name, 20, 80);
        g.setFont(new Font("Monospaced", Font.ITALIC, 36));
        g.drawString(name, 20, 130);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Font styles");
        f.add(new FontStylesName());
        f.setSize(350, 180);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
