package month11.day04;

import java.util.Scanner;

/**
 * @author 14467
 */
public class Task01{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的存款");
		int money = scanner.nextInt();
		if(money>100){
			System.out.println("可以入手宝马X5");
		}
		else if(money>50){
			System.out.println("可以入手奥迪A6");
		}
		else if(money>20){
			System.out.println("可以入手比亚迪");
		}
		else{
			System.out.println("可以玩玩极品飞车");
		}
	}
}
