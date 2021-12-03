package month11.day30.time.test3;

public class CakeFactory {
      Cake[] cakes = new Cake[6];//仓储模型
      int index = 0;//指向该操作的蛋糕
      public synchronized void produce(Cake cake) throws InterruptedException {
    	  while(index>=6) {
    		  System.out.println(Thread.currentThread().getName()+"发现蛋糕柜已经装满了，休息一下");
    		  this.wait();
    	  }
    	  cakes[index] = cake;
    	  index++;
    	  System.out.println(cake.getProduceName()+"生产了编号为"+cake.getId()+"的蛋糕");
    	  Thread.sleep(1000);
    	  this.notifyAll();
      }

      public synchronized void consume() throws InterruptedException {
    	  while(index<=0) {
    		  System.out.println(Thread.currentThread().getName()+"发现蛋糕已经卖完了，等等再买");
    		  this.wait();
    	  }
    	  index--;
    	  Cake cake = cakes[index];
    	  cakes[index] = null;
    	  System.out.println(Thread.currentThread().getName()+"买走了"+cake.getProduceName()+"生产的编号为"+cake.getId()+"的蛋糕");
    	  Thread.sleep(1000);
    	  this.notifyAll();
      }
}
