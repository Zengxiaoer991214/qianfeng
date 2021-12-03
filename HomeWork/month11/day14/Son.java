package month11.day14;

/**
 * ClassName: Son
 * Description:
 * date: 2021/11/14 17:08
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Son extends Father{
    public static String name="son";
    static {
        System.out.println(name);
        System.out.println("Son的静态代码块");
    }
    public static void out(){
        System.out.println("son 的static out");
    }
}
