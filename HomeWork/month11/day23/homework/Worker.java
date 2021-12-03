package month11.day23.homework;

import java.util.Hashtable;
import java.util.Objects;

/**
 * ClassName: Task2
 * Description:
 * date: 2021/11/23 19:14
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Worker {
    private String name;
    private int age;
    private double salary;

    public Worker() {
    }

    public Worker(String name, int age, double salary) {
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
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Worker) obj).name)
                && this.age == ((Worker) obj).age
                && this.salary == ((Worker) obj).salary;

    }
}
