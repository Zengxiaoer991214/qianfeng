package month11.day12.classroom;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

/**
 * ClassName: DrinkingFountain
 * Description:
 * date: 2021/11/12 20:09
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class DrinkingFountain {
    private String name;
    private int remainingWater = 100;
    public void use(){
        System.out.println("打开饮水机水龙头，接水喝");
        this.remainingWater -= 10;
    }
    public void changeWater(){
        System.out.println("给饮水机换一桶新的桶装水");
        this.remainingWater = 100;
    }
    public void boilWater(){
        System.out.println("打开开关，烧水");
    }

    @Override
    public String toString() {
        return "DrinkingFountain{" +
                "name='" + name + '\'' +
                ", remainingWater=" + remainingWater +
                '}';
    }

    public DrinkingFountain(String name) {
        this.name = name;
    }
}
