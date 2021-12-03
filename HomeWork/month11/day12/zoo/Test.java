package month11.day12.zoo;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/12 21:28
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {

    public static void main(String[] args) {
        Panda panda = new Panda("大熊猫");
        panda.eat();
        panda.buyPanda();
        System.out.println(panda.toString());

        Monkey monkey = new Monkey("猴子",20);
        monkey.eat();
        monkey.call();
        System.out.println(monkey.toString());

        Elephant elephant = new Elephant("大象",400);
        elephant.sprayWater();
        System.out.println(elephant.toString());
    }
}
