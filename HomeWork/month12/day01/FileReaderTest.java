package month12.day01;

import lombok.SneakyThrows;

import java.io.*;

/**
 * ClassName: FileReader
 * Description:
 * date: 2021/12/1 16:41
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class FileReaderTest {
    @SneakyThrows
    public static void main(String[] args) {
        Reader r = new FileReader("d:/aaa.txt");
        Writer w = new FileWriter("d:/bbb.txt");
        int len;
        char[] ch = new char[3];

        while((len=r.read(ch))!=-1){
            System.out.println(ch);
            w.write(ch);
        }
        w.close();
    }
}
