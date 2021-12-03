package month11.day24;

import java.util.*;

/**
 * ClassName: MapTest
 * Description:
 * date: 2021/11/24 11:52
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Record {
    private String phoneNumber;
    private String otherMessage;

    public Record(String phoneNumber, String otherMessage) {
        this.phoneNumber = phoneNumber;
        this.otherMessage = otherMessage;
    }

    public String getOtherMessage() {
        return otherMessage;
    }

    public void setOtherMessage(String otherMessage) {
        this.otherMessage = otherMessage;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Record{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", otherMessage='" + otherMessage + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<People, List<Record>> recordMap = new HashMap<People, List<Record>>() {{
            List<Record> records = new ArrayList<Record>() {{
                add(new Record("22222", "通话时间：2min,时间：14：50"));
                add(new Record("33333", "通话时间：3min,时间：15：50"));
                add(new Record("44444", "通话时间：4min,时间：16：50"));
            }};
            put(new People("lilin", "123456"), records);

            List<Record> records2 = new ArrayList<Record>() {{
                add(new Record("7777", "通话时间：12min,时间：17：50"));
                add(new Record("8888", "通话时间：13min,时间：18：50"));
                add(new Record("9999", "通话时间：14min,时间：19：50"));
            }};
            put(new People("张三", "98765"), records2);
        }};
        for (int i=0;i<2;i++){
            System.out.println("请输入姓名和电话");
            People people = new People(scanner.next(),scanner.next());
            ArrayList<Record> al= new ArrayList<>();
            for (int j=0;j<3;j++){
                System.out.format("请输入通话的电话%d",j+1);
                String str1 = scanner.next();
                System.out.format("请输入通话的其他信息%d",j+1);
                String str2 = scanner.next();
                al.add(new Record(str1, str2));
            }
            recordMap.put(people,al);
       }

        for (People people:recordMap.keySet()){
            System.out.print(people);
            System.out.print("===");
            for (Record record:recordMap.get(people)){
                System.out.println(record);
            }
            System.out.print("\n");
        }
    }
}
