package month11.day11;

import java.util.Arrays;

/**
 * ClassName: Task03
 * Description:
 *
 * 1.	班上有3个学生，每个学生都参加了三门功课的考试，其中第二个学生是特长生，
 *      上级要求给他每门功课都+5【要求：使用二维数组做，并
 *      且分别使用for循环和增强for循环遍历二维数组】
 *
 * date: 2021/11/11 16:01
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task03 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{71, 72, 72}, {81, 82, 83}, {61, 62, 63}};

        for (int i=0;i<nums[1].length;i++){
            nums[1][i] += 5;
        }

        for(int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                System.out.format("%4d",nums[i][j]);
            }
            System.out.println();
        }
        for (int[] num: nums){
            for (int elem: num){
                System.out.format("%4d",elem);
            }
            System.out.println();
        }
    }
}
