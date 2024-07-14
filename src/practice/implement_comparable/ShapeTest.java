package practice.implement_comparable;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.0);
        System.out.println(circle);
        circle = new Circle("blue", false, 3.0);
        System.out.println(circle);
    }
}
