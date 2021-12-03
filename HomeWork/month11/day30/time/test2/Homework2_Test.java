package month11.day30.time.test2;



public class Homework2_Test {

	public static void main(String[] args) throws InterruptedException {

		Cupboard cup = new Cupboard();
		System.out.println(cup.getCake());
		Cooker cooker = new Cooker(1,cup);
		Customer buyer1 = new Customer(1,cup);
		Customer buyer2 = new Customer(1,cup);
		Thread th1 = new Thread(cooker);
		Thread th2 = new Thread(buyer1);
		Thread th3 = new Thread(buyer2);
		th1.start();
		th2.start();
		th3.start();

	}

}
