package month11.day04;

import java.util.Scanner;
public class Task02{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的分数");
		int score = scanner.nextInt();
		if(score<=80){
			System.out.println("罚一个iphone6s");
		}
		else if(score<=90){
			System.out.println("奖励一个iphone4");
		}
		else{
			System.out.println("奖励一个iphone4，再奖励一个ipad");
		}
	}
}
