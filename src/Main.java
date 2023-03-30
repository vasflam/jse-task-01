import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Harry", "Potter", "potter@gmail.com", new Date(), 1),
                new Student("John", "Travolta", "travolta@gmail.com", new Date(), 2),
                new Student("Big", "Lebowsky", "lebowsky@gmail.com", new Date(), 2)
        ));
        List<Teacher> teachers = new ArrayList<>(List.of(
                new Teacher("Obi", "VanKinobi", "kinobi@space.com", new Date(), TeacherGrade.Sensei),
                new Teacher("hidden", "Mariarti", "kinobi@space.com", new Date(), TeacherGrade.Doctor),
                new Teacher("God", "Person", "kinobi@space.com", new Date(), TeacherGrade.God)

        ));

        int index = 0;
        for (Student s: students) {
            Teacher t = teachers.get(index);
            System.out.printf(
                "Student: %s[gid=%d] was teached by %s [%s]\n",
                s.getFullName(),
                s.getGid(),
                t.getFullName(),
                t.getGrade()
            );
            index++;
        }
    }
}