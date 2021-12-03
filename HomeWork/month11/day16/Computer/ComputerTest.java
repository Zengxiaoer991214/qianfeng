package month11.day16.Computer;

import sun.plugin.cache.CacheUpdateHelper;

/**
 * ClassName: ComputerTest
 * Description:
 * date: 2021/11/16 17:25
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer(new InterCpu("i7-12700H"), new NvidiaGpu("RTX 3090"), new KingstonRam(16));
        computer.run();
        computer.shutDown();
    }
}
