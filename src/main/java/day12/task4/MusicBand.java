package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private final String name;
    private final int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public static List<MusicBand> groupAfter2000(List<MusicBand> bandList) {

        List<MusicBand> listOfGroupAfter2000 = new ArrayList<>();

        for(MusicBand musicBand: bandList) {
            if(musicBand.getYear() >= 2000) {
                listOfGroupAfter2000.add(musicBand);
            }
        }

        return listOfGroupAfter2000;
    }

    public static void transferMembers(MusicBand musicBandFrom, MusicBand musicBandIn){
        musicBandIn.members.addAll(musicBandFrom.members);
        musicBandFrom.members.clear();
    }

    public static void printMembers(MusicBand musicBand) {
        for(String s: musicBand.getMembers()) {
            System.out.println(s);
        }
    }
}
