import java.io.IOException;
public final class Canvas implements Shape {
        private static Canvas instance = new Canvas();
        Canvas() { }
        public static Canvas getCanvas() {
              return instance;
        }
        @Override
        public void accept(final ShapeVisitor shapeVisitor) throws IOException {
              shapeVisitor.visit(this);
        }
}

