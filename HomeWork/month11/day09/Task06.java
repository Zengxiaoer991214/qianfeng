package month11.day09;

import java.util.Arrays;

/**
 * ClassName: Task06
 * Description:
 *
 * 6.	定义数组，存放5个学生的成绩【成绩值自己设定】，将成绩从大到小排序，获得成绩之和，平均成绩，最小成绩，最大成绩。
 *
 * date: 2021/11/9 15:53
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task06 {
    /**
     * getMess
     * @desctiptopn 
                  
     * @param arr: 
     * @version 0.1.0
     * @return double[]
     * @author Lilin
     * @since 0.1.0
     */
    public static double[] getMess(double[] arr){
        double[] result = new double[4];
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(double a:arr){
            result[0]+=a;
        }
        result[1] = result[0]/arr.length;
        result[2] = arr[0];
        result[3] = arr[arr.length-1];
        return result;
    }

    public static void main(String[] args) {
        double[] scores = {89, 79, 69, 59,49};
        double[] result = getMess(scores);
        System.out.println(Arrays.toString(scores));
        System.out.format("总分是%.2f, 平均分是%.2f, 最低分是%.2f, 最高分是%.2f", result[0], result[1], result[2], result[3]);
    }
}
