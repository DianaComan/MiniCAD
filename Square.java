import java.io.IOException;
public final class Square implements Shape {
        private static Square instance = new Square();
        Square() { }
        public static Square getSquare() {
              return instance;
        }
        @Override
        public void accept(final ShapeVisitor shapeVisitor) throws IOException {
              shapeVisitor.visit(this);
        }
}

