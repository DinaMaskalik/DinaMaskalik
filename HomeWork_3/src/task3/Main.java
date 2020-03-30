package task3;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder=new StringBuilder();//4.1+15*7+(28/5)^2
        CalculatorStringExpression calculator = new CalculatorStringExpression(builder.append("(45+2)^E+PI/|7-8|+89"));
        //boolean a=calculator.verifyString("(3+5)+45*89/(12+45)^452");
        //System.out.println(a);
        calculator.calculateExpression();
    }
}
