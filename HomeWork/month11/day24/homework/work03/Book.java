package month11.day24.homework.work03;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * ClassName: Book
 * Description:
 * date: 2021/11/24 17:30
 *
 * @author: Lilin
 * @since JDK 1.8
 */
@Getter
@Setter
public class Book implements Comparable<Book>{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return price!=o.price?
                (int)(price-o.price):this.hashCode()-o.hashCode();
    }
}
