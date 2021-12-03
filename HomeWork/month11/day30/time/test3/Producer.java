package month11.day30.time.test3;

public class Producer implements Runnable{

	CakeFactory factory;
	public Producer(CakeFactory factory) {
		this.factory = factory;
	}
	@Override
	public void run() {
		for(int i=1;;i++) {
			try {
				factory.produce(new Cake(i,Thread.currentThread().getName()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
