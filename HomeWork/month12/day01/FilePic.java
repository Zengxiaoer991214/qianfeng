package month12.day01;

import jdk.internal.util.xml.impl.Input;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ClassName: FilePic
 * Description:
 * date: 2021/12/1 15:35
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class FilePic {
    @SneakyThrows
    public static void main(String[] args) {
        InputStream is = new FileInputStream("d:/pic.png");
        OutputStream os = new FileOutputStream("d:/pic2.png");
        byte[] bytes = new byte[1024*8];
        int len;
        while ((len=is.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        os.close();
        is.close();
    }
}
