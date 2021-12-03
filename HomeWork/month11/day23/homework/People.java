package month11.day23.homework;

import java.util.ArrayList;

/**
 * ClassName: AddressBook
 * Description:
 *
 *  1.	设计一个联系人类，完成一个对联系人增删改查的操作流程，
 *  所有的联系人信息存储在	ArrayList集合中
 *
 * date: 2021/11/23 17:14
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class People {
     private String name;
     private String phoneNumber;
     private String address;

    public People() {
    }

    public People(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }
    public String toStringPlus() {
        return  String.format("%8s%18s%20s\n", name, phoneNumber, address);
    }
}
