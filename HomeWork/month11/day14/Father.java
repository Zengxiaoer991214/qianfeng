package month11.day14;

/**
 * ClassName: Father
 * Description:
 * date: 2021/11/14 17:04
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Father {
    public static String name = "Father";

    static {
        System.out.println(name);
        System.out.println("Father 的static代码块");
    }
    public static void out(){
        System.out.println("Father 的static out");
    }

}
