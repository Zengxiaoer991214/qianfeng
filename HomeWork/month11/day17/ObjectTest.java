package month11.day17;

/**
 * ClassName: ObjectTest
 * Description:
 * date: 2021/11/17 9:50
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class ObjectTest {

    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest();
        ObjectTest objectTest2;
        while (true){
            objectTest2=new ObjectTest();
            if(objectTest.hashCode()==objectTest2.hashCode()){
                break;
            }
        }
        System.out.println(objectTest.hashCode());
        System.out.println(objectTest2.hashCode());
    }
}
