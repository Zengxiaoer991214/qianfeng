package month11.day26.homework.work01;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/26 17:50
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        int num = 20_000;
        long startTime = System.currentTimeMillis();

        int base = num/10;
        Calculator calculator;
        for (int i=0;i<10;i++){
            calculator =  new Calculator(base*i,base*(i+1));
            calculator.start();
            calculator.join();
        }
//        System.out.println(calculator.getEnd());
        System.out.println(Result.result);
        long endTime = System.currentTimeMillis();
        System.out.println("多线程：" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        long count = 0;
        for(int i =0;i<num;i++) {
            count += i;
        }
        System.out.println(count);
        endTime = System.currentTimeMillis();
        System.out.println("单线程：" + (endTime - startTime) + "ms");
    }
}
