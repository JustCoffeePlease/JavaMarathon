package day4;

public class Task2 {
    public static void main(String[] args) {

        // Инициализация массива
        int[] array = new int[100];
        // Переменная максимального и минимального значения массива
        int max = array[0];
        int min = array[0];
        // Переменная количества элементов массива, окагчивающихся на 0
        int endingInZero = 0;
        // Переменная суммы элементов массива, оканчивающихся на ноль
        int sumElementsEndingInZero = 0;

        for (int num : array) {
            // Заполнение массива данными
            array[num] = (int)(Math.random() * 1000);
            // Поиск максимального значения
            if (array[num] > max) {
                max = array[num];
            }
            // Поиск минимального значения
            if (array[num] < min) {
                min = array[num];
            }
            // Поиск количества элементов, оканчивающихся на ноль
            // Поиск суммы элементов, оканчивающихся на ноль
            if (array[num] % 10 == 0) {
                endingInZero++;
                sumElementsEndingInZero += array[num];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Количество элементов, оканчивающихся на ноль: " + endingInZero);
        System.out.println("Сумма элементов, оканчивающихся на ноль: " + sumElementsEndingInZero);



    }
}
