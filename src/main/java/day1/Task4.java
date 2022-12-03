package day1;

public class Task4 {
    public static void main(String[] args) {

        int year = 1980;

        System.out.println("Оллимпиада " + year + " года");
        while (year < 2020) {

            year +=4;
            System.out.println("Оллимпиада " + year + " года");
        }
    }
}
