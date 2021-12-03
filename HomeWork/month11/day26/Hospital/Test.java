package month11.day26.Hospital;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/26 16:19
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Privilege privilege = new Privilege("特需号");
        Common common = new Common("普通号",privilege);
        common.setPriority(Privilege.MAX_PRIORITY);
        privilege.start();
        privilege.join();
        common.start();
        common.join();
        System.out.println(common.number);
    }
}
