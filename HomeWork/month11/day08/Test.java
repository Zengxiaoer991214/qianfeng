package month11.day08;

import java.util.Scanner;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/8 15:08
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {

    /**
     * printChar
     * @desctiptopn

     * @param row:
     * @param col:
     * @param ch:
     * @version 0.1.0
     * @return void
     * @author Lilin
     * @since 0.1.0
     */
    public static void printChar(int row,int col, char ch){

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(ch);
            }
            System.out.println("");
        }
    }

    /**
     * isWin
     * @desctiptopn

     * @param num:
     * @version 0.1.0
     * @return boolean
     * @author Lilin
     * @since 0.1.0
     */
    public static boolean isWin(int num){
        int temp = num;
        int count = 0;
        int flag = 20;
        while (temp!=0){
            count += temp%10;
            temp /=10;
        }
        return count >= flag;
    }
    public static void main(String[] args) {
//        printChar(5,5,'?');
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("请输入你的开奖号码");
            int num = scanner.nextInt();
            if (isWin(num)) {
                System.out.println("恭喜你 中奖了");
            } else {
                System.out.println("很遗憾 没有中奖");
            }
            System.out.println("是否继续抽奖？Y/N");
        } while (scanner.next().charAt(0) == 'Y');
    }

}
