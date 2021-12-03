package month11.day23.homework;

import month11.day23.student.Student;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName: PeopleTest
 * Description:
 * date: 2021/11/23 17:19
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class AddressBook {
    private final ArrayList<People> people = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    public AddressBook() {
        this.people.add(new People("张三","13888888888","肖家河大厦一楼 101"));
        this.people.add(new People("李四","17388888888","肖家河大厦二楼 201"));
        this.people.add(new People("王五","16888888888","肖家河大厦一楼 102"));
        this.people.add(new People("周六","15888888888","肖家河大厦一楼 103"));
    }

    public void start(){
        do {
            System.out.println("欢迎使用通讯录");
            System.out.println("请选择功能");
            System.out.println("1) 查看所有联系人");
            System.out.println("2) 查询某个联系人");
            System.out.println("3) 修改某个联系人");
            System.out.println("4) 删除某个联系人");
            System.out.println("0) 推出通讯录");

            switch (scanner.next()){
                case "0":
                    return;
                case "1":
                    showAllPeople();
                    break;
                case "2":
                    showOnePeople();
                    break;
                case "3":
                    change();
                    break;
                case "4":
                    delete();
                    break;
            }
            System.out.println("是否继续？Y/N");
        } while ("Y".equals(scanner.next()));

    }

    private void delete() {
        System.out.println("请选择功能");
        System.out.println("1) 通过名字删除");
        System.out.println("2) 通过电话删除");
        switch (scanner.next()){
            case "1":
                System.out.println("请输入姓名");
                deleteByName(scanner.next());
                break;
            case "2":
                System.out.println("请输入电话");
                deleteByPhoneNumber(scanner.next());
                break;
            default:
                System.out.println("输入有误");
        }
    }

    public void showOnePeople(){
        System.out.println("请选择");
        System.out.println("1) 按照名字查找");
        System.out.println("2) 按照电话查找");
        People people = null;
        switch (scanner.next()){
            case "1":
                System.out.println("请输入名字");
                people = findByName(scanner.next());
                break;
            case "2":
                System.out.println("请输入电话");
                people = findByPhoneNumber(scanner.next());
                break;
        }
        if (people!=null) {
            System.out.format("%8s%18s%20s\n", "姓名", "电话号码", "地址");
            System.out.print(people.toStringPlus());
        } else{
            System.out.println("查无此人！");
        }
    }
    public void showAllPeople(){
        System.out.format("%8s%18s%20s\n", "姓名", "电话号码", "地址");
        for (People people: this.people){
            System.out.print(people.toStringPlus());
        }
    }

    public void addPeople(String name, String phoneNumber, String address){
        this.people.add(new People(name, phoneNumber,address));
    }

    public People findByName(String name){
        for (People people:this.people){
            if(people.getName().equals(name)){
                return people;
            }
        }
        return null;
    }
    public People findByPhoneNumber(String phoneNumber){
        for (People people:this.people){
            if(people.getPhoneNumber().equals(phoneNumber)){
                return people;
            }
        }
        return null;
    }


    public void deleteByName(String name){
        this.people.removeIf(people -> people.getName().equals(name));
    }

    public void deleteByPhoneNumber(String phoneNumber){
        this.people.removeIf(people -> people.getPhoneNumber().equals(phoneNumber));
    }

    public void change(){
        System.out.println("请输入你需要修改联系人的名字");
        People people = findByName(scanner.next());
        if(people!=null){
            System.out.println("请选择你修改的内容");
            System.out.println("1). 姓名");
            System.out.println("2). 电话");
            System.out.println("3). 地址");
            switch (scanner.next()){
                case "1":
                    System.out.println("原来的姓名是："+ people.getName());
                    System.out.println("请输入新的名字");
                    people.setName(scanner.next());
                    System.out.println("修改成功");
                    return;
                case "2":
                    System.out.println("原来的电话是："+ people.getPhoneNumber());
                    System.out.println("请输入新的电话");
                    people.setPhoneNumber(scanner.next());
                    System.out.println("修改成功");
                    return;
                case "3":
                    System.out.println("原来的地址是："+ people.getAddress());
                    System.out.println("请输入新的地址");
                    people.setAddress(scanner.next());
                    System.out.println("修改成功");
                    return;
            }
        }
        System.out.println("对不起 你输入的联系人不存在");

    }

}
