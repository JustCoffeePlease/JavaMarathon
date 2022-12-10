package day7;

public class Player {

    private int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;

    private static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) {
            countPlayers += 1;
        }
        else if (countPlayers >= 6) {
            countPlayers = 6;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){

        if(stamina > MIN_STAMINA) {
            stamina -= 1;
        }
        else if(stamina <= MIN_STAMINA) {
            System.out.println("Один игрок ушел с поля");
            countPlayers -= 1;
        }
    }

    public static void info(){

        if(Player.getCountPlayers() == 6) {
            System.out.println("На поле нет свободных мест");
        } else {
            System.out.println("На поле еще есть " + (6 - Player.getCountPlayers()) + " свободных мест");
        }
    }
}
