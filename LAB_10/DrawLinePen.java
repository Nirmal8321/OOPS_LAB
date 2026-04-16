// LAB_10 Q3 - Draw line by mouse press and drag (pen tool)
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawLinePen extends JFrame {
    int startX, startY, endX, endY;
    java.util.List<int[]> lines = new java.util.ArrayList<>();

    public DrawLinePen() {
        setTitle("Pen - Drag to draw");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int[] l : lines) g.drawLine(l[0], l[1], l[2], l[3]);
            }
        };
        p.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                startX = e.getX(); startY = e.getY();
            }
            public void mouseReleased(MouseEvent e) {
                endX = e.getX(); endY = e.getY();
                lines.add(new int[]{ startX, startY, endX, endY });
                repaint();
            }
        });
        p.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                endX = e.getX(); endY = e.getY();
                lines.add(new int[]{ startX, startY, endX, endY });
                startX = endX; startY = endY;
                repaint();
            }
        });
        add(p);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DrawLinePen().setVisible(true));
    }
}
