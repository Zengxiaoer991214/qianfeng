package month11.day16.Computer;

/**
 * ClassName: NvidiaGpu
 * Description:
 * date: 2021/11/16 17:08
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class NvidiaGpu implements Gpu {
    private String name;

    public NvidiaGpu() {
    }

    public NvidiaGpu(String name) {
        this.name = name;
    }

    @Override
    public String getGpuName() {
        return "Nvidia GPU " +this.name;
    }
}
