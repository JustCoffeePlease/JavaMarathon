package Tests.day9.Task1;

import Tests.AbstractTest;
import day9.Task1.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day9TeacherTest extends AbstractTest {

    Teacher teacher = new Teacher("anna", "math");

    @Test
    void printInfo() {
        Teacher teacher = new Teacher("anna", "math");
        teacher.printInfo();
        assertEquals("Этот человек с именем anna" + System.lineSeparator() + "Этот преподаватель с именем anna" + System.lineSeparator(), getOutput(),
                "Метод printInfo() вызван у обекта класса Teacher, с полем name = anna");
    }

    @Test
    public void getLessonName() {
        String subject = teacher.getLessonName();
        assertEquals("math", subject, "Метод getSubject() вызван у обекта класса Teacher, с полем subjectName = math");
    }
}