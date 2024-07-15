package exercise.implement_colorable;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1] = new Square();
        shapes[2] = new Circle();
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            if (shape instanceof Square) {
                Colorable colorable = (Colorable) shape;
                System.out.println(colorable.howtoColor());
            }
        }
    }
}
