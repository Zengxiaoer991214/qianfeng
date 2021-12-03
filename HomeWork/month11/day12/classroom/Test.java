package month11.day12.classroom;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/12 20:28
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Window window = new Window("双层玻璃窗户");
        window.closeWindow();
        window.openWindow();
        System.out.println(window.toString());

        Speaker speaker = new Speaker("挂墙音箱");
        speaker.turnDownTheVolume();
        speaker.turnDownTheVolume();
        speaker.turnUpTheVolume();
        System.out.println(speaker.toString());

        DrinkingFountain drinkingFountain = new DrinkingFountain("xx牌饮水机");
        drinkingFountain.boilWater();
        drinkingFountain.use();
        drinkingFountain.changeWater();
        System.out.println(drinkingFountain.toString());
    }
}
