package month11.day09;

/**
 * ClassName: Task02
 * Description:
 *
 * 2.	定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出
 *
 * date: 2021/11/6 16:36
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task02 {
    /**
     * getMaxNum
     * @desctiptopn

     * @param numbers:
     * @version 0.1.0
     * @return int[]
     * @author Lilin
     * @since 0.1.0
     */
    public static int[] getMaxNum(int []numbers){
        int maxIndex = 0;
        for(int i=1;i<numbers.length;i++){
            if(numbers[maxIndex]>numbers[i]){
                maxIndex = i;
            }
        }
        int[] a= new int[2];
        a[0] = maxIndex;
        a[1] = numbers[maxIndex];
        return a;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,9,0,8,6,5,4,3,7};
        int[] result = getMaxNum(nums);
        System.out.format("数组的最小值是%d,它的下标记是%d",result[1],result[0]);
    }
}
