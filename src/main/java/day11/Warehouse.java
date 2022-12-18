package day11;

public class Warehouse {

    private int countOrder = 0; // Колличество собранных заказов
    private int balance = 0; // Доход от доставленных заказов

    public int getCountOrder() {
        return countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setCountOrder() {
        this.countOrder += 1;
    }

    public void setBalance() {
        this.balance += 1000;
    }

    @Override
    public String toString(){

        String info = "Доход от доставленных заказров: " + this.getBalance() + "\n" +
                "Колличество собранных заказов: " + this.getCountOrder();
        return info;
    }
}
