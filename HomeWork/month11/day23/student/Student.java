package month11.day23.student;

/**
 * ClassName: Student
 * Description:
 * date: 2021/11/23 15:26
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int salary;

    public Student() {
    }

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
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Student(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }



    @Override
    public int compareTo(Student o) {
        return  this.salary== o.salary?
                this.age== o.age?
                        this.hashCode()-o.hashCode():
                        this.age- o.age
                : this.salary- o.salary;
    }
}
