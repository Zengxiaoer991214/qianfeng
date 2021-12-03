package month11.day06;

/**
 * ClassName: Task01
 * Description:
 * date: 2021/11/6 14:26
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task01 {
    /**
     * newStringAndString
     * @desctiptopn
        String类重写的object的hashCode()方法，把比较地址变成了比较String的值，
        所以即使是在堆区和公共池的两个相同的String，他们的hashCode依旧一样，但使用
        ==比较时，就能发现差别
     * @version 0.1.0
     * @return void
     * @author Lilin
     * @since 0.1.0
     */
    public static void newStringAndString(){
        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);
    }


    public static void main(String[] args) {
        Task01.newStringAndString();
    }
}
