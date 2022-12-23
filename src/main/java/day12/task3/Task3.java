package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<SimpleMusicBand> musicBands = new ArrayList<>();

        musicBands.add(new SimpleMusicBand("Metallica", 1981));
        musicBands.add(new SimpleMusicBand("Rammstein", 1994));
        musicBands.add(new SimpleMusicBand("Pantera", 1981));
        musicBands.add(new SimpleMusicBand("Motorhead", 1975));
        musicBands.add(new SimpleMusicBand("Black Sabbath", 1968));
        musicBands.add(new SimpleMusicBand("Bring me the Horizon", 2004));
        musicBands.add(new SimpleMusicBand("The Killers", 2001));
        musicBands.add(new SimpleMusicBand("My Chemical Romance", 2001));
        musicBands.add(new SimpleMusicBand("Fall Out Boy", 2001));
        musicBands.add(new SimpleMusicBand("Five Finger Dead Punch", 2005));

        Collections.shuffle(musicBands);

        for (SimpleMusicBand musicBand: musicBands) {
            System.out.println(musicBand.getName() + " " + musicBand.getYear());
        }

        System.out.println("-----------------------------------");

        List<SimpleMusicBand> youngMusicBands = SimpleMusicBand.groupAfter2000(musicBands);

        for (SimpleMusicBand musicBand: youngMusicBands) {
            System.out.println(musicBand.getName() + " " + musicBand.getYear());
        }
    }
}
