package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student studentAnton = new Student("Anton", "chem-1");
        Teacher teacherNatalia = new Teacher("Natalia", "Mathematic");

        studentAnton.printInfo();
        teacherNatalia.printInfo();
    }
}
