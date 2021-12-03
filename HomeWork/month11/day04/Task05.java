package month11.day04;

import java.util.Scanner;
public class Task05{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要拨的号码");
		int num = scanner.nextInt();
		switch(num){
			case 1:
			System.out.println("正在拨打爸爸的号码");
			break;
			case 2:
			System.out.println("正在拨打妈妈的号码");
			break;
			case 3:
			System.out.println("正在拨打爷爷的号码");
			break;
			case 4:
			System.out.println("正在拨打奶奶的号码");
			break;
			default:
				System.out.println("空号");

		}
	}
}
