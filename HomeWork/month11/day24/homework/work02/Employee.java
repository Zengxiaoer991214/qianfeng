package month11.day24.homework.work02;

/**
 * ClassName: Employee
 * Description:
 * date: 2021/11/24 17:16
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Employee implements Comparable{
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return age!=((Employee)o).age?
                age-((Employee) o).age: (int) (salary != ((Employee) o).salary ?
                ((Employee) o).salary - salary  : hashCode() - o.hashCode());
    }
}
