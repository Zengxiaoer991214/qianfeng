package month11.day11;

/**
 * ClassName: Task04
 * Description:
 *
 * 测试类和类属性
 *
 * date: 2021/11/11 20:15
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public static void main(String[] args) {
        Student student1 = new Student("张三",20);
        Student student2 = new Student("李四",20);
        System.out.format("%s的年龄是%d岁\n",student1.getName(),student1.getAge());
        System.out.format("%s的年龄是%d岁\n",student2.getName(),student2.getAge());
    }
}
