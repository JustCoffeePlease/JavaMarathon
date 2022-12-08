package day5;

public class Task2 {
    public static void main(String[] args) {

        Motorbike bike = new Motorbike("Honda", "Blue", 2016);

        System.out.println(bike.getModelOfBike());
        System.out.println(bike.getColorBike());
        System.out.println(bike.getYearOfBikeManufacture());
    }
}

