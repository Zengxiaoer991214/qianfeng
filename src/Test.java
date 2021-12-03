import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
//    public static void main(String[] args) {
////        int a=5;
////        System.out.println("a="+((a<5)?10.9:9));
////        char x='x';
////        int i=10;
////        System.out.println(false?i:x);
////        System.out.println(false?100:x);
//        System.out.println("这是Test的main方法");
//        Scanner input = new Scanner(System.in);
//        float f = input.nextFloat();
//        Test1102.main(new String[3]);
//    }
    /**
     * isLeapYear
     * @desctiptopn

     * @param date:
     * @version 0.1.0
     * @return boolean
     * @author Lilin
     * @since 0.1.0
     */
public static boolean isLeapYear(int date){
    return date % 400 == 0 || (date % 4 == 0 && date % 100 != 0);
}
public static boolean isLeapYear2(int date){
    return (date % 4 == 0 && date % 100 != 0)||  date % 400 == 0;
}
    public static void main(String[] args) {
    //    int i = 1;
    //    double d = 2.5;
    ////int类型和double类型运算，结果是double类型
    ////int类型会提升为double类型
    //    double e = d+i;
    //    System.out.println(e);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请选择你是 红方还是黑方");
//        String camp = scanner.next();
//        System.out.println("请输入你的棋子");
//        String  chees = scanner.next();
//        switch (chees){
//            case "将":
//                if (camp.equals("黑方")){
//                    System.out.println("将");
//                }else {
//                    System.out.println("帅");
//                }
//                break;
//            case "士":
//                if (camp.equals("黑方")){
//                    System.out.println("士");
//                }
//                else
//                    System.out.println("仕");
//                break;
//            case "象":
//                if (camp.equals("黑方")){
//                    System.out.println("象");
//                }
//                else
//                    System.out.println("相");
//                break;
//            case "马":
//                if (camp.equals("黑方")){
//                    System.out.println("马");
//                }
//                else
//                    System.out.println("馬");
//                break;
//            case "车":
//                if (camp.equals("黑方")){
//                    System.out.println("车");
//                }
//                else{
//                    System.out.println("車");
//                }
//                break;
//            case "砲":
//                if (camp.equals("黑方")){
//                    System.out.println("砲");
//                }
//                else{
//                    System.out.println("炮");
//                }
//
//                break;
//            case "卒":
//                if (camp.equals("黑方")){
//                    System.out.println("卒");
//                }
//                else{
//                    System.out.println("兵");
//                }
//                break;
//            case "帅":
//                if (camp.equals("红方")){
//                    System.out.println("帅");
//                }
//                else{
//                    System.out.println("将");
//                }
//                break;
//            case "仕":
//                if (camp.equals("红方")){
//                    System.out.println("仕");
//                }
//                else{
//                    System.out.println("士");
//                }
//                break;
//            case "相":
//                if (camp.equals("红方")){
//                    System.out.println("相");
//                }
//                else{
//                    System.out.println("象");
//                }
//                break;
//            case "馬":
//                if (camp.equals("红方")){
//                    System.out.println("馬");
//                }
//                else{
//                    System.out.println("马");
//                }
//                break;
//            case "車":
//                if (camp.equals("红方")){
//                    System.out.println("車");
//                }
//                else{
//                    System.out.println("车");
//                }
//                break;
//            case "炮":
//                if (camp.equals("红方")){
//                    System.out.println("炮");
//                }
//                else{
//                    System.out.println("炮");
//                }
//                break;
//            case "兵":
//                if (camp.equals("红方")){
//                    System.out.println("兵");
//                }
//                else{
//                    System.out.println("卒");
//                }
//                break;
//        }
//    int a=1;
//    if(false||true||++a>0){
//        System.out.println("if");
//    }
//    else {
//        System.out.println("else");
//    }
//    System.out.println(a);
//        List<String> a = Arrays.asList("1+2+3".split("[+ - * /]"));
//        List<String> a = new ArrayList<String>(){
//            {
//                add("1");
//                add("2");
//                add("3");
//            }
//        };
//
//        System.out.println(a.toString());
//        a.remove(0);
//        System.out.println(a.toString());

            System.out.println(Test.isLeapYear(400));
            System.out.println(Test.isLeapYear(400));
            System.out.println(Test.isLeapYear(200));
            System.out.println(Test.isLeapYear(200));

    }


}
