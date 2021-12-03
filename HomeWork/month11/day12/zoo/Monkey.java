package month11.day12.zoo;

/**
 * ClassName: Monkey
 * Description:
 * date: 2021/11/12 20:34
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Monkey {
    private String name;
    private int age;
    public void eat(){
        System.out.println("猴子吃香蕉");
    }
    public void call(){
        System.out.println("猴子叫");
    }

    public Monkey(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
