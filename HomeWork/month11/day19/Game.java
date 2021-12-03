package month11.day19;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: Game
 * Description:
 * 完成猜拳游戏
 * 请输入你的选择:
 * 1)石头
 * 2)剪刀
 * 3)布
 * 你的选择是【布】, 电脑的选择是【石头】
 * date: 2021/11/19 16:40
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Game {
    private final Scanner scanner = new Scanner(System.in);
    private final int[][] rule = {{0,1,-1},{-1,0,1},{1,-1,0}};
    private int winCount = 0;
    private int losCount = 0;
    private int count = 0;
    public void paly(){
        while (true){
            System.out.println("请输入你的选择:");
            System.out.println("* 1)石头:");
            System.out.println("* 2)剪刀:");
            System.out.println("* 3)布:");
            int playerOption = scanner.nextInt()-1;
            Random random = new Random();
            int robotOption = random.nextInt(3);
            System.out.print("你出的:   ");
            switch (playerOption){
                case 0:
                    System.out.print("石头\n");
                    break;
                case 1:
                    System.out.print("剪刀\n");
                    break;
                case 2:
                    System.out.print("布\n");
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
            System.out.print("电脑出的:   ");
            switch (robotOption) {
                case 0:
                    System.out.print("石头\n");
                    break;
                case 1:
                    System.out.print("剪刀\n");
                    break;
                case 2:
                    System.out.print("布\n");
                    break;
            }
            switch (rule[playerOption][robotOption]) {
                case -1:
                    System.out.println("你输了");
                    this.losCount++;
                    break;
                case 0:
                    System.out.println("打平了");
                    this.count++;
                    break;
                case 1:
                    System.out.println("你赢了");
                    this.winCount++;
                    break;
            }
            System.out.println("是否继续？Y/N");
            if("N".equals(scanner.next())){
                break;
            }
        }
        System.out.format("你和电脑玩了:%d次\n",this.winCount+this.losCount+this.count);
        System.out.format("你获胜的次数是:%d次\n",this.winCount);
        System.out.format("电脑获胜的次数是:%d次\n",this.losCount);
        System.out.format("平局的次数是:%d次\n",this.count);
    }
}
