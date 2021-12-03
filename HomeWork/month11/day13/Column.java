package month11.day13;

/**
 * ClassName: Column
 * Description:
 * date: 2021/11/13 13:24
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Column {
    private Rectangle rectangle;
    private double heigth;

    public Column(Rectangle rectangle, double heigth) {
        this.rectangle = rectangle;
        this.heigth = heigth;
    }

    public double getSurfaceArea(){
        return rectangle.getArea()*2+rectangle.getCircumference()*heigth;
    }
    public double getVolume(){
        return rectangle.getArea()*heigth;
    }
}
