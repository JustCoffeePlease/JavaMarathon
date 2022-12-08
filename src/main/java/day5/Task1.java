package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();

        car.setModelOfCar("Kia");
        car.setColorCar("White");
        car.setYearOfCarManufacture(2020);

        System.out.println(car.getModelOfCar());
        System.out.println(car.getColorCar());
        System.out.println(car.getYearOfCarManufacture());
    }
}
