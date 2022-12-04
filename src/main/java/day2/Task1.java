package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();

        // Малоэтажный дом
        if (number < 5 && number > 0) {
            System.out.println("Малоэтажный дом");
        } else if
        // Среднеэтажный дом
            (number < 9 && number > 4) {
                System.out.println("Среднеэтажный дом");
        } else if
        // Многоэтажный дом
            (number > 8) {
                System.out.println("Многоэтажный дом");
        }
         else {
            System.out.println("Ошибка ввода");
        }

    }
}