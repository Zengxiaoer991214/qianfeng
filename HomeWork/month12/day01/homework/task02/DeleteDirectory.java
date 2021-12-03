package month12.day01.homework.task02;

import java.io.File;

/**
 * ClassName: DeleteDirectory
 * Description:
 * date: 2021/12/1 19:07
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class DeleteDirectory {
    public static void delete(File file){
        if (file==null)
            return;
        if (file.isFile()){
            file.delete();
            return;
        }
        for (File f: file.listFiles()){
            delete(f);
        }
        file.delete();
    }

    public static void main(String[] args) {
        File file = new File("d:/aaa - 副本 - 副本 - 副本");
        delete(file);

    }
}
