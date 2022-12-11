package day8;

public class Task2 {
    public static void main(String[] args) {

        Airplane ilushin = new Airplane("Илюшин", 1985, 88, 1200);
        ilushin.setFuel(85);

        ilushin.info();
        System.out.println(ilushin);

    }
}
