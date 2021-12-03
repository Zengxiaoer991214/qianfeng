package month11.day05;

/**
 * ClassName: Task07
 * Description:
 * date: 2021/11/5 20:21
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Task07 {
    public static void main(String[] args) {
        int count = 9;
        for(int i=1;i<=count;i++){
            for(int j=1;j<=i;j++){
                System.out.format("%3d*%1d=%2d",j,i,i*j);
            }
            System.out.println("");
        }
        System.out.println("=========================================================================");
        for(int i=1;i<=count;i++){
            for(int j=1;j<=count;j++){
                if(j>i) {
                    System.out.format("%3d*%1d=%2d",  j,i, i * j);
                }
                else {
                    System.out.format("%3s %1s %2s", " "," "," ");
                }
            }
            System.out.println("");
        }
    }
}
