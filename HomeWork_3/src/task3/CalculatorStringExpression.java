package task3;

import task2.CalculatorWithMath;

public class CalculatorStringExpression {
    private StringBuilder fullExpression;
    private String sign = "*/+-)(";
    CalculatorWithMath calculator=new CalculatorWithMath();


    public CalculatorStringExpression(StringBuilder fullExpression) {
        this.fullExpression = fullExpression;
    }

    public void calculateExpression() {
        double a = 0;
        if (verifyString()) {

            while (fullExpression.toString().contains("P") || fullExpression.toString().contains("E")) {
                countPIAndE();
            }
            while (fullExpression.toString().contains("|")) {
                findAndCountModule();
            }
            while (fullExpression.toString().contains("(")) {
                findAndCountBrackets();
            }
            while (fullExpression.toString().contains("^")) {
                countDegree();
            }
            while (fullExpression.toString().contains("*")) {
                countMultiplication();
            }
            while (fullExpression.toString().contains("/")) {
                countDivision();
            }

            for (int i = 0; i < fullExpression.length() ; i++) {
                if(fullExpression.toString().charAt(i)=='-'){
                    countSubtraction();
                    i=0;
                }
                if(fullExpression.toString().charAt(i)=='+'){
                    countAdding();
                    i=0;
                }
            }


            System.out.println(fullExpression.toString());
        }
        return ;
    }

    private boolean verifyString() {
        int closingBracket = 0;
        int openingBracket = 0;
        int module=0;
        char[] str = fullExpression.toString().toCharArray();
        int length = str.length;

        for (int i = 0; i < length; i++) {

            if ((str[i] == '*' || str[i] == '/' || str[i] == '-' || str[i] == '^' || str[i] == '+' || str[i] == 'P' ) && i == length - 1) {
                return false;
            }

            if (str[i] == ')' || str[i] == '(' || str[i] == '*' || str[i] == '/' || str[i] == '-' || str[i] == '+' || (str[i] >= '0' && str[i] <= '9') || str[i] == '.' || str[i] == '^' || str[i] == 'E' || str[i] == 'P' || str[i] == 'I'|| str[i]=='|') {
                continue;
            }

            if (str[i] == 'P' && str[i + 1] == 'I') {
                continue;
            }

            return false;
        }

        for (int i = 0; i < length; i++) {
            if (str[i] == ')') {
                closingBracket++;
                continue;
            }
            if (str[i] == '(') {
                openingBracket++;
                continue;
            }
            if(str[i]=='|'){
                module++;
                continue;
            }
        }

        if (openingBracket != closingBracket || module%2==1) {
            return false;
        }

        for (int i = 0; i < length - 1; i++) {

            if ((str[i] == '*' || str[i] == '/' || str[i] == '-' || str[i] == '+' || str[i] == '^') && !((str[i + 1] >= '0' && str[i + 1] <= '9') || str[i + 1] == '(' || i == 0 || str[i + 1] == 'P' || str[i + 1] == 'E' || str[i+1]=='|')) {
                return false;
            }

            if (((str[i] == ')') && ((str[i + 1] >= '0' && str[i + 1] <= '9') || str[i + 1] == 'P' || str[i+1]=='E' || str[i+1]=='|')) || (str[i] == '(' && (str[i + 1] == '*' || str[i + 1] == '/' || str[i + 1] == '-' || str[i + 1] == '+'))) {
                return false;
            }

            if (((str[i] >= '0' && str[i] <= '9')|| str[i + 1] == 'P' || str[i+1]=='E' || str[i+1]=='|') && str[i + 1] == '(') {
                return false;
            }
        }
        return true;

    }

    private void findAndCountBrackets() {
        int firstBracket = fullExpression.indexOf("(");
        int secondBracket = fullExpression.lastIndexOf(")");
        String expression = fullExpression.substring(firstBracket + 1, secondBracket);
        fullExpression.replace(firstBracket, secondBracket + 1, operationWithSign(expression));
    }

