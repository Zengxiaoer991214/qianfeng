package calendar.calendar;

import java.util.Scanner;
/**
 * @version 0.1.0
 * @author Lilin
 * @since 0.1.0
 */
public class Calendar {
    private final int[] months={0,31,28,31,30,31,30,31,31,30,31,30,31};
    private int year;
    private int month;
    /**
     * isLeapYear
     *
     * @param date:
     * @version 0.1.0
     * @return boolean
     * @author Lilin
     * @since 0.1.0
     */
    public boolean isLeapYear(int date){
        return date % 400 == 0 || (date % 4 == 0 && date % 100 != 0);
    }

    /**
     * hasLeapYearCount
     *

     * @version 0.1.0
     * @return int
     * @author Lilin
     * @since 0.1.0
     */
    public int hasLeapYearCount(){
        int count=0;
        for(int i=1;i<this.year;i++) {
            if (isLeapYear(i)) {
                count += 1;
            }
        }
        return count;
    }
    /**
     * parseToDate
     *
     * @param dateString:
     * @version 0.1.0
     * @return void
     * @author Lilin
     * @since 0.1.0
     */
    public void parseToDate(String dateString){
        String [] str = dateString.split("/");
        for(String s:str){
            System.out.println(s);
        }
        this.year = Integer.parseInt(str[0]);
        this.month = Integer.parseInt(str[1]);
    }
    /**
     * printDate
     *

     * @version 0.1.0
     * @return void
     * @author Lilin
     * @since 0.1.0
     */
    public void printDate(){
        int dateCount = hasLeapYearCount()*366+(this.year-1-hasLeapYearCount())*365;
        for(int i=1;i<this.month;i++){
            dateCount+=this.months[i];
            if (i==2&&isLeapYear(this.year)){
                dateCount+=1;
            }
        }
        dateCount+=1;
        int startDay = dateCount%7;
        System.out.format("%-3s%-3s%-3s %-3s%-3s %-3s%-3s\n","日","一","二","三","四","五","六");
        for(int i=0;i<startDay;i++) {
            System.out.format("%-4s","");
        }
        int days = (this.month==2&&isLeapYear(this.year))? months[this.month]+1:months[this.month];
        for(int i=1;i<=days;i++){
            if((i+startDay-1)%7==0) {
                System.out.println();
            }
            System.out.format("%-4d",i);

        }
    }
    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请按照\"2021/11/3\"的格式输入日期:");
        String str = scanner.next();
        calendar.parseToDate(str);
        calendar.printDate();
    }
}
