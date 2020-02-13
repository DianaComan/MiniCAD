import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;
public class FloodFill {
    BufferedImage image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
    public FloodFill(BufferedImage image) {
        this.image = image;
    }
//stabileste reperele care trebuie modificate
    public final void floodFillImage( BufferedImage image, final int x, final int y,
                                     final int rgb, final int oldrgb) {
       int color = oldrgb;
//folosit pt a verifica daca punctele se afla in limitele stabilite
       boolean[][] hits = new boolean[image.getHeight()][image.getWidth()];
//retine punctele de colorat
       Queue<Point> queue = new LinkedList<Point>();
       queue.add(new Point(x, y));
       while (!queue.isEmpty()) {
             Point p = queue.remove();
//adauga vecinii daca punctul e valid
             if (floodFillImageDo(image, hits, p.x, p.y, color, rgb)) {
                    queue.add(new Point(p.x, p.y - 1));
                    queue.add(new Point(p.x, p.y + 1));
                    queue.add(new Point(p.x - 1, p.y));
                    queue.add(new Point(p.x + 1, p.y));
             }
          }
       }
//verifica daca culoarea se va modifica. si o modifica in caz afirmativ
       private static boolean floodFillImageDo(BufferedImage image,
                         final boolean[][] hits, final int x, final int y,
                            final int color, final int color2) {
            if (y < 0) {
               return false;
            }
            if (x < 0) {
              return false;
            }
            if (y > image.getHeight() - 1) {
              return false;
            }
            if (x > image.getWidth() - 1) {
              return false;
            }
//verifica daca culoarea a mai fost modificata
            if (hits[y][x]) {
              return false;
            }
//verifica daca s-a gasit contur
            if (image.getRGB(x, y) == color) {
                return false;
            }
            image.setRGB(x, y, color2);
            hits[y][x] = true;
            return true;
        }
}

