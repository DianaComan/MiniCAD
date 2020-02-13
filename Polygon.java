import java.io.IOException;
public final class Polygon implements Shape {
        private static Polygon instance = new Polygon();
        Polygon() { }
        public static Polygon getPolygon() {
              return instance;
        }
        @Override
        public void accept(final ShapeVisitor shapeVisitor) throws IOException {
              shapeVisitor.visit(this);
        }
}

