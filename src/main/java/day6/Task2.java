package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane plane = new Airplane("Boeing", 1976, 71, 183500);
        plane.info();
        System.out.println("---------------------------------------------------------------");

        plane.setYear(1986);
        plane.setLength(78);
        plane.fillUp(600);
        plane.info();
        System.out.println("----------------------------------------------------------------");

        plane.fillUp(900);
        System.out.println(plane.getFuel());
    }
}
