import java.util.Date;

enum TeacherGrade {
    Teacher,
    Professor,
    Doctor,
    Sensei,
    God,
}

public class Teacher extends Person {
    private TeacherGrade grade;
    public Teacher(String firstName, String lastName, String email, Date dob, TeacherGrade grade) {
        super(firstName, lastName, email, dob);
        this.grade = grade;
    }

    public void setGrade(TeacherGrade grade) {
        this.grade = grade;
    }

    public TeacherGrade getGrade() {
        return grade;
    }
}
