package month11.day30.time.test3;

public class Consumer implements Runnable{

	CakeFactory factory;
	public Consumer(CakeFactory factory) {
		this.factory = factory;
	}
	@Override
	public void run() {
		for(;;) {
			try {
				factory.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
