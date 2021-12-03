package month11.day05;

import java.util.Scanner;

/**
 * ClassName: Task06
 * Description:
 *
 * 6.	要求循环录入2个班的学员成绩，假设每个班都有3个学员，依次录入，
 *      统计超过90分的学员人数，以及这批超过90分的学员平均分。
 *
 * date: 2021/11/5 11:03
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];

        for(int i=0;i<3;i++){
            System.out.format("请输入1班的第%d位同学的成绩\n",i+1);
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<3;i++){
            System.out.format("请输入2班的第%d位同学的成绩\n",i+1);
            b[i]=scanner.nextInt();
        }
        int goodCount=0;
        int goodSum=0;
        for(int i=0;i<3;i++){
            if(a[i]>=90) {
                goodCount++;
                goodSum += a[i];
            }
            if(b[i]>=90) {
                goodCount++;
                goodSum += b[i];
            }
        }
        System.out.println("超过90的人数有："+goodCount);
        System.out.println("超过90的人的平均分是："+(double)goodSum/goodCount);
    }
}