    private void findAndCountModule() {
        int firstModule = fullExpression.indexOf("|");
        int secondModule = fullExpression.lastIndexOf("|");
        String expression = fullExpression.substring(firstModule + 1, secondModule);
        expression=operationWithSign(expression);
        double number=Double.parseDouble(expression);
        if(number>0){
            expression=String.valueOf(number);
        }else{
            number=calculator.getModule(number);
            expression=String.valueOf(number);
        }
        fullExpression.replace(firstModule, secondModule + 1, expression);
    }


    private void replaceString(int positionSign) {
        String firstPartExpression = fullExpression.substring(0, positionSign);
        String secondPartExpresion = fullExpression.substring(positionSign + 1, fullExpression.length() - 1 + 1);
        int n = 0;
        int a = 0;
        int b = 0;

        for (int i = firstPartExpression.length() - 1; i >= 0; i--) {
            n++;
            if (sign.contains(firstPartExpression.charAt(i) + "") || i == 0) {
                if (i == 0) {
                    a = i;
                } else {
                    a = i + 1;
                }
                n = 0;
                break;
            }
        }

        for (int i = 0; i < secondPartExpresion.length(); i++) {
            n++;
            if (sign.contains(secondPartExpresion.charAt(i) + "") || i == secondPartExpresion.length() - 1) {
                if (i == secondPartExpresion.length() - 1) {
                    b = fullExpression.length();
                } else {
                    b = firstPartExpression.length() + n;
                }
                break;
            }
        }

        String expression = fullExpression.substring(a, b);
        fullExpression.replace(a, b, operationWithSign(expression));
    }

    private void countDegree() {

        int degree = fullExpression.indexOf("^");
        replaceString(degree);
    }

    private void countPIAndE() {
        int a = 0;

        if (fullExpression.toString().contains("P")) {
            a = fullExpression.indexOf("P");
            fullExpression.replace(a, a + 2, "3.14");
            return;
        }

        if (fullExpression.toString().contains("E")) {
            a = fullExpression.indexOf("E");
            fullExpression.replace(a, a + 1, "2.71");
        }

    }

    private void countAdding() {
        int signPlus = fullExpression.indexOf("+");
        replaceString(signPlus);
    }

    private void countSubtraction() {
        int signMinus = fullExpression.indexOf("-");
        replaceString(signMinus);
    }

    private void countMultiplication() {
        int sign = fullExpression.indexOf("*");
        replaceString(sign);
    }

    private void countDivision() {
        int sign = fullExpression.indexOf("/");
        replaceString(sign);
    }

    private String operationWithSign(String expression) {
        double firstNumber;
        double secondNumber;
        //double result;
        if (expression.contains("^")) {
            firstNumber = Double.parseDouble(expression.substring(0, expression.indexOf("^")));
            secondNumber = Double.parseDouble(expression.substring(expression.indexOf("^") + 1, expression.length()));
            return String.valueOf(Math.pow(firstNumber, secondNumber));
        }
        if (expression.contains("*")) {
            firstNumber = Double.parseDouble(expression.substring(0, expression.indexOf("*")));
            secondNumber = Double.parseDouble(expression.substring(expression.indexOf("*") + 1, expression.length()));
            return String.valueOf(firstNumber * secondNumber);

        }
        if ((expression.contains("/"))) {
            firstNumber = Double.parseDouble(expression.substring(0, expression.indexOf("/")));
            secondNumber = Double.parseDouble(expression.substring(expression.indexOf("/") + 1, expression.length()));
            return String.valueOf(firstNumber / secondNumber);
        }
        if (expression.contains("+")) {
            firstNumber = Double.parseDouble(expression.substring(0, expression.indexOf("+")));
            secondNumber = Double.parseDouble(expression.substring(expression.indexOf("+") + 1, expression.length()));

            return String.valueOf(firstNumber + secondNumber);
        }
        if (expression.contains("-")) {
            firstNumber = Double.parseDouble(expression.substring(0, expression.indexOf("-")));
            secondNumber = Double.parseDouble(expression.substring(expression.indexOf("-") + 1, expression.length()));
            return String.valueOf(firstNumber - secondNumber);
        }
        return null;

    }
}
