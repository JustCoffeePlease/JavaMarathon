package day12.task4;

import day12.task3.SimpleMusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

//        List<MusicBand> musicBands = new ArrayList<>();

        List<String> metallicaMembers = new ArrayList<>();
        metallicaMembers.add("James Hetfield");
        metallicaMembers.add("Lars Ulrich");
        metallicaMembers.add("Kirk Hammett");
        metallicaMembers.add("Robert Trujillo");

        List<String> rammsteinMembers = new ArrayList<>();
        rammsteinMembers.add("Till Lindemann");
        rammsteinMembers.add("Paul Landers");
        rammsteinMembers.add("Christoph Schneider");
        rammsteinMembers.add("Christian Lorenz");
        rammsteinMembers.add("Richard Kruspe");
        rammsteinMembers.add("Oliver Riedel");

        MusicBand metallica = new MusicBand("Metallica", 1981, metallicaMembers);
        MusicBand rammstein = new MusicBand("Rammstein", 1994, rammsteinMembers);

        System.out.println("Metallica members: ");
        MusicBand.printMembers(metallica);

        System.out.println("---------------------------------");

        System.out.println("Rammstein members: ");
        MusicBand.printMembers(rammstein);

        System.out.println("---------------------------------");

        MusicBand.transferMembers(metallica, rammstein);
        System.out.println("Metallica NEW members: ");
        MusicBand.printMembers(metallica);

        System.out.println("---------------------------------");

        System.out.println("Rammstein NEW members: ");
        MusicBand.printMembers(rammstein);
    }
}
