package month11.day16.Computer;

/**
 * ClassName: InterCpu
 * Description:
 * date: 2021/11/16 17:03
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class InterCpu implements Cpu {
    private String name;

    public InterCpu() {
    }

    public InterCpu(String name) {
        this.name = name;
    }

    @Override
    public String getCpuName() {
        return "Inter CPU "+this.name;
    }
}
