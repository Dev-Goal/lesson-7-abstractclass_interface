package exercise.implement_resizable;

import java.util.Random;

public class GematicTest {
    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(2.0,4.0);
        shapes[2] = new Square(6.0);

        System.out.println("Before: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        for (Shape shape : shapes) {
            double percent = random.nextInt(100);
            shape.resize(percent);
        }
        System.out.println("After");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
