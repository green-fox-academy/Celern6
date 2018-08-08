import sun.java2d.loops.DrawLine;

import javax.swing.*;

import java.util.Scanner;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Draw 3 lines with that function. Use loop for that.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please add the first coordinate");
    int x = scanner.nextInt();
    System.out.println("Please add the second coordinate");
    int y = scanner.nextInt();

    drawLine(x, y, graphics);

  }
  public static void drawLine(int a, int b, Graphics graphics){
    int i = 0;
    while (i<=100){
      graphics.setColor(Color.BLUE);
      graphics.drawLine(a+i, b+i*2, WIDTH/2, HEIGHT/2 );
      i=i+50;
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