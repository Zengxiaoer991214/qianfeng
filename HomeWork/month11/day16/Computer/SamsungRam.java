package month11.day16.Computer;

/**
 * ClassName: Kingston
 * Description:
 * date: 2021/11/16 17:15
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class SamsungRam implements Ram{

    private int RamSize;

    public SamsungRam() {
    }

    public SamsungRam(int ramSize) {
        RamSize = ramSize;
    }

    @Override
    public String getRamName() {
        return "Samsung Ram 容量"+this.RamSize+" G";
    }
}
