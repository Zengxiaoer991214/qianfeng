package month11.day12.Task02;

/**
 * ClassName: People
 * Description:
 * date: 2021/11/13 11:43
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void doAnything(Elephant elephant, Fridge fridge){
        fridge.open();
        fridge.pushitem(elephant.getName());
        fridge.open();
        System.out.println(fridge.toString());
    }

    public static void main(String[] args) {

         Elephant elephant = new Elephant("大象");
         Fridge fridge = new Fridge("电冰箱");
         People people = new People("小明",20);
         people.doAnything(elephant,fridge);
    }
}
