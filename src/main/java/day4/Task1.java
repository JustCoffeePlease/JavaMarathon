package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();

        int[] array = new int[sizeOfArray];

        int countMoreEight = 0;
        int countEqualsOne = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        int sum = 0;

        for (int num = 0; num < sizeOfArray; num++) {

            array[num] = (int)(Math.random() * 10);

            if(array[num] > 8) countMoreEight++;
            if(array[num] == 1) countEqualsOne++;
            if(array[num] % 2 == 0) evenNumbers++;
            if(array[num] % 2 != 0) oddNumbers++;

            sum += array[num];

        }

        // Вывод массива
        System.out.println(Arrays.toString(array));
        // Вывод длины массива
        System.out.println("Длина массива: " + array.length);
        // Вывод количества чисел больше 8
        System.out.println("Количество чисел больше 8: " + countMoreEight);
        // Вывод количества чисел равных единице
        System.out.println("Количество чисел равных единице: " + countEqualsOne);
        // Вывод количества четных чисел
        System.out.println("Количество четных чисел: " + evenNumbers);
        // Вывод количества нечетных чисел
        System.out.println("Количество нечетных чисел: " + oddNumbers);
        // Вывод суммы всех элементов массива
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
