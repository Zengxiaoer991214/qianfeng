package month11.day12.Task02;

/**
 * ClassName: Fridge
 * Description:
 * date: 2021/11/13 11:38
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Fridge {
    private String name;
    private String item = "";
    private boolean isOpen = false;

    public void pushitem(String item){
        if (isOpen){
            this.item+= item+",";
            System.out.println(item + "被放进了冰箱");
        }
        else {
            System.out.println("请先打开冰箱门");
        }
    }
    public void open(){
        this.isOpen = true;
        System.out.println("冰箱门被打开");
    }

    public void close(){
        this.isOpen = false;
        System.out.println("冰箱门被关闭");
    }
    @Override
    public String toString() {
        return "Fridge{" +
                "name='" + name + '\'' +
                ", item='" + item + '\'' +
                '}';
    }

    public Fridge(String name) {
        this.name = name;
    }
}
