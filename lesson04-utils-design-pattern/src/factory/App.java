package factory;

public class App {
    public static void main(String[] args) {

//       1. Shape     : drawing
//       2. Rectangle :drawing , setBorder >> extends Shape
//       3. Square    : drawing            >> extends Shape

        Shape shape = new Shape();
        Square square  = new Square();
        Rectangle rectangle = new Rectangle();

//        parent : new child
        Shape s1 = new Square();
        Shape s2 = new Rectangle();
//        Shape s3 = null;

//        Child : new Parent >> Incompatible type
//        Square c1 = (Square) new Shape();
//        Rectangle c2 = (Rectangle) new Shape();
//        c1.drawing();
//        c2.setBorder();


        shape.drawing(); // 1
        square.drawing(); // 3
        rectangle.drawing(); // 2

        s1.drawing();  // 3
        s2.drawing(); // 2
//        s3.drawing();

//        2.Factory Pattern
        Shape f1 = ShapeFactory.get(ShapeFactory.ShapeType.RECT);
        Shape f2 = ShapeFactory.get(ShapeFactory.ShapeType.SQUARE);
        System.out.println("================");

        f1.drawing();
        f2.drawing();
    }
}
