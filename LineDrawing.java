import java.awt.image.BufferedImage;
import java.io.IOException;
public class LineDrawing {
    BufferedImage image;
    public LineDrawing(final BufferedImage image) {
        this.image = image;
    }
    public LineDrawing() {
    }
//deseaneaza linii folosind algoritmul lui Brehensam
    public BufferedImage paint(final BufferedImage image1, final int x0,
                 final int y0, final int x1, final int y1, final int rgb) throws IOException {
        int fraction = 0, xstep = 0, ystep = 0;
         final int un1 = 1;
         final int do2 = 2;
         final int ze0 = 0;
        image = image1;
        int inter = ze0;
        int x = x0;
        int y = y0;
        int dx = x1 - x0;
        int dy = y1 - y0;
        if (dy < ze0) {
            dy = -dy;
            ystep = -un1;
        } else {
            ystep = un1;
        }
        if (dx < ze0) {
            dx = -dx;
            xstep = -un1;
        } else {
            xstep = un1;
        }
        if (dy > dx)  {
            int de = dy;
            dy = dx;
            dx = de;
            inter = un1;
        }
        int error = do2 * dy - dx;
        for (int i = ze0; i <= dx; i++) {
//verifica daca liniile sunt in limita dimensiunilor imaginii
            if ((x >= ze0) && (y >= ze0)) {
                if ((x < image.getWidth()) && (y < image.getHeight())) {
                    image.setRGB(x, y, rgb);
                }
            }
            while (error > ze0) {
                if (inter == un1) {
                    x = x + xstep;
                } else {
                    y = y + ystep;
                }
            error = error - do2 * dx;
            }
            if (inter == un1) {
                y = y + ystep;
            } else {
                x = x + xstep;
            }
            error = error + do2 * dy;
        }
        return image;
    }
}

