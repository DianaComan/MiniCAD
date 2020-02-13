import java.io.IOException;
public final class Circle implements Shape {
        private static Circle instance = new Circle();
        Circle() { }
        public static Circle getCircle() {
              return instance;
        }
        @Override
        public void accept(final ShapeVisitor shapeVisitor) throws IOException {
              shapeVisitor.visit(this);
        }
}

