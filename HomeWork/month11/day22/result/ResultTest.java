package month11.day22.result;

import java.util.List;

/**
 * ClassName: ResultTest
 * Description:
 * date: 2021/11/22 16:07
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class ResultTest {
    public static void main(String[] args) {

        Result r1 = new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMsg(), null);
        Result r2 = new Result(ResultEnum.NO_USER.getCode(), ResultEnum.NO_USER.getMsg(), null);
        Result r3 = new Result(ResultEnum.PWD_ERROR.getCode(), ResultEnum.PWD_ERROR.getMsg(), null);


        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());



    }
}
