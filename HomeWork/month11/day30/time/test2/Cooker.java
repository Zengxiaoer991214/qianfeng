package month11.day30.time.test2;

public class Cooker implements Runnable {
	Cupboard cake;
	private int num;
	public Cooker(int num, Cupboard cake) {
		this.cake = cake;
		this.num = num;
	}
	public void run() {
		while(true){
			cake.cook(num);
		}
	}
}
