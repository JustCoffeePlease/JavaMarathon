package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Наталия", "Математика");
        Student student = new Student("Антон");

        teacher.evaluate(student);

    }
}
