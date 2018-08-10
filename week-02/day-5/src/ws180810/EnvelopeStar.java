package ws180810;

import javax.swing.*;

import java.awt.*;
// Fill the canvas with a checkerboard pattern.
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.green);
    int i = 0;
    int j = 0;
    while (i <= WIDTH/2 && j <= WIDTH/2) {
      graphics.drawLine(i,HEIGHT/2, WIDTH/2, HEIGHT/2 - j);
      i += 10;
      j += 10;
    }
    int k = 0;
    int l = 0;
    while (k <= WIDTH/2 && l <= WIDTH/2) {
      graphics.drawLine(WIDTH-k,HEIGHT/2, WIDTH/2, HEIGHT/2-l);
      k += 10;
      l += 10;
    }
    int m = 0;
    int n = 0;
    while (m <= WIDTH/2 && n <= WIDTH/2) {
      graphics.drawLine(m, HEIGHT/2, WIDTH/2, HEIGHT/2 + n);
      m += 10;
      n += 10;
    }
    int o = 0;
    int p = 0;
    while (o <= WIDTH/2 && p <= WIDTH/2) {
      graphics.drawLine(WIDTH/2, HEIGHT/2+o, WIDTH-p, HEIGHT/2);
      o += 10;
      p += 10;
    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}

