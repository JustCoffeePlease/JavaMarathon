package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> carList = new ArrayList<>();

        carList.add("Kia");
        carList.add("Chery");
        carList.add("Toyota");
        carList.add("Nissan");
        carList.add("Mitsubishi");

        for (Object obj: carList) {
            System.out.println(obj);
        }
        System.out.println("-----------------------------------------------");

        int MiddleOfTheList = carList.size() / 2;
        carList.set(MiddleOfTheList, "Hundai");
        carList.remove(0);
        for (Object obj: carList) {
            System.out.println(obj);
        }



    }
}
