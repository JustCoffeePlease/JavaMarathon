package day12.task5;

import day12.task4.SecondMusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> metallicaMembers = new ArrayList<>();
        metallicaMembers.add(new MusicArtist("James", "Hetfield", 1968));
        metallicaMembers.add(new MusicArtist("Lars", "Ulrich", 1970));
        metallicaMembers.add(new MusicArtist("Kirk", "Hammett", 1969));
        metallicaMembers.add(new MusicArtist("Robert", "Trujillo", 1970));

        List<MusicArtist> rammsteinMembers = new ArrayList<>();
        rammsteinMembers.add(new MusicArtist("Till", "Lindemann", 1964));
        rammsteinMembers.add(new MusicArtist("Paul", "Landers", 1969));
        rammsteinMembers.add(new MusicArtist("Christoph", "Schneider", 1970));
        rammsteinMembers.add(new MusicArtist("Christian", "Lorenz", 1971));
        rammsteinMembers.add(new MusicArtist("Christian", "Lorenz", 1968));
        rammsteinMembers.add(new MusicArtist("Oliver", "Riedel", 1968));

        ThirdMusicBand metallica = new ThirdMusicBand("Metallica", 1981, metallicaMembers);
        ThirdMusicBand rammstein = new ThirdMusicBand("Rammstein", 1994, rammsteinMembers);

        System.out.println("Metallica members: ");
        ThirdMusicBand.printMembers(metallica);

        System.out.println("---------------------------------");

        System.out.println("Rammstein members: ");
        ThirdMusicBand.printMembers(rammstein);

        System.out.println("---------------------------------");

        ThirdMusicBand.transferMembers(metallica, rammstein);
        System.out.println("Metallica NEW members: ");
        ThirdMusicBand.printMembers(metallica);

        System.out.println("---------------------------------");

        System.out.println("Rammstein NEW members: ");
        ThirdMusicBand.printMembers(rammstein);
    }
}
