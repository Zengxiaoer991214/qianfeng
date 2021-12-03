package month11.day30.time.test2;



public class Customer implements Runnable {
	Cupboard cake;
	private int num;

	public Customer(int num, Cupboard cake) {
		this.cake = cake;
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void run(){
		while(true){
			cake.sale(num);
		}
	}
}
