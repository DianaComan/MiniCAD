import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public final class ShapeDisplayVisitor extends LineDrawing implements ShapeVisitor {
     public ShapeDisplayVisitor(final BufferedImage image) {
          super(image);
     }
     public ShapeDisplayVisitor() {
     }
     private static final int CI5 = 5;
     private static final int TR3 = 3;
        private static final int DO2 = 2;
        private static final int ZE0 = 0;
        private static final int PA4 = 4;
        private static final int UN1 = 1;
        private static final int D10 = 20;
        public static BufferedImage image = new BufferedImage(D10, D10, BufferedImage.TYPE_INT_RGB);
//pentru fiecare forma se retin culoarea/culorile in rgb/rgb2 si apeleaza procedurile specifice
//pentru desenat, pt contor: CircleDrawing pt cerc, LineDrawing pentru celelalte
//pt umplere: for pt Canvas, Square si Rectangle, FloodFill pentru Circle, Diamond, Triangle si Polygon
     public void visit(final Triangle triangle) throws IOException {
           int red = globals.c[ZE0];
           int green = globals.c[UN1];
           int blue = globals.c[DO2];
           int alpha = globals.a[ZE0];
           int rgb = new Color(red, green, blue, alpha).getRGB();
           File outputfile = new File("drawing.png");
           BufferedImage image1 = image;
           int xx1 = globals.v[ZE0][ZE0];
           int yy1 = globals.v[ZE0][UN1];
           int xx2 = globals.v[UN1][ZE0];
           int yy2 = globals.v[UN1][UN1];
           int xx3 = globals.v[DO2][ZE0];
           int yy3 = globals.v[DO2][UN1];
           image1 = paint(image1, xx1, yy1, xx2, yy2, rgb);
           image1 = paint(image1, xx2, yy2, xx3, yy3, rgb);
           image1 = paint(image1, xx3, yy3, xx1, yy1, rgb);
           image = image1;
           ImageIO.write(image, "png", outputfile);
           int xg = (globals.v[ZE0][ZE0] + globals.v[UN1][ZE0] + globals.v[DO2][ZE0]) / TR3;
           int yg = (globals.v[ZE0][UN1] + globals.v[UN1][UN1] + globals.v[DO2][UN1]) / TR3;
           int r = globals.c[TR3];
           int g = globals.c[PA4];
           int b = globals.c[CI5];
           int al = globals.a[UN1];
           int rgb2 = new Color(r, g, b, al).getRGB();
           image = image1;
           FloodFill c1 = new FloodFill(image);
           c1.floodFillImage(image, xg, yg, rgb2, rgb);
           image = c1.image;
           ImageIO.write(image, "png", outputfile);
      }
      public void visit(final Rectangle rectangle) throws IOException {
           int red = globals.c[ZE0];
           int green = globals.c[UN1];
           int blue = globals.c[DO2];
           int alpha = globals.a[ZE0];
           int rgb = new Color(red, green, blue, alpha).getRGB();
           File outputfile = new File("drawing.png");
           BufferedImage image1 = image;
           int x1 = globals.v[ZE0][ZE0];
           int y1 = globals.v[ZE0][UN1];
           int x2 = globals.v[ZE0][ZE0] + globals.d[UN1];
           int y2 = globals.v[ZE0][UN1] + globals.d[ZE0];
           image1 = paint(image1, x1, y1, x2 - UN1, y1, rgb);
           image1 = paint(image1, x1, y1, x1, y2 - UN1, rgb);
           image1 = paint(image1, x1, y2 - UN1, x2 - UN1, y2 - UN1, rgb);
           image1 = paint(image1, x2 - UN1, y1, x2 - UN1, y2 - UN1, rgb);
           red = globals.c[TR3];
           green = globals.c[PA4];
           blue = globals.c[CI5];
           alpha = globals.a[UN1];
           rgb = new Color(red, green, blue, alpha).getRGB();
           for (int i = x1 + UN1; i < x2 - UN1; i++) {
                  for (int j = y1 + UN1; j < y2 - UN1; j++) {
                       if ((i < image.getWidth()) && (j < image.getHeight())) {
                            image1.setRGB(i, j, rgb);
                       }
                  }
                 }
           image = image1;
           ImageIO.write(image, "png", outputfile);
      }
      public void visit(final Polygon polygon) throws IOException {
           int red = globals.c[ZE0];
           int green = globals.c[UN1];
           int blue = globals.c[DO2];
           int alpha = globals.a[ZE0];
           int rgb = new Color(red, green, blue, alpha).getRGB();
           File outputfile = new File("drawing.png");
           BufferedImage image1 = image;
           int xg = globals.v[ZE0][ZE0];  int yg = globals.v[ZE0][UN1];
           for (int i = ZE0; i < globals.n1 - UN1; i++) {
                image1 = paint(image1, globals.v[i][ZE0], globals.v[i][UN1],
                           globals.v[i + UN1][ZE0], globals.v[i + UN1][UN1], rgb);
                xg = xg + globals.v[i + UN1][ZE0];
                yg = yg + globals.v[i + UN1][UN1];
           }
           image1 = paint(image1, globals.v[globals.n1 - UN1][ZE0],
            globals.v[globals.n1 - UN1][UN1], globals.v[ZE0][ZE0], globals.v[ZE0][UN1], rgb);
           xg = xg / globals.n1;
           yg = yg / globals.n1;
           int r = globals.c[TR3];
           int g = globals.c[PA4];
           int b = globals.c[CI5];
           int al = globals.a[UN1];
           int rgb2 = new Color(r, g, b, al).getRGB();
           image = image1;
           ImageIO.write(image, "png", outputfile);
           FloodFill c1 = new FloodFill(image);
           c1.floodFillImage(image, xg, yg, rgb2, rgb);
           image = c1.image;
           ImageIO.write(image, "png", outputfile);
      }
      public void visit(final Square square) throws IOException {
           int red = globals.c[ZE0];
           int green = globals.c[UN1];
           int blue = globals.c[DO2];
           int alpha = globals.a[ZE0];
           int rgb = new Color(red, green, blue, alpha).getRGB();
           File outputfile = new File("drawing.png");
           BufferedImage image1 = image;
           int x1 = globals.v[ZE0][ZE0];
           int y1 = globals.v[ZE0][UN1];
           int x2 = globals.v[ZE0][ZE0] + globals.d[ZE0];
           int y2 = globals.v[ZE0][UN1] + globals.d[ZE0];
           image1 = paint(image1, x1, y1, x2 - UN1, y1, rgb);
           image1 = paint(image1, x1, y1, x1, y2 - UN1, rgb);
           image1 = paint(image1, x1, y2 - UN1, x2 - UN1, y2 - UN1, rgb);
           image1 = paint(image1, x2 - UN1, y1, x2 - UN1, y2 - UN1, rgb);
           red = globals.c[TR3];
           green = globals.c[PA4];
           blue = globals.c[CI5];
           alpha = globals.a[UN1];
           rgb = new Color(red, green, blue, alpha).getRGB();
           for (int i = x1 + UN1; i < x2 - UN1; i++) {
                  for (int j = y1 + UN1; j < y2 - UN1; j++) {
                       if ((i < image.getWidth()) && (j < image.getHeight())) {
                            image1.setRGB(i, j, rgb);
                       }
                  }
                 }
           image = image1;
           ImageIO.write(image, "png", outputfile);
      }
      public void visit(final Circle circle) throws IOException {
           int red = globals.c[ZE0];
           int green = globals.c[UN1];
           int blue = globals.c[DO2];
           int alpha = globals.a[ZE0];
           int rgb = new Color(red, green, blue, alpha).getRGB();
           File outputfile = new File("drawing.png");
           BufferedImage image1 = image;
           CircleDrawing c = new CircleDrawing();
           int x = globals.v[ZE0][ZE0];
           int y = globals.v[ZE0][UN1];
           int r = globals.d[ZE0];
           red = globals.c[TR3];
           green = globals.c[PA4];
           blue = globals.c[CI5];
           alpha = globals.a[UN1];
           int rgb2 = new Color(red, green, blue, alpha).getRGB();
           image1 = c.paintC(image1, x, y, r, rgb, rgb2);
           image = image1;
           ImageIO.write(image, "png", outputfile);
      }
      public void visit(final Line line) throws IOException {
           int red = globals.c[ZE0];
           int green = globals.c[UN1];
           int blue = globals.c[DO2];
           int alpha = globals.a[ZE0];
           File outputfile = new File("drawing.png");
           int rgb = new Color(red, green, blue, alpha).getRGB();
           BufferedImage image1 = image;
           image1 = paint(image1, globals.v[ZE0][ZE0], globals.v[ZE0][UN1],
                           globals.v[UN1][ZE0], globals.v[UN1][UN1], rgb);
           image = image1;
           ImageIO.write(image1, "png", outputfile);
      }
      public void visit(final Canvas canvas) throws IOException {
           BufferedImage image1 = new BufferedImage(globals.v[ZE0][UN1],
                         globals.v[ZE0][ZE0], BufferedImage.TYPE_INT_ARGB);
           int red = globals.c[ZE0];
           int green = globals.c[UN1];
           int blue = globals.c[DO2];
           int alpha = globals.a[ZE0];
           File outputfile = new File("drawing.png");
           int rgb = new Color(red, green, blue, alpha).getRGB();
           for (int i = ZE0; i < image1.getWidth(); i++) {
                  for (int j = ZE0; j < image1.getHeight(); j++) {
                      image1.setRGB(i, j, rgb);
                  }
           }
           image = image1;
           ImageIO.write(image1, "png", outputfile);
      }
      public void visit(final Diamond diamond) throws IOException {
           int red = globals.c[ZE0];
           int green = globals.c[UN1];
           int blue = globals.c[DO2];
           int alpha = globals.a[ZE0];
           int rgb = new Color(red, green, blue, alpha).getRGB();
           File outputfile = new File("drawing.png");
           BufferedImage image1 = image;
           int x1 = globals.v[ZE0][ZE0];
           int y1 = globals.v[ZE0][UN1] - globals.d[UN1] / DO2;
           int x2 = globals.v[ZE0][ZE0] + globals.d[ZE0] / DO2;
           int y2 = globals.v[ZE0][UN1];
           int x3 = globals.v[ZE0][ZE0];
           int y3 = globals.v[ZE0][UN1] + globals.d[UN1] / DO2;
           int x4 = globals.v[ZE0][ZE0] - globals.d[ZE0] / DO2;
           int y4 = globals.v[ZE0][UN1];
           image1 = paint(image1, x1, y1, x4, y4, rgb);
           image1 = paint(image1, x4, y4, x3, y3, rgb);
           image1 = paint(image1, x3, y3, x2, y2, rgb);
           image1 = paint(image1, x2, y2, x1, y1, rgb);
           int r = globals.c[TR3];
           int g = globals.c[PA4];
           int b = globals.c[CI5];
           int al = globals.a[UN1];
           int rgb2 = new Color(r, g, b, al).getRGB();
           image = image1;
           FloodFill c1 = new FloodFill(image);
          c1.floodFillImage(image, x1, y2, rgb2, rgb);
          image = c1.image;
           ImageIO.write(image, "png", outputfile);
      }
}

