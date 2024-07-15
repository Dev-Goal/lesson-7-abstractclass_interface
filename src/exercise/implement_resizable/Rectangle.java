package exercise.implement_resizable;

public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double height = 2.0;

    public Rectangle() {
    }

    public Rectangle(double weight, double height) {
        this.width = weight;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double weight, double height) {
        super(color, filled);
        this.width = weight;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth() + " and height = " + getHeight()
                + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        width *= percent;
        height *= percent;
    }
}
