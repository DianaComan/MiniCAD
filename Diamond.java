import java.io.IOException;
public final class Diamond implements Shape {
        private static Diamond instance = new Diamond();
        Diamond() { }
        public static Diamond getDiamond() {
              return instance;
        }
        @Override
        public void accept(final ShapeVisitor shapeVisitor) throws IOException {
              shapeVisitor.visit(this);
        }
}

