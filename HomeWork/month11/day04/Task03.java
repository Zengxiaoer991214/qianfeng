package month11.day04;

import java.util.Scanner;
public class Task03{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入三个整数");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if(a<b){
			int temp =a;
			a=b;
			b=temp;
		}
		if(c>a){
			int temp =c;
			c=b;
			b=a;
			a=temp;
		}else if(c>b){
			int temp =c;
			c=b;
			b=temp;
		}
		System.out.println(a+">"+b+">"+c);
	}
}
