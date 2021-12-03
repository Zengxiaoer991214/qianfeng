package month11.day13;

/**
 * ClassName: Rectangle
 * Description:
 * date: 2021/11/13 13:15
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Rectangle {
    private double length;
    private double width;

    public double getArea(){
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getCircumference(){
        return 2*(length+width);
    }
}
