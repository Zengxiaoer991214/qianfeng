package month11.day09;

import java.util.Scanner;

/**
 * ClassName: Task11
 * Description:
 * date: 2021/11/9 17:30
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task11 {
    /**
     * findByElement
     * @desctiptopn 
                  
     * @param element: 
     * @param nums: 
     * @version 0.1.0
     * @return int
     * @author Lilin
     * @since 0.1.0
     */
    public static int findByElement(int element, int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {10,23,2,45,6};
        Scanner scanner = new Scanner(System.in);
        int input,index;
        do{
            System.out.println("请输入一个数");
            input = scanner.nextInt();
            index = findByElement(input, nums);
            if(index==-1){
                System.out.println("这个数不在数组中");
            }else{
                System.out.format("这个数在数组的下标是%d\n",index);
            }
            System.out.println("是否继续输入？Y/N");

        }while (scanner.next().charAt(0)=='Y');


    }
}
