package month11.day09;

/**
 * ClassName: Task01
 * Description:
 *
 * 1.	定义一个函数，获取某个数组中的最小值
 *
 * date: 2021/11/6 16:12
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task01 {
    /**
     * getMaxNum
     * @desctiptopn

     * @param numbers:
     * @version 0.1.0
     * @return int
     * @author Lilin
     * @since 0.1.0
     */
    public static int getMaxNum(int []numbers){
        int maxNumber = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(maxNumber>numbers[i]){
                maxNumber=numbers[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int []a = {11,3,4,5,6,7};
        System.out.println(Task01.getMaxNum(a));
    }
}
