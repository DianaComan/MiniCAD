import java.io.IOException;
public final class Line implements Shape {
        private static Line instance = new Line();
        Line() { }
        public static Line getLine() {
              return instance;
        }
        @Override
        public void accept(final ShapeVisitor shapeVisitor) throws IOException {
              shapeVisitor.visit(this);
        }
}

