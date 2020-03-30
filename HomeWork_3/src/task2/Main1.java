package task2;

public class Main1 {

    public static void main(String[] args) {

        CalculatorWithCounter calculator1 = new CalculatorWithCounter(new CalculatorWithOperator());

        System.out.println(calculator1.getAddition(4.1, calculator1.getAddition(calculator1.getMultiplication(15, 7), calculator1.getExponentiation(calculator1.getDivision(28, 5), 2))));
        System.out.println(calculator1.getCountOperation());

        CalculatorWithCounter calculator2 = new CalculatorWithCounter(new CalculatorWithMath());

        System.out.println(calculator2.getAddition(4.1, calculator2.getAddition(calculator2.getMultiplication(15, 7), calculator2.getExponentiation(calculator2.getDivision(28, 5), 2))));
        System.out.println(calculator2.getCountOperation());
    }
}
