package month11.day03;

import java.util.Scanner;

/**
 * @author 14467
 */
public class Task01{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个数字");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int max = num1<num2?(num1<num3?num1:num3):num2<num3?num2:num3;
		System.out.println("最大的数是"+max);
	}
}
