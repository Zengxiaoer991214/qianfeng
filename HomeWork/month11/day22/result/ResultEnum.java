package month11.day22.result;

/**
 * ClassName: ResultEnum
 * Description:
 * date: 2021/11/22 16:04
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public enum ResultEnum {
    SUCCESS(200,"操作成功"),
    NO_USER(201,"没有该用户"),
    PWD_ERROR(202,"密码错误");

    private int code;
    private String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
