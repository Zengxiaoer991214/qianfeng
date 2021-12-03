package month11.day08;

import java.util.Scanner;

/**
 * ClassName: Task04
 * Description:
 *
 * 设计一个方法输入三角形的三条边长，判断这个变长是能构成三角形
 * 在设计以恶搞判断是锐角直角钝角三角形
 *
 * date: 2021/11/8 17:37
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task04 {
    /**
     * isTriangle
     * @desctiptopn

     * @param a:
     * @param b:
     * @param c:
     * @version 0.1.0
     * @return boolean
     * @author Lilin
     * @since 0.1.0
     */
    public static boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b && b + c > a;
    }
    /**
     * isWhichTriangle
     * @desctiptopn

     * @param a:
     * @param b:
     * @param c:
     * @version 0.1.0
     * @return java.lang.String
     * @author Lilin
     * @since 0.1.0
     */
    public static String isWhichTriangle(int a, int b, int c){

        double cosA = (double)(b*b+c*c-a*a)/2*b*c;
        double cosB = (double)(c*c+a*a-b*b)/2*c*a;
        double cosC = (double)(a*a+b*b-c*c)/2*a*b;

        if(cosA<0||cosB<0||cosC<0){
            return "钝角三角形";
        }
        else if(cosA==0||cosB==0||cosC==0){
            return "直角三角形";
        }
        else {
            return "锐角三角形";
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三角形的三条边");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(isTriangle(a, b, c)){
            System.out.println(isWhichTriangle(a, b, c));
        }
        else {
            System.out.println("不是三角形");
        }

    }
}
