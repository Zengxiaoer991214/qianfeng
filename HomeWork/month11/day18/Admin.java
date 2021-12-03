package month11.day18;

/**
 * ClassName: Admin
 * Description:
 * date: 2021/11/18 11:34
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Admin extends User{

    private String clazz;

    public Admin() {
    }

    public Admin(String name, String password, String clazz) {
        super(name,password);
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "clazz='" + clazz + '\'' +
                "} " + super.toString();
    }
}
