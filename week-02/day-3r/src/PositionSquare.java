import javax.swing.*;

import java.util.Scanner;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    // avoid code duplication.

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please add the first coordinate");
    int x = scanner.nextInt();
    System.out.println("Please add the second coordinate");
    int y = scanner.nextInt();

    drawRect(x, y, graphics);
  }
  public static void drawRect(int a, int b, Graphics graphics) {
    int i = 0;
    while (i<=120){
      graphics.fillRect(1+i,1+i,50,50);
      i = i+60;
    }
  }

  //    Don't touch the code below
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}