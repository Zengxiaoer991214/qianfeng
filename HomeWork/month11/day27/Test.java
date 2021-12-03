package month11.day27;

import month11.day26.homework.work01.Calculator;
import month11.day26.homework.work01.Result;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/27 14:09
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
//    public final void a(){
//        System.out.println("a");
//    }
//    public void a(int a){
//        System.out.println("a2");
//    }
//    public static int b(){
//        int[] a = new int[2];
//
//        try {
//            return 0;
////            int b = a[3];
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//            return 1;
//        } finally {
//            return 2;
//        }
//    }
//    public static void main(String[] args) {
////         Test t = new Test();
////         t.a();
////         t.a(2);
//        System.out.println(b());
//    }
//    public static void main(String[] args) {
//        Short i1 = 129;
//        Short i2 = 129;
//        Short i3 = new Short((short) 129);
//        Short i4 = new Short((short) 129);
//
//        System.out.println(i1==i2);
//        System.out.println(i1.equals(i2));
//        System.out.println(i1==i3);
//        System.out.println(i1.equals(i3));
//        System.out.println(i3==i4);
//        System.out.println(i3.equals(i4));
//    }
    public static void main(String[] args) {
        int count = 10_000;
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(count){{
            for (int i = 0; i < count; i++) {
                add(i);
            }
//            for (int i=count-1;i>0;i--){
//                remove(i);
//            }
        }};
        long endTime = System.currentTimeMillis();
        System.out.println("" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<Integer>(){{
            for (int i = 0; i < count; i++) {
                add(i);
            }
//            for (int i=count-1;i>0;i--){
//                remove(i);
//            }
        }};
        endTime = System.currentTimeMillis();
        System.out.println("" + (endTime - startTime) + "ms");

    }
}
