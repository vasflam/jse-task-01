import java.util.Date;

public class Student extends Person {
    private Integer gid;

    public Student(String firstName, String lastName, String email, Date dob, Integer gid) {
        super(firstName, lastName, email, dob);
        this.gid = gid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }
}
