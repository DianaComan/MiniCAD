import java.io.IOException;
public interface Shape {
    void accept(ShapeVisitor shapeVisitor) throws IOException;
}

