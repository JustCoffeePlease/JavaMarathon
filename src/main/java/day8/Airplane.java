package day8;

public class Airplane {

    String producer;
    int year;
    int length;
    int weight;
    int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getFuel() {
        return fuel;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void info(){

        StringBuilder infoStringBuilder = new StringBuilder();

        infoStringBuilder.append("Изготовитель: ")
                .append(producer)
                .append("\nГод выпуска:  ")
                .append(year)
                .append("\nДлина: ")
                .append(length)
                .append("\nКоличество топлива в баке: ")
                .append(fuel);

        System.out.println(infoStringBuilder);
    }

    public void fillUp(int value) {
        this.fuel = value;
    }

    public static void compareAirplanes(Airplane plane1, Airplane plane2) {

        if (plane1.getLength() > plane2.getLength()) {
            System.out.println("Самолет производства " + plane1.getProducer() +
                    " длиннее, чем самолет производства " + plane2.getProducer());
        }
        else if (plane1.getLength() == plane2.getLength()) {
            System.out.println(" Самолеты производства " +
                    plane1.getProducer() + " и " +
                    plane2.getProducer() + " одинаковые по длине");
        }
        else {
            System.out.println("Самолет производства " + plane2.getProducer() +
                    " длиннее, чем самолет производства " + plane1.getProducer());
        }
    }

    @Override
    public String toString() {
        return  "Изготовитель: " + producer +
                ", год выпуска: " + year +
                ", длина: " + length +
                ", вес: " + weight +
                ", количество топлива в баке: " + fuel;
    }
}
