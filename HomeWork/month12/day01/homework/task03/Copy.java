package month12.day01.homework.task03;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.file.Files;

/**
 * ClassName: Copy
 * Description:
 * date: 2021/12/1 19:18
 * 1，创建一个输入流读取源文件夹
 * 2，创建一个输出流写目标文件夹
 * 3，边读边写
 * @author: Lilin
 * @since JDK 1.8
 */
public class Copy {

    public static void main(String[] args){
        File sourceFile = new File("d:\\aaa");
        File targetFile = new File("d:/aaabcc");
//        String s =targetFile.getAbsolutePath();
//        System.out.println(new File(s).getAbsoluteFile());
//        System.out.println(new File(s).getAbsolutePath());
        copyTo(sourceFile,targetFile);
//        File sourceFile = new File("d:\\aaa\\a - 副本.txt");
//        File targetFile = new File("d:\\aaabb\\a - 副本.txt");
//        copyTo(sourceFile,targetFile);
    }

    @SneakyThrows
    private static void copyTo(File sourceFile, File targetFile) {
        if (sourceFile==null||targetFile==null){
            System.out.println("error");
            return;
        }
        InputStream inputStream;
        OutputStream outputStream;

        if (sourceFile.isFile()){
           inputStream = new FileInputStream(sourceFile);
           outputStream = new FileOutputStream(targetFile.getAbsolutePath()+"/"+sourceFile.getName());
           byte[] bytes = new byte[8*1024];
           int length;
           while ((length=inputStream.read(bytes))!=-1){
               outputStream.write(bytes,0,length);
           }
           outputStream.close();
           inputStream.close();
           System.out.println(sourceFile);
           return;
        }

        File file = new File(targetFile.getAbsolutePath()+"/"+sourceFile.getName());
        file.mkdir();
        for (File f:sourceFile.listFiles()){
//            System.out.println(f.getAbsoluteFile());
            copyTo(f,file);
        }
    }
}
