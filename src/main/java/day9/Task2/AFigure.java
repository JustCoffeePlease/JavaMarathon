package day9.Task2;

public abstract class AFigure {

    protected String color;

    public AFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();

}
