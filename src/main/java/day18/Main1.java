package day18;

public class Main1 {

    public static void main(String[] args) {

        int[] numbers = {1, 10, 1241, 50402, -2, 249, 10215, 665, 2295, 7, 311};
//        System.out.println(numbers.length);
        System.out.println(recursionSum(numbers, numbers.length));
    }

    public static int recursionSum(int[] array, int arrayLength) {
        if(arrayLength <= 0) {
            return 0;
        }
        int sum = array[arrayLength - 1];

        return sum + recursionSum(array, arrayLength - 1);
    }
}
