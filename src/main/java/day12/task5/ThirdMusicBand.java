package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class ThirdMusicBand {

    private final String nameOfGroup;
    private final int startCareerYear;
    private List<MusicArtist> members;

    public ThirdMusicBand(String nameOfGroup, int startCareerYear, List<MusicArtist> members) {
        this.nameOfGroup = nameOfGroup;
        this.startCareerYear = startCareerYear;
        this.members = members;
    }

    public String getName() {
        return nameOfGroup;
    }

    public int getYear() {
        return startCareerYear;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public static List<ThirdMusicBand> groupAfter2000(List<ThirdMusicBand> bandList) {

        List<ThirdMusicBand> listOfGroupAfter2000 = new ArrayList<>();

        for(ThirdMusicBand thirdMusicBand : bandList) {
            if(thirdMusicBand.getYear() >= 2000) {
                listOfGroupAfter2000.add(thirdMusicBand);
            }
        }
        return listOfGroupAfter2000;
    }

    public static void transferMembers(ThirdMusicBand secondMusicBandFrom, ThirdMusicBand secondMusicBandIn){
        secondMusicBandIn.members.addAll(secondMusicBandFrom.members);
        secondMusicBandFrom.members.clear();
    }

    public static void printMembers(ThirdMusicBand members) {
        for(MusicArtist ma: members.getMembers()) {
            ma.getInfo();
        }
    }
}
