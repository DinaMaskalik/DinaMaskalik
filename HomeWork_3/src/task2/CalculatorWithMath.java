package task2;

public class CalculatorWithMath implements ICalculator {
    @Override
    public double getAddition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double getSubtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double getMultiplication(double firstNumber, double secondNumber) {
        return firstNumber  *secondNumber;
    }

    @Override
    public double getDivision(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public double getExponentiation(double number, double power) {
        return Math.pow(number,power);
    }

    @Override
    public double getModule(double number) {
        return Math.abs(number);
    }

    @Override
    public double getSqrtOfNumber(double number, double power) {
        return Math.pow(number, 1/power);
    }
}
