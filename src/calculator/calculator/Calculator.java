package calculator.calculator;
import java.util.*;

/**
 * @author 14467
 */
public class Calculator {
    private Stack<String> stackNumber = new Stack<String>();
    private Stack<String> stackOperator = new Stack<String>();
    private final Map<String,HashMap<String,Boolean>> operatorPriority2;
    private final String equation;
    public final List <String> operators= new ArrayList<String>(Arrays.asList("+","-","*","/"));
    public Calculator(String equation) {
        this.equation = equation;
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList(this.equation.split("[- + * /]")));
        ArrayList <String>operators = new ArrayList<String>();
        for(int i=0;i<this.equation.length();i++){
            String s = String.valueOf(this.equation.charAt(i));
            if(this.operators.contains(s)){
                operators.add(s);
            }
        }
        System.out.println(numbers.toString());
        System.out.println(operators.toString());
        HashMap<String,Boolean> map1= new HashMap<String,Boolean>(){
            {
                put("+", Boolean.FALSE);
                put("-", Boolean.FALSE);
                put("*", Boolean.FALSE);
                put("/", Boolean.FALSE);

            }
        };HashMap<String,Boolean> map2= new HashMap<String,Boolean>(){
            {
                put("+", Boolean.TRUE);
                put("-", Boolean.TRUE);
                put("*", Boolean.FALSE);
                put("/", Boolean.FALSE);

            }
        };
        operatorPriority2 = new HashMap<String,HashMap<String,Boolean>>(){
            {
                put("+",map1);
                put("-",map1);
                put("*",map2);
                put("/",map2);
            }
        };
        System.out.println(this.operatorPriority2.toString());

        try{
            stackNumber.push(numbers.get(0));
            System.out.println("操作数入栈");
            numbers.remove(0);

            while(operators.size()!=0||!stackOperator.isEmpty()){
                System.out.println("n:"+numbers.toString());
                System.out.println("o:"+operators.toString());
                if(operators.size()>0&&(stackOperator.isEmpty()||this.operatorPriority2.get(operators.get(0)).get(this.stackOperator.peek()))){
                    stackNumber.push(numbers.get(0));
                    System.out.println("操作数入栈");
                    numbers.remove(0);
                    stackOperator.push(operators.get(0));
                    operators.remove(0);
                    System.out.println("操作符入栈");
                }
                else{
                    System.out.println("运算");
                    System.out.println(stackNumber.toString());
                    String s = calculate(stackNumber.pop(),stackNumber.pop(),stackOperator.pop())+"";
                    System.out.println("计算的结果是"+s);
                    stackNumber.push(s);
                    System.out.println("运算后的操作数入栈");
                }

                System.out.println("stackNumber:"+this.stackNumber.toString());
                System.out.println("stackOperator"+this.stackOperator.toString());
                System.out.println("-------------------------");
            }
        System.out.println("计算结果是"+stackNumber.pop());
        }catch (EmptyStackException | ArrayIndexOutOfBoundsException e){
            System.out.println("error"+e);
        }
    }
    public double  calculate(String a,String b,String o){
        switch (o){
            case "+":
                return Double.parseDouble(b)+Double.parseDouble(a);
            case "-":
                return Double.parseDouble(b)-Double.parseDouble(a);
            case "*":
                return Double.parseDouble(b)*Double.parseDouble(a);
            case "/":
                return Double.parseDouble(b)/Double.parseDouble(a);
            default: return 0;
        }
    }
    public static void main(String[] args) {

        Calculator calculator = new Calculator("1*2+3*4-10/10+20");

    }

}


