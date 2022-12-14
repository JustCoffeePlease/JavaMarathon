package day9.Task1;

public class Student extends Human {

    private String learningGroupName;

    public Student(String name, String learningGroupName) {
        super(name);
        this.learningGroupName = learningGroupName;
    }

    public String getLearningGroupName() {
        return learningGroupName;
    }

    public void setLearningGroupName(String learningGroupName) {
        this.learningGroupName = learningGroupName;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем " + name);
    }
}
