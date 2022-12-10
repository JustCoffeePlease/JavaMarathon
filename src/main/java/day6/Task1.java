package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();

        car.setModelOfCar("Kia");
        car.setColorCar("White");
        car.setYearOfCarManufacture(2020);

        String model = car.getModelOfCar();
        String color = car.getColorCar();
        int yearOfManufacture = car.getYearOfCarManufacture();

        System.out.println(car.info());
        System.out.println(model + "\n"+ color + "\n" + yearOfManufacture);
        System.out.println("Age of car: " + car.yearDifference(yearOfManufacture));

        System.out.println();

        Motorbike bike = new Motorbike("Honda", "blue", 2018);
        System.out.println(bike.info());
        System.out.println("Age of bike: " + bike.yearDifference(yearOfManufacture));


    }
}
