package day11;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        while (warehouse.getCountOrder() != 2000) {

            picker.doWork();
            courier.doWork();

            System.out.println("Всего собрано заказов: " + warehouse.getCountOrder());
            System.out.println("Доход от курьерской службы: " + warehouse.getBalance());
            System.out.println();

            if (warehouse.getCountOrder() % 1500 == 0) {
                System.out.println("Сборщик получил бонус к зарплате");
            }
            if (warehouse.getBalance() % 1_000_000 == 0) {
                System.out.println("Курьер получил бонус к зарплате");
            }

            System.out.println("Сборщик получил зарплату: " + picker.getSalary());
            System.out.println("Курьер получил зарплату: " + courier.getSalary());
            System.out.println("------------------------------------------------");



        }
    }
}
