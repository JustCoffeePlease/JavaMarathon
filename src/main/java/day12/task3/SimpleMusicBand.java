package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class SimpleMusicBand {

    private final String name;
    private final int year;

    public SimpleMusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static List<SimpleMusicBand> groupAfter2000(List<SimpleMusicBand> bandList) {

        List<SimpleMusicBand> listOfGroupAfter2000 = new ArrayList<>();

        for(SimpleMusicBand musicBand: bandList) {
            if(musicBand.getYear() >= 2000) {
                listOfGroupAfter2000.add(musicBand);
            }
        }

        return listOfGroupAfter2000;
    }
}
