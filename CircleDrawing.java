import java.awt.image.BufferedImage;
import java.io.IOException;
public  class CircleDrawing  {
//numere magice
    static final int tr3 = 3;
    static final int do2 = 2;
    static final int ze0 = 0;
    static final int pa4 = 4;
    static final int sa6 = 6;
    static final int ze1 = 10;
     public CircleDrawing() { }
     public BufferedImage paintC(BufferedImage image,  final int x, final int y,
                        final int rz, final int rgb, final int rgb2) throws IOException {
         int pe = ze0;
         int qu = rz;
         int colo = rgb;
         int de = tr3 - do2 * rz;
         while (pe < qu) {
//se verifica daca variabilile se afla in imagine
              if ((x + pe >= ze0) && (y + qu >= ze0)) {
                   if ((x + pe < image.getWidth()) && (y + qu < image.getHeight())) {
                        image.setRGB(x + pe, y + qu, rgb);
                   }
              }
              if ((x - pe >= ze0) && (y + qu >= ze0)) {
                   if ((x - pe < image.getWidth()) && (y + qu < image.getHeight())) {
                        image.setRGB(x - pe, y + qu, rgb);
                   }
              }
              if ((x + pe >= ze0) && (y - qu >= ze0)) {
                   if ((x + pe < image.getWidth()) && (y - qu < image.getHeight())) {
                        image.setRGB(x + pe, y - qu, rgb);
                   }
              }
              if ((x - pe >= ze0) && (y - qu >= ze0)) {
                   if ((x - pe < image.getWidth()) && (y - qu < image.getHeight())) {
                        image.setRGB(x - pe, y - qu, rgb);
                   }
              }
              if ((x + qu >= ze0) && (y + pe >= ze0)) {
                   if ((x + qu < image.getWidth()) && (y + pe < image.getHeight())) {
                        image.setRGB(x + qu, y + pe, rgb);
                   }
              }
              if ((x - qu >= ze0) && (y + pe >= ze0)) {
                   if ((x - qu < image.getWidth()) && (y + pe < image.getHeight())) {
                        image.setRGB(x - qu, y + pe, rgb);
                   }
              }
              if ((x + qu >= ze0) && (y - pe >= ze0)) {
                   if ((x + qu < image.getWidth()) && (y - pe < image.getHeight())) {
                        image.setRGB(x + qu, y - pe, rgb);
                   }
              }
              if ((x - qu >= ze0) && (y - pe >= ze0)) {
                   if ((x - qu < image.getWidth()) && (y - pe < image.getHeight())) {
                        image.setRGB(x - qu, y - pe, rgb);
                   }
              }
              pe++;
              if (de < ze0) {
                   de = de + pa4 * pe + sa6;
              } else {
                   qu--;
                   de = de + pa4 * (pe - qu) + ze1;
              }
              if ((x + pe >= ze0) && (y + qu >= ze0)) {
                   if ((x + pe < image.getWidth()) && (y + qu < image.getHeight())) {
                        image.setRGB(x + pe, y + qu, rgb);
                   }
              }
              if ((x - pe >= ze0) && (y + qu >= ze0)) {
                   if ((x - pe < image.getWidth()) && (y + qu < image.getHeight())) {
                        image.setRGB(x - pe, y + qu, rgb);
                   }
              }
              if ((x + pe >= ze0) && (y - qu >= ze0)) {
                   if ((x + pe < image.getWidth()) && (y - qu < image.getHeight())) {
                        image.setRGB(x + pe, y - qu, rgb);
                   }
              }
              if ((x - pe >= ze0) && (y - qu >= ze0)) {
                   if ((x - pe < image.getWidth()) && (y - qu < image.getHeight())) {
                        image.setRGB(x - pe, y - qu, rgb);
                   }
              }
              if ((x + qu >= ze0) && (y + pe >= ze0)) {
                   if ((x + qu < image.getWidth()) && (y + pe < image.getHeight())) {
                        image.setRGB(x + qu, y + pe, rgb);
                   }
              }
              if ((x - qu >= ze0) && (y + pe >= ze0)) {
                   if ((x - qu < image.getWidth()) && (y + pe < image.getHeight())) {
                        image.setRGB(x - qu, y + pe, rgb);
                   }
              }
              if ((x + qu >= ze0) && (y - pe >= ze0)) {
                   if ((x + qu < image.getWidth()) && (y - pe < image.getHeight())) {
                        image.setRGB(x + qu, y - pe, rgb);
                   }
              }
              if ((x - qu >= ze0) && (y - pe >= ze0)) {
                   if ((x - qu < image.getWidth()) && (y - pe < image.getHeight())) {
                        image.setRGB(x - qu, y - pe, rgb);
                   }
              }
         }
//produce umplerea cercului
         FloodFill c1 = new FloodFill(image);
         c1.floodFillImage(image, x, y, rgb2, colo);
         image = c1.image;
         return image;
    }
}
