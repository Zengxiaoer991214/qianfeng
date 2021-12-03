package month11.day16.Computer;

/**
 * ClassName: AMDCpu
 * Description:
 * date: 2021/11/16 17:04
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class AMDCpu implements Cpu {
    private String name;

    public AMDCpu() {
    }

    public AMDCpu(String name) {
        this.name = name;
    }

    @Override
    public String getCpuName() {
        return "AMD CPU "+this.name;
    }
}
