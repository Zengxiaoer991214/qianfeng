package month11.day27;

/**
 * ClassName: InnerClass
 * Description:
 * date: 2021/11/27 15:43
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class InnerClass {
    private String a= "a";
    private static  String b ="b";
    public class Inner{
        public String innerA = "innerA";
        public  String innerB = "innerB";

        public void run() {
            System.out.println(InnerStatic.innerStaticB);
        }
    }
    public static class InnerStatic{
        public String innerStaticA = "innerStaticA";
        public static String innerStaticB = "innerStaticB";
        void runInnerStatic(){

        }
    }
    void run(){
        System.out.println(b);
        System.out.println(InnerStatic.innerStaticB);
        Inner inner = new Inner();
        System.out.println("inner"+inner.innerA+inner.innerB);
        inner.run();
    }

    public static void main(String[] args) {

    }
}
