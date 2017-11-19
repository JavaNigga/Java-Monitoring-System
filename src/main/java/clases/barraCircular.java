package clases;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JProgressBar;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class barraCircular extends BasicProgressBarUI {
     @Override public Dimension getPreferredSize(JComponent c) {
    Dimension d = super.getPreferredSize(c);
    int v = Math.max(d.width, d.height);
    d.setSize(v, v);
    return d;
  }
  @Override public void paint(Graphics g, JComponent c) {
    Insets b = progressBar.getInsets(); // area for border
    int barRectWidth  = progressBar.getWidth()  - b.right - b.left;
    int barRectHeight = progressBar.getHeight() - b.top - b.bottom;
    if (barRectWidth <= 0 || barRectHeight <= 0) {
      return;
    }

    // draw the cells
    Graphics2D g2 = (Graphics2D) g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setPaint(progressBar.getForeground());
    double degree = 360 * progressBar.getPercentComplete();
    double sz = Math.min(barRectWidth, barRectHeight);
    double cx = b.left + barRectWidth  * .5;
    double cy = b.top  + barRectHeight * .5;
    double or = sz * .5;
    double ir = or * .5; //or - 20;
    Shape inner = new Ellipse2D.Double(cx - ir, cy - ir, ir * 2, ir * 2);
    Shape outer = new Arc2D.Double(
        cx - or, cy - or, sz, sz, 90 - degree, degree, Arc2D.PIE);
    Area area = new Area(outer);
    area.subtract(new Area(inner));
    g2.fill(area);
    g2.dispose();

    // Deal with possible text painting
    if (progressBar.isStringPainted()) {
      paintString(g, b.left, b.top, barRectWidth, barRectHeight, 0, b);
    }
  }
  
  public JProgressBar makeUI(int valor, Color color, int px, int py, int tx, int ty) {
    JProgressBar progress = new JProgressBar();
    // use JProgressBar#setUI(...) method
    progress.setUI(new barraCircular());
    progress.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
    progress.setStringPainted(true);
    progress.setFont(progress.getFont().deriveFont(24f));
    progress.setForeground(color);
    progress.setBackground(Color.WHITE);
    progress.setValue(valor);
    progress.setBounds(px, py, tx, ty);
   // JProgressBar p = new JProgressBar();
   // p.add(progress);
    return progress;
  }
  /*public static void main(String... args) {
    EventQueue.invokeLater(() -> {
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      f.getContentPane().add(new barraCircular().makeUI(50, Color.BLUE));
      f.setSize(320, 240);
      f.setLocationRelativeTo(null);
      f.setVisible(true);
    });
  }*/
  
}
