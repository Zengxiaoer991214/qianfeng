package month11.day24.homework.work01;

import java.util.Objects;

/**
 * ClassName: Student
 * Description:
 * date: 2021/11/24 17:03
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Student {
    private String name;
    private int cardId;

    public Student() {
    }

    public Student(String name, int cardId) {
        this.name = name;
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cardId=" + cardId +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//
//        return true;
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Student)) return false;
//        Student student = (Student) o;
//        return cardId == student.cardId && name.equals(student.name);
//    }

    @Override
    public int hashCode() {
        return 0;
    }
}


