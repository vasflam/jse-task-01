import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>(List.of(
                new Teacher("Obi", "VanKinobi", "kinobi@space.com", new Date(), TeacherGrade.Sensei),
                new Teacher("hidden", "Mariarti", "kinobi@space.com", new Date(), TeacherGrade.Doctor),
                new Teacher("God", "Person", "kinobi@space.com", new Date(), TeacherGrade.God)
        ));

        List<Student> students = new ArrayList<>(List.of(
                new Student("Harry", "Potter", "potter@gmail.com", new Date(), 1, teachers.get(0)),
                new Student("John", "Travolta", "travolta@gmail.com", new Date(), 2, teachers.get(1)),
                new Student("Big", "Lebowsky", "lebowsky@gmail.com", new Date(), 2, teachers.get(2)),
                new Student("Low", "Level", "lebowsky@gmail.com", new Date(), 2, teachers.get(0)),
                new Student("High", "Man", "lebowsky@gmail.com", new Date(), 2, teachers.get(2))
        ));

        Random rand = new Random();
        for (Student s: students) {
            Teacher t = s.getTeacher();
            System.out.printf(
                "Student: %s[gid=%d] was teached by %s [%s]\n",
                s.getFullName(),
                s.getGid(),
                t.getFullName(),
                t.getGrade()
            );
        }
    }
}
