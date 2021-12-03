package month11.day26.InnerClass;

import java.util.Scanner;

/**
 * ClassName: OutClass
 * Description:
 * date: 2021/11/26 10:27
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class OutClass extends InnerClass.Inner{

    void show(){
        super.show();
        System.out.println("OutClass.show");
    }
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.show();
        Scanner scanner = new Scanner(System.in);
        scanner.next();
    }

}
