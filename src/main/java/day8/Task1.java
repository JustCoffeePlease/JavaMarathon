package day8;

public class Task1 {
    public static void main(String[] args) {

        String string = "0";

        long concatTime = System.currentTimeMillis();
        for (int i = 1; i <= 20000; i++) {
            string += " ";
            string += i;
        }
        
        System.out.println(string);

        System.out.print("Время выполнения: ");
        System.out.println(System.currentTimeMillis() - concatTime);

        System.out.println("------------------------------------------");

        long stringBuilderTime = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 2000; i++) {
            stringBuilder.append(i).append(" ");
        }

        System.out.println(stringBuilder);
        System.out.print("Время выполнения: ");
        System.out.println(System.currentTimeMillis() - stringBuilderTime);


    }
}
