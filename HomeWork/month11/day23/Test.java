package month11.day23;

import java.util.*;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/23 9:38
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    {
        System.out.println("初始化块");
    }
    static {
        System.out.println("static 初始化块");
    }
    Test(){
        System.out.println("构造方法");
    }
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>(){{
//            add(1);
//            add(2);
//            add(3);
//            add(4);
//        }};
//        int length = arrayList.size();
//        for (int i=0; i<length;i++){
//            arrayList.remove(0);
//        }
//        System.out.println(Arrays.toString(arrayList.toArray()));
////        LinkedList
        Test t = new Test();
    }
}
