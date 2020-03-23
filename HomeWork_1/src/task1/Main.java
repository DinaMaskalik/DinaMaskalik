package task1;

public class Main {
    public static void main(String[] args) {
        CalculatorWithOperator calculator= new CalculatorWithOperator();
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result=calculator.getAddition(4.1, calculator.getAddition(calculator.getMultiplication(15,7),calculator.getExponentiation(calculator.getDivision(28,5),2)));
        System.out.println(result);

    }

}
