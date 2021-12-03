package month11.day12.zoo;

/**
 * ClassName: Panda
 * Description:
 * date: 2021/11/12 21:26
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Panda {
    private String name;
    private final String price = "无价";
    public void eat(){
        System.out.println("吃竹子");
    }

    @Override
    public String toString() {
        return "Panda{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public Panda(String name) {
        this.name = name;
    }

    public void buyPanda(){
        System.out.println("买卖国家保护动物犯法");
    }
}
