import java.io.IOException;
public final class Rectangle implements Shape {
        private static Rectangle instance = new Rectangle();
        Rectangle() { }
        public static Rectangle getRectangle() {
              return instance;
        }
        @Override
        public void accept(final ShapeVisitor shapeVisitor) throws IOException {
              shapeVisitor.visit(this);
        }
}

