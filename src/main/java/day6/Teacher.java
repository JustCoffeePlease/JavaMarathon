package day6;

public class Teacher {

    private final String name;
    private String lessonName;

    public Teacher(String name, String lessonName) {
        this.name = name;
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public String getName() {
        return name;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public void evaluate(Student student) {

        String grade;
        int rnd = (int)(Math.random() * 5);

        switch(rnd) {
            case 0:
            case 1:
            case 2:
                grade = "Неудовлетворительно";
                break;
            case 3:
                grade = "Удовлетворительно";
                break;
            case 4:
                grade = "Хорошо";
                break;
            case 5:
                grade = "Отлично";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + rnd);
        }

        System.out.println("Преподаватель " + name + 
                " оценил студента с именем " + student.getName() + 
                " по предмету " + lessonName + 
                " на оценку " + grade);
    }
}
