package month11.day27.hashmaptest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ClassName: Student
 * Description:
 * date: 2021/11/27 10:35
 *
 * @author: Lilin
 * @since JDK 1.8
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student{
    private String name;
    private int age;

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
