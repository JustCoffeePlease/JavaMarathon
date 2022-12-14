package day9.Task2;

public class Rectangle extends AFigure{

    double height;
    double width;

    public Rectangle(double height, double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return this.height * this.width;
    }

    @Override
    public double perimeter() {
        return 2 * this.height + 2 * this.width;
    }
}
