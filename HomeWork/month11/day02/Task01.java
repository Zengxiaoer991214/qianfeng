package month11.day02;

public class Task01{
	public static void main(String []args){
		int a=2;
		int b=3;
		System.out.println("a="+a);
		System.out.println("b="+b);
		// 不使用第三个变量
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		// 使用第三个变量
		//int c=a;
		//a=b;
		//b=c;
		//System.out.println("a="+a);
		//System.out.println("b="+b);

	}
}
