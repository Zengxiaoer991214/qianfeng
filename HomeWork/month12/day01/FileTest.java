package month12.day01;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/**
 * ClassName: FileTest
 * Description:
 * date: 2021/12/1 10:52
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class FileTest {
    public static void getFiles(List<File> files, File file){
        if (file.isFile()){
            files.add(file);
            return;
        }
        for (File f: Objects.requireNonNull(file.listFiles(pathname ->
                pathname.getName().split("\\.")
                        [pathname.getName().split("\\.").length-1].
                        equals("txt")))){
            getFiles(files,f);
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("D:/aaa");
        List<File> fileList = new ArrayList<>();
        getFiles(fileList,file);
        for (File f:fileList){
            System.out.println(f);
        }
//        HashSet
    }
}
