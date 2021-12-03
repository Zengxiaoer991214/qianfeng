package month11.day02;

import java.util.Scanner;
public class Task04{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个大写英文字母:");
		char ch = input.next().charAt(0);
		ch += 32;
		System.out.println("该字母的小写是"+ch);
	}
}
