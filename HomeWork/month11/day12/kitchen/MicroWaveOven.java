package month11.day12.kitchen;

/**
 * ClassName: MicroWaveOven
 * Description:
 * date: 2021/11/12 17:53
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class MicroWaveOven {
    private String name;
    private int volume;
    public void use(){
        System.out.println("使用微波炉");
    }
    public void close(){
        System.out.println("关闭微波炉");
    }

    @Override
    public String toString() {
        return "MicroWaveOven{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

    public void timing(){
        System.out.println("定时十五分钟");
    }

    public MicroWaveOven(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
}
