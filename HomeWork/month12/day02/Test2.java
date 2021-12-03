package month12.day02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * ClassName: Test2
 * Description:
 * date: 2021/12/2 11:51
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://tiebapic.baidu.com/forum/w%3D580/sign=2027cae30cda81cb4ee683c56266d0a4/76fa3af182025aaf29465cdca6edab64024f1a9f.jpg");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        InputStream is = con.getInputStream();
        OutputStream os = new FileOutputStream("d:/a.jpg");

        byte[] buf = new byte[1024*8];
        int length = -1;
        while((length=is.read(buf))!=-1) {
            os.write(buf, 0, length);
        }
        os.close();
        is.close();
        System.out.println("yes");


    }
}
