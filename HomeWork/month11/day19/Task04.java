package month11.day19;

/**
 * ClassName: Task04
 * Description:
 *
 * 从控制台录入一个字符串，判断字符'a'在该字符串中出现的次数
 *
 * date: 2021/11/19 16:27
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task04 {
    public static int getCharCount(String str, char ch){
        int count = 0;
        char[] chars = str.toCharArray();
        for (char c: chars){
            if(c==ch){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abccccbbbaaaa";
        char ch = 'a';
        System.out.println(getCharCount(str, ch));
    }
}
