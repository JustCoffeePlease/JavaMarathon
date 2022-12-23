package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class FirstMusicBand {

    private final String name;
    private final int year;

    public FirstMusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static List<FirstMusicBand> groupAfter2000(List<FirstMusicBand> bandList) {

        List<FirstMusicBand> listOfGroupAfter2000 = new ArrayList<>();

        for(FirstMusicBand musicBand: bandList) {
            if(musicBand.getYear() >= 2000) {
                listOfGroupAfter2000.add(musicBand);
            }
        }

        return listOfGroupAfter2000;
    }
}
