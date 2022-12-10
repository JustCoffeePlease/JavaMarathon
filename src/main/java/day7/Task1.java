package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane plainBoieng = new Airplane("Boieng", 1985, 88, 65);
        Airplane plainIl = new Airplane("Ilushin", 1996, 110, 86);

        Airplane.compareAirplanes(plainBoieng, plainIl);
    }
}