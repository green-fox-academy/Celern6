package ws180817;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingTriangle {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.

    int x = 0;
    int y = 0;
    int size = WIDTH;
    DrawTriangleFractal(x, y, size, graphics);
  }

  public static void DrawTriangle(int x, int y, int size, Graphics graphics) {
    int [] xpoints = {x, x + size/2, x + size};
    int [] ypoints = {y, y + (int) (size*Math.sqrt(3))/2, y};
    int npoints = 3;
    graphics.drawPolygon(xpoints, ypoints, npoints);
  }

  public static void DrawTriangleFractal(int x, int y, int size, Graphics graphics) {
    DrawTriangle(x, y, size, graphics);
    if (size > 5) {
      DrawTriangleFractal(x, y, size / 2, graphics);
      //           DrawSquareFractal(x, y+size/3, size/3, graphics);
      //           DrawSquareFractal(x+size/3, y+size*2/3, size/3, graphics);
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

