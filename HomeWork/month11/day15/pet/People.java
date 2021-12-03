package month11.day15.pet;

/**
 * ClassName: People
 * Description:
 * date: 2021/11/15 16:53
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class People {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void play(Pet pet){
        if(pet==null){
            return;
        }
        if(pet.getLifeValue()<=0){
            System.out.println(pet.getName()+"十分饥饿，请先喂养它");
        } else {
            pet.setLifeValue(pet.getLifeValue()-10);
            pet.setFriendlyValue(pet.getFriendlyValue()+10);
            System.out.println(this.getName()+"正在和"+pet.getName()+"玩耍");
            pet.play();
            System.out.println(pet.getName()+"和你的亲密度增加了");
        }
    }
    public void feed(Pet pet){
        if (pet==null){
            return;
        }
        int maxLifeValue = 100;
        if(pet.getLifeValue()>=maxLifeValue){
            System.out.println(pet.getName()+"以及吃饱了，请不要再喂它了");
        }else {
            pet.setLifeValue(pet.getLifeValue()+10);
        }
    }
    public void adopt(Pet pet){
        if(pet==null){
            return;
        }
        int adoptionValue = 80;
        if(pet.getFriendlyValue()>adoptionValue){

            if(pet.getHost()!=null){
                System.out.println("这个宠物已经被人领养了");
                return;
            }
            pet.setHost(this);
            System.out.println("恭喜你你已经领养了它");
        }
        else {
            System.out.println("亲密度为"+pet.getFriendlyValue()+"，不够领养的条件");
        }
    }

    public static void main(String[] args) {
        People people1 = new People("小明",22);
        People people2 = new People("小红",21);
        Cat cat = new Cat("灰猫");
        Dog dog = new Dog("黑狗");
        people1.play(cat);
        people1.play(dog);
        people2.play(cat);

        people1.feed(cat);
        people1.feed(dog);
        people2.feed(cat);

        people2.adopt(dog);

    }
}
