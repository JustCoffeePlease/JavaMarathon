package day4;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int m = 12;
        int n = 8;
        int maxSum = 0;
        int maxSumIndex = 0;

        int array[][] = new int[m][n];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 50);

                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {

            int sumString = 0;

            for (int j = 0; j < array[i].length; j++) {
                sumString += array[i][j];
            }
            System.out.println(sumString);

            if (maxSum <= sumString) {
                maxSum = sumString;
                maxSumIndex = i;
            }
        }
        System.out.println("Индекс строки с максимальной суммой: " + maxSumIndex);
    }
}
