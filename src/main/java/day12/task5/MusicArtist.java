package day12.task5;

public class MusicArtist {

    private final String firstName;
    private final String secondName;
    private final int age;

    public MusicArtist(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.print(this.firstName + " ");
        System.out.print(this.secondName + " ");
        System.out.println(this.age + " ");
    }
}
