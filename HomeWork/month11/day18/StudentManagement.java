package month11.day18;

import java.util.Scanner;

/**
 * ClassName: StudentManagement
 * Description:
 * date: 2021/11/18 10:07
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class StudentManagement {

    private Student[] students;
    private final Admin[] admins;
    private int studentCount;
    private Student studentLog;
    private Admin AdminLog;
    private final Scanner scanner = new Scanner(System.in);

    public StudentManagement() {
        this.studentCount=2;
        int adminCount = 2;
        this.students = new Student[this.studentCount];
        this.students[0] = new Student("张三","123","1","Java 2112","男");
        this.students[1] = new Student("李四","123","2","Java 2112","男");

        this.admins = new Admin[adminCount];
        this.admins[0] = new Admin("管理员1","111","Java 2112");
        this.admins[1] = new Admin("管理员2","222","Java 2112");

        menuTop();
    }

    /**
     * menuTopPoster
     * @description:
     *
     * 顶级菜单的输出部分
     *
     * @params []
     * @return void
     * @author Lilin
     * @date 2021/11/18 17:12
     */
    public void menuTopPoster(){
        System.out.println("欢迎使用学生管理系统");
        System.out.println("请选择你需要使用的功能");
        System.out.println("1. 学生登录");
        System.out.println("2. 管理员登录");
        System.out.println("3. 学生注册");
        System.out.println("0. 推出系统");
    }

    /**
     * menuTop
     * @description:
     *
     * 顶级菜单
     *
     * @params []
     * @return void
     * @author Lilin
     * @date 2021/11/18 17:10
     */
    public void menuTop(){
        while (true) {
            clear();
            menuTopPoster();
            switch (scanner.next()) {
                case "1":
                    studentLogin();
                    break;
                case "2":
                    adminLogin();
                    break;
                case "3":
                    studentRegister();
                    break;
                case "0":
                    System.out.println("谢谢使用");
                    return;
                default:
                    System.out.println("输入错误,清重新输入");
                    menuTop();
            }
        }
    }

    /**
     * cheekStudentNumber
     * @description:
     *
     * 实现学号的自增
     *
     * @params []
     * @return java.lang.String
     * @author Lilin
     * @date 2021/11/18 17:10
     */
    public String cheekStudentNumber(){
        int num = 0;
        for(int i=0;i<studentCount;i++){
            num = Math.max(num, Integer.parseInt(students[i].getStudentID()));
        }
        num++;

        return num+"";
    }

    /**
     * arrayExpansion
     * @description:
     *
     * 数组扩容
     *
     * @params []
     * @return void
     * @author Lilin
     * @date 2021/11/18 17:10
     */
    public void arrayExpansion(){
        this.students=java.util.Arrays.copyOf(students,studentCount*2);
    }

    /**
     * studentRegister
     * @description:
     *
     * 学生注册
     *
     * @params []
     * @return void
     * @author Lilin
     * @date 2021/11/18 17:09
     */
    public void studentRegister() {
        Student student = new Student();
        System.out.println("请输入姓名");
        student.setName(scanner.next());
        System.out.println("请输入班级");
        student.setClazz(scanner.next());
        System.out.println("请输入性别");
        student.setGender(scanner.next());
        student.setStudentID(cheekStudentNumber());
        if(studentCount==this.students.length){
            arrayExpansion();
        }
        this.students[studentCount] = student;
        studentCount++;
        showAllStudent();
    }

    /**
     * studentLogin
     * @description:
     *
     * 学生登录判断
     *
     * @params []
     * @return boolean
     * @author Lilin
     * @date 2021/11/18 14:33
     */
    public User login(User[] arrays){
        int count =3;
        while (count>0) {
            System.out.println("请输入你的姓名");
            String name = scanner.next();
            System.out.println("请输入你的密码");
            String password = scanner.next();

            for (User user : arrays) {
                if (user != null) {
                    if (user.getName().equals(name) && user.getPassword().equals(password)) {
                        return user;
                    }
                }
            }
            count--;
            System.out.println("输入错误,请重新输入，还剩"+count+"次机会");
        }
        return null;
    }

    /**
     * studentLogin
     * @description:
     *
     * 学生登录
     *
     * @params []
     * @return void
     * @author Lilin
     * @date 2021/11/18 17:09
     */
    public void studentLogin(){
        User user = login(this.students);
        if(user==null){
            return;
        }
        System.out.println("登陆成功");
        clear();
        this.studentLog = (Student) user;
        studentSecondMenu();
    }

    /**
     * adminLogin
     * @description:
     *
     * 管理员登录
     *
     * @params []
     * @return void
     * @author Lilin
     * @date 2021/11/18 17:09
     */
    private void adminLogin() {
        User user = login(this.admins);
        if(user==null){
            return;
        }
        System.out.println("登陆成功");
        clear();
        this.AdminLog = (Admin) user;
        adminSecondMenu();
    }

    /**
     * adminSecondMenu
     * @description:
     *
     * 管理员的二级菜单
     *
     * @params []
     * @return void
     * @author Lilin
     * @date 2021/11/18 17:08
     */
    private void adminSecondMenu() {

        do {
            System.out.println("请选择你要执行的功能：");
            System.out.println("1.修改名字");
            System.out.println("2.修改密码");
            System.out.println("3.查看所有学生");
            System.out.println("4.删除学生");
            System.out.println("其他.返回上级菜单");
            switch (scanner.next()){
                case "1":
                    changeName(this.AdminLog);
                    break;
                case "2":
                    changePassword(this.AdminLog);
                    break;
                case "3":
                    showAllStudent();
                    break;
                case "4":
                    deleteStudent();
                    break;
                default:
                    return;
            }

        } while (true);
    }

    /**
     * deleteStudent
     * @description:
     *
     * 删除学生
     *
     * @params []
     * @return void
     * @author Lilin
     * @date 2021/11/18 17:08
     */
    public void deleteStudent(){
        showAllStudent();
        System.out.println("请输入如你需要删除的学生的学号");
        String input = scanner.next();
        for (int i=0;i<studentCount;i++){
            if(input.equals(students[i].getStudentID())){
                if (studentCount - 1 - i >= 0) System.arraycopy(students, i + 1, students, i, studentCount - 1 - i);
                students[studentCount-1]=null;
                studentCount--;
                System.out.println("删除成功");
                showAllStudent();
                return;
            }
        }
        System.out.println("未找到该学生,请检查输入");
    }

    /**
     * showAllStudent
     * @description:
     *
     * 输出所有学生的信息，调用了toStringPlus
     *
     * @params []
     * @return void
     * @author Lilin
     * @date 2021/11/18 17:12
     */
    private void showAllStudent() {
        System.out.format("%-6s %-4s %-18s %-4s\n", "姓名", "学号", "班级","性别");
        for (int i=0;i<studentCount;i++){
            System.out.println(students[i].toStringPlus());
        }
    }

    /**
     * studentSecondMenu
     * @description:
     *
     * 学生登陆后的二级菜单
     *
     * @params []
     * @return void
     * @author Lilin
     * @date 2021/11/18 14:42
     */
    public void studentSecondMenu(){
        do {
            System.out.println("请选择你要执行的功能：");
            System.out.println("1.修改名字");
            System.out.println("2.修改密码");
            System.out.println("其他.返回上级菜单");
            switch (scanner.next()){
                case "1":
                changeName(this.studentLog);
                break;
                case "2":
                changePassword(this.studentLog);
                break;
                default:
                    return;
            }

        } while (true);
    }

    /**
     * changeName
     * @description:
     *
     * 修改用户名，管理员和学生通用
     *
     * @params [month11.day18.User]
     * @return void
     * @author Lilin
     * @date 2021/11/18 17:13
     */
    public void changeName(User user){
        clear();
        System.out.println("你原来的名字是"+ user.getName());
        System.out.println("请输入你的新名字");
        user.setName(scanner.next());
        System.out.println("修改成功");
    }

    /**
     * changePassword
     * @description:
     *
     * 修改名字，管理员和学生通用
     *
     * @params [month11.day18.User]
     * @return void
     * @author Lilin
     * @date 2021/11/18 17:14
     */
    public void changePassword(User user){
        clear();
        System.out.println("请输入你原来的密码");
        if(!user.getPassword().equals(scanner.next())){
            System.out.println("密码错误");
            return;
        }
        System.out.println("请输入你的新密码");
        String s1 = scanner.next();
        System.out.println("请再次输入你的新密码");
        String s2 = scanner.next();
        if (!s1.equals(s2)){
            System.out.println("两次密码不一致");
            return;
        }
        user.setPassword(s1);
        System.out.println("修改成功");
    }

    /**
     * clear
     * @description:
     *
     * 清屏
     *
     * @params []
     * @return void
     * @author Lilin
     * @date 2021/11/18 17:14
     */
    public void clear(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
