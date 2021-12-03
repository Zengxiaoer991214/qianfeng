package month11.day15.pet;

/**
 * ClassName: Pet
 * Description:
 * date: 2021/11/15 16:43
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Pet {
    private String name;
    private int lifeValue=50;
    private int friendlyValue=50;
    private People host;

    public void play(){
        System.out.println("正在和宠物玩耍");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        int maxLfeValue = 100;
        int minLifeValue = 0;
        if(lifeValue>maxLfeValue){
            this.lifeValue = 100;
        } else if (lifeValue<minLifeValue){
            this.lifeValue = 0;
        }else {
            this.lifeValue = lifeValue;
        }
    }

    public int getFriendlyValue() {
        return friendlyValue;
    }

    public void setFriendlyValue(int friendlyValue) {
        int maxFriendlyValue = 100;
        int minFriendlyValue = 0;
        if(friendlyValue>maxFriendlyValue){
            this.friendlyValue = 100;
        } else if (friendlyValue<minFriendlyValue){
            this.friendlyValue = 0;
        }else {
            this.friendlyValue = friendlyValue;
        }
    }

    public People getHost() {
        return host;
    }

    public void setHost(People host) {
        this.host = host;
    }

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }
}
