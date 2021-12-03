package calculator.calculator;

import java.util.*;

/**
 * ClassName: Task05
 * Description:
 * date: 2021/11/4 14:44
 * @author: Lilin
 * @since JDK 1.8
 */
public class CalculatorPlus {
    public ArrayList<String> equationList;
    public final List <String> operators= new ArrayList<>(Arrays.asList("+","-","*","/","(",")"));
    private final Stack<String> stackNumber = new Stack<>();
    private final Stack<String> stackOperator = new Stack<>();
    private final HashMap<String,HashMap<String,Boolean>> operatorPriority;
    public CalculatorPlus(String equation) {

        equationList = parseToArrayList(equation);
        operatorPriority = setOperatorPriority();
        System.out.println(operatorPriority.entrySet());
        double result = getResult(equationList);
        System.out.println(result);
    }

    /**
     * setOperatorPriority
     * @desctiptopn


     * @version 0.1.0
     * @return java.util.HashMap<java.lang.String,java.util.HashMap<java.lang.String,java.lang.Boolean>>
     * @author Lilin
     * @since 0.1.0
     */
    public HashMap<String,HashMap<String,Boolean>> setOperatorPriority(){
        HashMap<String,HashMap<String,Boolean>> operatorPriority;
        HashMap<String,Boolean> map1= new HashMap<String,Boolean>(4){
            {
                put("(", Boolean.TRUE);
                put("+", Boolean.FALSE);
                put("-", Boolean.FALSE);
                put("*", Boolean.FALSE);
                put("/", Boolean.FALSE);
            }
        };HashMap<String,Boolean> map2= new HashMap<String,Boolean>(4){
            {
                put("(", Boolean.TRUE);
                put("+", Boolean.TRUE);
                put("-", Boolean.TRUE);
                put("*", Boolean.FALSE);
                put("/", Boolean.FALSE);
            }
        };
        operatorPriority = new HashMap<String,HashMap<String,Boolean>>(4) {
            {
                put("+", map1);
                put("-", map1);
                put("*", map2);
                put("/", map2);
            }
        };
        return operatorPriority;
    }

    /**
     * parseToArrayList
     *
     * @param equation 1
     * @version 0.1.0
     * @return java.util.ArrayList<java.lang.String>
     * @author Lilin
     * @since 0.1.0
     */
    public ArrayList<String> parseToArrayList(String equation){
        ArrayList<String> equationList= new ArrayList<>();
        for(int i=0;i<equation.length();){

            String str = String.valueOf(equation.charAt(i));
            if(operators.contains(str)){
                equationList.add(str);
                i++;
            }
            else{
                StringBuilder numString = new StringBuilder();
                boolean flag=true;

                while (flag){
                    if(i==equation.length()){
                        equationList.add(numString.toString());
                        break;
                    }
                    String s = String.valueOf(equation.charAt(i));
                    if(this.operators.contains(s)) {
                        flag =false;
                        equationList.add(numString.toString());
                        equationList.add(s);
                    }else {
                        numString.append(s);
                    }
                    i++;
                }
            }
        }
        return equationList;
    }
    /**
     * getResult
     * @description:
     *
     *
     *
     * @params [java.util.ArrayList<java.lang.String>]
     * @return double
     * @author Lilin
     * @date 2021/11/12 14:23
     */
    public double getResult(ArrayList<String> equationList){

        while (!equationList.isEmpty()||!this.stackOperator.isEmpty()){
            if(!equationList.isEmpty()) {
                String str = equationList.get(0);
                System.out.println("当前检索的字符是" + str);

                if(this.operators.contains(str)){

                    if(this.stackOperator.isEmpty()){
                        this.stackOperator.push(str);
                        equationList.remove(0);
                    }
                    else if("(".equals(str)){
                        this.stackOperator.push(str);
                        equationList.remove(0);
                    }
                    else if(")".equals(str)){
                        equationList.remove(0);
                        while (true){
                            String s = calculateNumbers(stackNumber.pop(),stackNumber.pop(),stackOperator.pop());
                            System.out.println(this.stackOperator);
                            this.stackNumber.push(s);
                            if("(".equals(this.stackOperator.peek())){
                                this.stackOperator.pop();
                                break;
                            }
                        }
                    }
    //                "1+2*(3+4)-(5+6)/7"
                    else if(this.operatorPriority.get(equationList.get(0)).get(this.stackOperator.peek())){
                        this.stackOperator.push(equationList.get(0));
                        equationList.remove(0);
                    }
                    else {
                        String s = calculateNumbers(stackNumber.pop(),stackNumber.pop(),stackOperator.pop());
                        this.stackNumber.push(s);
                    }
                }
                else {
                    this.stackNumber.push(str);
                    equationList.remove(0);
                }
            }
            else {
                String s = calculateNumbers(stackNumber.pop(),stackNumber.pop(),stackOperator.pop());
                this.stackNumber.push(s);
            }
        System.out.println("操作数:"+ this.stackNumber);
        System.out.println("操作符:"+ this.stackOperator);

        }
        return Double.parseDouble(this.stackNumber.pop());
    }
    /**
     * calculateNumbers
     *
     * @param numberA:
     * @param numberB:
     * @param operators:
     * @version 0.1.0
     * @return java.lang.String
     * @author Lilin
     * @since 0.1.0
     */
    public String  calculateNumbers(String numberA,String numberB,String operators){
        if(operators==null){
            operators = "+";
        }
        switch (operators){
            case "+":
                return ""+(Double.parseDouble(numberB)+Double.parseDouble(numberA));
            case "-":
                return ""+(Double.parseDouble(numberB)-Double.parseDouble(numberA));
            case "*":
                return ""+(Double.parseDouble(numberB)*Double.parseDouble(numberA));
            case "/":
                return ""+(Double.parseDouble(numberB)/Double.parseDouble(numberA));
            default: return null;
        }
    }
    public static void main(String[] args) {

        String str="(13*(8+22)*((23+4)-(5+6))/11)";
        CalculatorPlus calculatorPlus = new CalculatorPlus(str);
        System.out.println(calculatorPlus.equationList.toString());
        System.out.println(str);
        // Chinese 中文

    }
}

