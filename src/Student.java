import java.util.Date;

public class Student extends Person {
    private Integer gid;
    private Teacher teacher;

    public Student(String firstName, String lastName, String email, Date dob, Integer gid, Teacher t) {
        super(firstName, lastName, email, dob);
        this.gid = gid;
        this.teacher = t;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher t) {
        this.teacher = t;
    }
}
