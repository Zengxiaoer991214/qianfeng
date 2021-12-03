package month11.day16.Computer;

/**
 * ClassName: Computer
 * Description:
 * date: 2021/11/16 17:19
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Computer {

    private Cpu cpu;
    private Gpu gpu;
    private Ram ram;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }



    public Computer(Cpu cpu, Gpu gpu, Ram ram) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }
    public void run(){
        System.out.println("配置如下:");
        System.out.println(this.cpu.getCpuName());
        System.out.println(this.gpu.getGpuName());
        System.out.println(this.ram.getRamName());
        System.out.println("的电脑运行起来了");
    }
    public void shutDown(){
        System.out.println("电脑关机了");
    }
}
