package day9.Task2;

public class Triangle extends AFigure{

    protected double legOne;
    protected  double legTwo;
    protected double Hypotenuse;

    public Triangle(double legOne, double legTwo, double Hypotenuse, String color) {
        super(color);
        this.legOne = legOne;
        this.legTwo = legTwo;
        this.Hypotenuse = Hypotenuse;
    }

    public double getLegOne() {
        return legOne;
    }

    public double getLegTwo() {
        return legTwo;
    }

    public double getHypotenuse() {
        return Hypotenuse;
    }

    public void setLegOne(double legOne) {
        this.legOne = legOne;
    }

    public void setLegTwo(double legTwo) {
        this.legTwo = legTwo;
    }

    public void setHypotenuse(double hypotenuse) {
        Hypotenuse = hypotenuse;
    }

    @Override
    public double area() {
        double p = this.perimeter() / 2;
        return Math.sqrt(p * (p - legOne) * (p - legTwo) * (p - Hypotenuse));
    }

    @Override
    public double perimeter() {
        return this.Hypotenuse + this.legOne + this.legTwo;
    }
}
