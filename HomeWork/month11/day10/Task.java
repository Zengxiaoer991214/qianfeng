package month11.day10;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Task
 * Description:
 * date: 2021/11/10 14:48
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task {
    private final String[] chineseCharacter = {"零", "一", "二", "三", "四", "五", "六", "七", "八","九"};
    private final String[] unit = {"", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千"};
    /**
     * parseChinese
     * @desctiptopn 
                  
     * @param number: 
     * @version 0.1.0
     * @return java.lang.String
     * @author Lilin
     * @since 0.1.0
     */
    public String parseChinese(int number){
        int[] nums = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        for(int i=0;number!=0;i++){
            nums[i]=number%10;
            number/=10;
        }
        String str = "";
        for (int i=0;nums[i]!=-1;i++){
            str = this.chineseCharacter[nums[i]] + this.unit[i] + str;

        }
        str = str.
                replaceAll("零[千百十]", "零")
                .replaceAll("零+万", "万")
                .replaceAll("零+亿", "亿")
                .replaceAll("零+", "零")
                .replaceAll("零$", "");
        return str;
    }

    public static void main(String[] args) {
        Task task = new Task();
        int num = 104_234_005;
        System.out.println(num);
        System.out.println(task.parseChinese(num));
        num = 1_007_234_500;
        System.out.println(num);
        System.out.println(task.parseChinese(num));
    }

}
