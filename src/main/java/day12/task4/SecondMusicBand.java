package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class SecondMusicBand {

    private final String name;
    private final int year;
    private List<String> members;

    public SecondMusicBand(String name, int year, List<String> members) {
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

    public static List<SecondMusicBand> groupAfter2000(List<SecondMusicBand> bandList) {

        List<SecondMusicBand> listOfGroupAfter2000 = new ArrayList<>();

        for(SecondMusicBand secondMusicBand : bandList) {
            if(secondMusicBand.getYear() >= 2000) {
                listOfGroupAfter2000.add(secondMusicBand);
            }
        }

        return listOfGroupAfter2000;
    }

    public static void transferMembers(SecondMusicBand secondMusicBandFrom, SecondMusicBand secondMusicBandIn){
        secondMusicBandIn.members.addAll(secondMusicBandFrom.members);
        secondMusicBandFrom.members.clear();
    }

    public static void printMembers(SecondMusicBand secondMusicBand) {
        for(String s: secondMusicBand.getMembers()) {
            System.out.println(s);
        }
    }
}
