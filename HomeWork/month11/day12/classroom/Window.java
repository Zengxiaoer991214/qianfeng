package month11.day12.classroom;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import sun.awt.geom.AreaOp;

/**
 * ClassName: Window
 * Description:
 * date: 2021/11/12 20:19
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Window {
    private String name;
    private String status = "关闭";
    public void openWindow(){
        System.out.println("打开窗户");
        this.status = "打开";
    }

    @Override
    public String toString() {
        return "Window{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Window(String name) {
        this.name = name;
    }

    public void closeWindow(){
        System.out.println("关闭窗户");
        this.status = "关闭";
    }
}
