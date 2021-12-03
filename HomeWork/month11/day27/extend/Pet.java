package month11.day27.extend;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

/**
 * ClassName: Pet
 * Description:
 * date: 2021/11/27 15:58
 *
 * @author: Lilin
 * @since JDK 1.8
 */
@Getter
@Setter
@ToString
public class Pet {
    private String name;
    private int age;

    public Map t(){
        System.out.println("返回值是map");
        return null;
    }

}
