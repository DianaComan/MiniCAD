import java.io.IOException;
public class ShapeFactory implements Shape {
     Shape[] parts;
       public ShapeFactory(final String shapeType) {
           if (shapeType.equalsIgnoreCase("Circle")) {
               parts = new Shape[] {new Circle()};
           }
           if (shapeType.equalsIgnoreCase("Rectangle")) {
               parts = new Shape[] {new Rectangle()};
           }
           if (shapeType.equalsIgnoreCase("Polygon")) {
               parts = new Shape[] {new Polygon()};
            }
           if (shapeType.equalsIgnoreCase("Line")) {
               parts = new Shape[] {new Line()};
           }
           if (shapeType.equalsIgnoreCase("Canvas")) {
               parts = new Shape[] {new Canvas()};
           }
           if (shapeType.equalsIgnoreCase("Diamond")) {
               parts = new Shape[] {new Diamond()};
           }
           if (shapeType.equalsIgnoreCase("Square")) {
               parts = new Shape[] {new Square()};
           }
           if (shapeType.equalsIgnoreCase("Triangle")) {
               parts = new Shape[] {new Triangle()};
           }
       }
       @Override
       public void accept(ShapeVisitor shapeVisitor) throws IOException {
          for (int i = 0; i < parts.length; i++) {
             parts[i].accept(shapeVisitor);
          }
       }
    }

