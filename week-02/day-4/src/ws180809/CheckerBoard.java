import javax.swing.*;

import java.awt.*;
// Fill the canvas with a checkerboard pattern.
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
  public static void mainDraw(Graphics graphics) {
    int i = 0;
    int k = 0;

    while (i <= 320) {
      graphics.setColor(Color.BLACK);
      graphics.fillRect(0 + i, 0, 40, 40);
      graphics.fillRect(0 + i, 80, 40, 40);
      graphics.fillRect(0 + i, 160, 40, 40);
      graphics.fillRect(0 + i, 240, 40, 40);
      i += 80;;
    }
    while (k < 280) {
      graphics.setColor(Color.BLACK);
      graphics.fillRect(40 + k, 40, 40, 40);
      graphics.fillRect(40 + k, 120, 40, 40);
      graphics.fillRect(40 + k, 200, 40, 40);
      graphics.fillRect(40 + k, 280, 40, 40);
      k += 80;
    }}

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