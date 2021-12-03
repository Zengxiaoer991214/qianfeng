package month11.day30.time.test3;

public class Test {
	public static void main(String[] args) {
		CakeFactory factory = new CakeFactory();
		new Thread(new Producer(factory),"蛋糕师1").start();
		new Thread(new Consumer(factory),"顾客1").start();
		new Thread(new Producer(factory),"蛋糕师2").start();
		new Thread(new Consumer(factory),"顾客2").start();
	}

}
