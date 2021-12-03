package month11.day23.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: WorkerTest
 * Description:
 * date: 2021/11/23 19:18
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class WorkerTest {
    public static void main(String[] args) {
        //1. 创建一个List，在List中增加三个工人，基本信息如下
        List<Worker> workers = new ArrayList<Worker>(){{
             add(new Worker("zhang3",18,3000.0));
             add(new Worker("li4",25,3500.0));
             add(new Worker("wang5",22,3200.0));
        }};
        // 2> 在li4之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
        Worker worker=null;
        for (Worker work: workers){
            if("li4".equals(work.getName())){
                worker = work;
            }
        }

        workers.add(workers.indexOf(worker),new Worker("zhao6", 24, 3300.0));

        // 3> 删除wang5 的信息
        for (Worker work: workers){
            if("wang5".equals(work.getName())){
                workers.remove(work);
                break;
            }
        }
        // 4>利用for 循环遍历，打印List 中所有工人的信息
        for (Worker work: workers){
            System.out.println(work);
        }
        //6> 为工人类Worker重写equals方法，当姓名、年龄、工资全部相等时候才返回true
        System.out.println(new Worker("李四",22, 2000.0).equals(new Worker("李四",23, 2000.0)));
        System.out.println(new Worker("李四",23, 2000.0).equals(new Worker("李四",23, 2000.0)));

    }
}
