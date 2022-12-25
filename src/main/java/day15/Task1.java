package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/resources/shoes.csv");
        Scanner scanner = new Scanner(file);

        File fileOut = new File("src/main/resources/shoesResult.txt");
        PrintWriter printWriter = new PrintWriter(fileOut);

        while (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(";");

            if (Integer.parseInt(array[2]) == 0) {
                printWriter.println(array[0] + ", " + array[1] + ", " + array[2]);
            }
        }
        printWriter.close();
        scanner.close();
    }
}
