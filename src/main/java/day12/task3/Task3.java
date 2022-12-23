package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<FirstMusicBand> musicBands = new ArrayList<>();

        musicBands.add(new FirstMusicBand("Metallica", 1981));
        musicBands.add(new FirstMusicBand("Rammstein", 1994));
        musicBands.add(new FirstMusicBand("Pantera", 1981));
        musicBands.add(new FirstMusicBand("Motorhead", 1975));
        musicBands.add(new FirstMusicBand("Black Sabbath", 1968));
        musicBands.add(new FirstMusicBand("Bring me the Horizon", 2004));
        musicBands.add(new FirstMusicBand("The Killers", 2001));
        musicBands.add(new FirstMusicBand("My Chemical Romance", 2001));
        musicBands.add(new FirstMusicBand("Fall Out Boy", 2001));
        musicBands.add(new FirstMusicBand("Five Finger Dead Punch", 2005));

        Collections.shuffle(musicBands);

        for (FirstMusicBand musicBand: musicBands) {
            System.out.println(musicBand.getName() + " " + musicBand.getYear());
        }

        System.out.println("-----------------------------------");

        List<FirstMusicBand> youngMusicBands = FirstMusicBand.groupAfter2000(musicBands);

        for (FirstMusicBand musicBand: youngMusicBands) {
            System.out.println(musicBand.getName() + " " + musicBand.getYear());
        }
    }
}
