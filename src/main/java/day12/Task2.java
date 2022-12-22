package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i <= 30; i++) {
            oddNumbers.add(i);
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 300; i <= 350; i++) {
            oddNumbers.add(i);
            System.out.print(i + " ");
        }

    }
}
