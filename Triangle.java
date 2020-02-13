import java.io.IOException;
public final class Triangle implements Shape {
        private static Triangle instance = new Triangle();
        Triangle() { }
        public static Triangle getTriangle() {
              return instance;
        }
        @Override
        public void accept(final ShapeVisitor shapeVisitor) throws IOException {
              shapeVisitor.visit(this);
        }
}

