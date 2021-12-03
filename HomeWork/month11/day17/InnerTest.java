package month11.day17;

/**
 * ClassName: InnerTest
 * Description:
 * date: 2021/11/17 14:25
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class InnerTest {
    public class InnerTool{
        public int add(int a, int b){
            return  a+b;
        }
    }
    private final InnerTool innerTool = new InnerTool();

    public int add(int a,int b){
        return innerTool.add(a,b);
    }

    public static void main(String[] args) {
        InnerTest innerTest = new InnerTest();
        int num = innerTest.add(3,5);
        System.out.println(num);
    }
}
