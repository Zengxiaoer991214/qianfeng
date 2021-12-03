package month11.day12.kitchen;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/12 19:54
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        Fridge fridge = new Fridge("西门子","3开门");
        fridge.open();
        fridge.close();
        System.out.println(fridge.toString());

        GasStove gasStove = new GasStove("好太太集成灶", 2000.00);
        gasStove.open();
        gasStove.close();
        System.out.println(gasStove.toString());

        MicroWaveOven microWaveOven = new MicroWaveOven("微波炉", 10);
        microWaveOven.timing();
        microWaveOven.use();
        microWaveOven.close();
        System.out.println(microWaveOven.toString());

    }
}
