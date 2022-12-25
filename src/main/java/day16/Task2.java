package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        Random random = new Random();

        File file_1 = new File("file_1_from_day_16.txt");
        PrintWriter printWriter_1 = new PrintWriter(file_1);

        for(int i = 0; i < 1000; i++) {
            printWriter_1.println(random.nextInt(100));
        }
        printWriter_1.close();

        Scanner scanner = new Scanner(file_1);
        File file_2 = new File("file_2_from_day_16.txt");
        PrintWriter printWriter_2 = new PrintWriter(file_2);

        int counter = 0;
        int sum = 0;

        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            counter++;

            if(counter == 20) {
                printWriter_2.println(sum / 20.0);

                counter = 0;
                sum = 0;
            }
        }

        printWriter_2.close();

        Scanner scanner2 = new Scanner(file_2);

        double result = 0;

        while (scanner2.hasNextLine()) {
            result += Double.parseDouble(scanner2.nextLine());
        }

        System.out.println(result);
//        System.out.println((int)result);
    }
}
