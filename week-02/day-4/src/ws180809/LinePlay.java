import javax.swing.*;

import java.awt.*;
// Fill the canvas with a checkerboard pattern.
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    int i = 0;
    int j = 10;
    while (i <= WIDTH && j <= WIDTH) {
      graphics.drawLine(i,0, 320, j);
      i += 10;
      j += 10;
    }
    int k = 0;
    int m = 10;
    while (k <= 320 && m <= 320) {
      graphics.drawLine(0,k, m, 320);
      k += 10;
      m += 10;
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
