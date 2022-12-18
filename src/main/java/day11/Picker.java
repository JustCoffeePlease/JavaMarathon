package day11;

public class Picker implements Worker{

    private int personalCountOrder = 0;
    private int regularPayment = 80;
    private int salary = 0;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public int getPersonalCountOrder() {
        return personalCountOrder;
    }

    @Override
    public void doWork(){
        this.setSalary(regularPayment);
        this.warehouse.setCountOrder();
        this.setPersonalCountOrder();
        this.bonus();

    }

    @Override
    public void bonus(){

        switch (this.getPersonalCountOrder()){
            case 1500:
            case 3000:
            case 4500:
            case 6000:
            case 7500: this.setSalary(regularPayment * 2);
            break;
        }
    }

    private void setSalary(int salary) {
        this.salary += salary;
    }

    private void setPersonalCountOrder() {
        this.personalCountOrder += 1;
    }
}
