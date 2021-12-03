package month11.day30.time.test2;

public class Cupboard {
	int cake = 0;

	public int getCake() {
		return cake;
	}

	public void setCake(int cake) {
		this.cake = cake;
	}

	public void cook(int num) {
		cake += num;
		System.out.println(Thread.currentThread().getName() + "1"
		+ num + "1" + cake + "1");

	}

	public void sale(int num) {
		cake -= num;
		System.out.println(Thread.currentThread().getName() + "2"
		+ num + "2" + cake + "2");

	}

}
