package month11.day12;

/**
 * ClassName: Student
 * Description:
 * date: 2021/11/12 11:42
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Student {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(0<=age&&age<=120){
            this.age = age;
        }
        else {
            this.age = 20;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if("男".equals(gender)||"女".equals(gender)){
            this.gender = gender;
        }
        else {
            this.gender = "未知";
        }
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("张三");
        student1.setAge(22);
        student1.setGender("男");
        System.out.println(student1.toString());
        student2.setName("李四");
        student2.setAge(-100);
        student2.setGender("man");
        System.out.println(student2.toString());
    }
}
