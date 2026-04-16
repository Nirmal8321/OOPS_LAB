// LAB_10 Q4 - Word font size 6 expanding to 96 and collapsing, repeated
import javax.swing.*;
import java.awt.*;

public class ExpandCollapseWord extends JPanel {
    int fontSize = 6;
    int step = 2;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Serif", Font.BOLD, fontSize));
        FontMetrics fm = g.getFontMetrics();
        String s = "OOP";
        int x = (getWidth() - fm.stringWidth(s)) / 2;
        int y = getHeight() / 2 + fm.getAscent() / 2;
        g.drawString(s, x, y);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Expand/Collapse");
        ExpandCollapseWord p = new ExpandCollapseWord();
        f.add(p);
        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        new Timer(50, e -> {
            p.fontSize += p.step;
            if (p.fontSize >= 96) p.step = -2;
            if (p.fontSize <= 6) p.step = 2;
            p.repaint();
        }).start();
    }
}
