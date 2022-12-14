package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

        AFigure[] figure = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedPerimeter(figure));
        System.out.println(calculateRedArea(figure));

    }
    public static  double calculateRedPerimeter(AFigure[] figures){

        double sumOfPerimeters = 0;
        int n = 0;

        while (n < figures.length) {

            if (figures[n].color == "Red") {
                sumOfPerimeters += figures[n].perimeter();
            }
            n++;
        }
        return sumOfPerimeters;
    }

    public static double calculateRedArea(AFigure[] figures){

        double sumOfArea = 0;
        int n = 0;

        while (n < figures.length) {

            if (figures[n].color == "Red") {
                sumOfArea += figures[n].area();
            }
            n++;
        }
        return sumOfArea;

        }
    }
