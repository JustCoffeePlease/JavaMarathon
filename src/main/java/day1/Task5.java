package day1;

public class Task5 {
    public static void main(String[] args) {
        int year = 1980;
        System.out.println("Оллимпиада " + year + " года");
        for (int i = 0; i < 10; i++){
            year +=4;
            System.out.println("Оллимпиада " + year + " года");
        }
    }
}
