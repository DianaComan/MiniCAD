import java.io.IOException;
public interface ShapeVisitor {
         void visit(Triangle triangle) throws IOException;
         void visit(Rectangle rectangle) throws IOException;
         void visit(Polygon polygon) throws IOException;
         void visit(Circle circle) throws IOException;
         void visit(Canvas canvas) throws IOException;
         void visit(Diamond diamond) throws IOException;
         void visit(Square square) throws IOException;
         void visit(Line line) throws IOException;
}

