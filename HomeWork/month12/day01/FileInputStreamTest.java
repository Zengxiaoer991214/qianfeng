package month12.day01;

import lombok.SneakyThrows;

import java.io.*;
import java.util.Arrays;

/**
 * ClassName: FileInputStreamTest
 * Description:
 * date: 2021/12/1 15:08
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class FileInputStreamTest {
    @SneakyThrows
    public static void main(String[] args) {
        InputStream input = new FileInputStream("D:/aaa.txt");
//        int ch=-1;
//        while ((ch=input.read())!=-1){
//            System.out.println((char)ch);
//        }
        OutputStream output = new FileOutputStream("d:/bbb.txt");
        int len=-1;
        byte[] bytes = new byte[1024];
        StringBuilder sb= new StringBuilder();
        while ((len=input.read(bytes))!=-1){
            sb.append(new String(bytes, 0, len));
            output.write(bytes);
        }
        System.out.println(sb);
        output.close();
        input.close();
    }
}
