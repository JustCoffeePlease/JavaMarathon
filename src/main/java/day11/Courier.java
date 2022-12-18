package day11;

public class Courier implements Worker{

    private int personalProductivity = 0;
    private int regularPayment = 100;
    private int salary = 0;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public int getPersonalProductivity() {
        return personalProductivity;
    }

    @Override
    public void doWork() {
        this.setSalary(regularPayment);
        this.warehouse.setBalance();
        this.setPersonalProductivity();
        this.bonus();

    }

    @Override
    public void bonus() {

        switch (this.getPersonalProductivity()){
            case 1_000_000:
            case 2_000_000:
            case 3_000_000:
            case 4_000_000:
            case 5_000_000: this.setSalary(regularPayment * 2);
                break;
        }
    }

    private void setSalary(int salary) {
        this.salary += salary;
    }

    public void setPersonalProductivity() {
        this.personalProductivity += 1000;
    }
}
