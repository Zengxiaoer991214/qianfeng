package month11.day12.classroom;

/**
 * ClassName: Speaker
 * Description:
 * date: 2021/11/12 20:24
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Speaker {
    private String name;
    private int volume=50;

    public void turnUpTheVolume(){
        System.out.println("正在调高音量");
        this.volume += 10;
    }

    public Speaker(String name) {
        this.name = name;
    }

    public void turnDownTheVolume(){
        System.out.println("正在调低音量");
        this.volume -= 10;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
