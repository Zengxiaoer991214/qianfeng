package month11.day12;

/**
 * ClassName: Cat
 * Description:
 * date: 2021/11/12 16:27
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Cat extends Animal{
    @Override
    public String toString() {
        return "Cat{} " + super.toString();
    }

    private int lives;

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public Cat(String name, int health, int love) {
        super(name, health, love);
    }
}
