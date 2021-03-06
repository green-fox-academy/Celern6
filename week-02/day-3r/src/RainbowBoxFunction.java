import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 2 parameters:
    // The square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.
    int x = 20;

    drawRBRect(x, graphics);
  }

  public static void drawRBRect(int a, Graphics graphics) {
      graphics.setColor(new Color(0,0,0));
      graphics.fillRect(WIDTH/2-a/2, HEIGHT/2-a/2, a, a);
      int b = a + 2;
      while (b <= 320){
        int randomc = (int )(Math.random() * 256);
        graphics.setColor(new Color(randomc, randomc, randomc));
        graphics.drawRect(WIDTH/2-b/2, HEIGHT/2-b/2, b, b);
        b = b+2;
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