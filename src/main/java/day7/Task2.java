package day7;

public class Task2 {
    public static void main(String[] args) {

        Player player1 = new Player(80);
        Player player2 = new Player(90);
        Player player3 = new Player(95);
        Player player4 = new Player(98);
        Player player5 = new Player(91);
        Player player6 = new Player(84);

        Player.info();
        System.out.println("-------------------------------");

        while (player1.getStamina() > 0){
            player1.run();
        }

        System.out.println(player1.getStamina());

        Player.info();
    }
}
