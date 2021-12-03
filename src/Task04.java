import java.util.Scanner;
public class Task04{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入工资");
        double money = scanner.nextDouble();
        double start = 3500.0;
        double tax = 0.0;
        if(money<=start){
            tax = 0.0;
        }
        else if(money<=start+1500){
//            tax = (money-start)*0.03;
            tax = (money-start)*0.03-0;
        }
        else if(money<=start+4500){
//            tax = (money-start-1500)*0.1+ 1500*0.03;
            tax = (money-start)*0.1 - 105;
        }
        else if(money<=start+9000){
//            tax = (money-start-4500)*0.2+ 1500*0.03+ (4500-1500)*0.1;
            tax = (money-start)*0.2 - 555;
        }
        else if(money<=start+35000){
            tax = (money-start)*0.25-1005;
        }
        else if(money<=start+55000){
            tax = (money-start)*0.3 -2755;
        }
        else if(money<=start+80000){
            tax = (money-start)*0.35-5505;
        }
        else{
            tax = (money-start)*0.45-13505;
        }
        System.out.println("你需要缴纳的税是："+tax);
    }
}
