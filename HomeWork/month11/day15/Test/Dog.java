package month11.day15.Test;

/**
 * ClassName: Dog
 * Description:
 * date: 2021/11/15 14:08
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Dog extends Pet{
    public String name="dog";

    @Override
    public String getPetName(){
        return "Dog的getPetName";
    }
    public String getPetName2(){
        return super.getPetName();
    }
    @Override
    public void show(){
        System.out.println("dog叫");
    }

    public static void main(String[] args) {
        Pet pet = new Dog();
        System.out.println(pet.getPetName());
        System.out.println(((Dog)pet).getPetName());
        System.out.println(((Dog)pet).getPetName2());

//        Dog dog = new Dog();
//        System.out.println(dog.getPetName());
//        System.out.println(((Pet)dog).getPetName());
//        System.out.println(dog.getPetName2());
//        Pet[] pets = new Pet[3];
//        pets[0] = new Cat();
//        pets[1] = new Dog();
//        pets[2] = new Bird();
//        for (Pet pet : pets){
//            pet.show();
//        }


    }
}
