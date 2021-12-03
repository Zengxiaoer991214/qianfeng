package month11.day18;

/**
 * ClassName: Student
 * Description:
 * date: 2021/11/18 10:03
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Student extends User {

    private String studentID;
    private String clazz;
    private String gender;

    public Student() {
    }

    public Student(String name, String password, String studentID, String clazz, String gender) {
        super(name,password);
        this.studentID = studentID;
        this.clazz = clazz;
        this.gender = gender;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", clazz='" + clazz + '\'' +
                ", gender='" + gender + '\'' +
                "} " + super.toString();
    }

    public String toStringPlus(){
        return String.format("%-6s %-4s %-18s %-4s", super.getName(),studentID,clazz,gender);
    }
}
