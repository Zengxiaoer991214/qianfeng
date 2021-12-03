package month11.day16.door;

/**
 * ClassName: DoorTest
 * Description:
 * date: 2021/11/16 15:59
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class DoorTest {
    public static void main(String[] args) {
        ProofDoor door = new ProofDoor();
        door.touchBell();
        door.openLock(222);
        door.openLock(123);
        door.open();
        door.close();
    }
}
