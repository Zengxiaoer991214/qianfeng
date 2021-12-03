package month11.day15.pet;

/**
 * ClassName: Cat
 * Description:
 * date: 2021/11/15 16:52
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Cat extends Pet{
    private final String playMethod;
    public Cat(String name) {
        super(name);
        playMethod = "猫叫";
    }
    @Override
    public void play(){
        System.out.println(this.playMethod);
    }
}
