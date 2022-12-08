package day4;

public class Task4 {
    public static void main(String[] args) {

        int[] array = new int[100];
        int maxSum = 0;
        int maxSumIndex = 0;

        // Заполнение случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10000);
        }

        // Деление на тройки и считывание суммы троек
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumIndex);
    }
}
