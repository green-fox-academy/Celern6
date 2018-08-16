package ws180816;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing1 {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.
    int size = 600;
    int stpx = 0;
    int stpy = 0;

    DrawSquareFractal(stpx, stpy, size, graphics);
  }
  public static void DrawSquares(int x, int y, int size, Graphics graphics){
    graphics.drawRect(x, y, size, size);
  }
  public static void DrawSquareFractal(int x,int y,int size, Graphics graphics){
    DrawSquares(x, y, size, graphics);
    if (size > 5) {
      DrawSquareFractal(x+size/3, y, size/3, graphics);
      DrawSquareFractal(x, y+size/3, size/3, graphics);
      DrawSquareFractal(x+size/3, y+size*2/3, size/3, graphics);
      DrawSquareFractal(x+size*2/3, y+size/3, size/3, graphics);
    }
  }

  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 623;

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