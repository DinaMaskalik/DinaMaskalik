package task2;

public class CalculatorWithCounter {
    private ICalculator calculator;
    private int countOperation = 0;

    public CalculatorWithCounter(ICalculator calculator) {
        this.calculator = calculator;
    }

    public int getCountOperation() {
        return countOperation;
    }

    private int changeCountOperation() {
        return countOperation++;
    }

    public double getAddition(double firstNumber, double secondNumber) {
        changeCountOperation();
        return calculator.getAddition(firstNumber, secondNumber);
    }

    public double getSubtraction(double firstNumber, double secondNumber) {
        changeCountOperation();
        return calculator.getSubtraction(firstNumber, secondNumber);
    }

    public double getMultiplication(double firstNumber, double secondNumber) {
        changeCountOperation();
        return calculator.getMultiplication(firstNumber, secondNumber);
    }

    public double getDivision(double firstNumber, double secondNumber) {
        changeCountOperation();
        return calculator.getDivision(firstNumber, secondNumber);
    }

    public double getExponentiation(double number, double power) {
        changeCountOperation();
        return calculator.getExponentiation(number, power);
    }

    public double getModule(double number) {
        changeCountOperation();
        return calculator.getModule(number);
    }

    public double getSqrtOfNumber(double number, double power) {
        changeCountOperation();
        return getSqrtOfNumber(number, power);
    }
}
