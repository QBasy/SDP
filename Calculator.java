import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Calculator implements Strategy {

    // public pattern Singleton() {
    private static Calculator instance;

    private Calculator() {}

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }
    // }

    // This method gets an expression and outputs the anwer by using method evaluateExpression
    @Override
    public double writeAnswer(String expression) {
        try {
            double result = evaluateExpression(expression);
            return result;
        } catch (IllegalArgumentException error) {
            System.out.println("WRONG EXPRESSION!!!");
        }
        return 0;
    }

    // This method is evaluating whole expression and giving result to writeAnswer()
    private double evaluateExpression(String expression) {
        Stack<Double> digits = new Stack<>();
        Stack<Character> operators = new Stack<>();
        List<Character> validOperators = Arrays.asList('+','-','*','/');

        expression = expression.replaceAll("\\s+", "");

        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);

            if (Character.isDigit(current)) {
                StringBuilder operandBuilder = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    operandBuilder.append(expression.charAt(i));
                    i++;
                }
                i--;

                double digit = Double.parseDouble(operandBuilder.toString());
                digits.push(digit);
            } else if (validOperators.contains(current)) {
                while (!operators.isEmpty() && hasPrecedence(current, operators.peek())) {
                    double operand2 = digits.pop();
                    double operand1 = digits.pop();
                    char operator = operators.pop();
                    double result = applyOperator(operand1, operand2, operator);
                    digits.push(result);
                }
                operators.push(current);
            } else {
                throw new IllegalArgumentException("WRONG ARGUMENT!!!");
            }
        }

        while (!operators.isEmpty()) {
            double operand2 = digits.pop();
            double operand1 = digits.pop();
            char operator = operators.pop();
            double result = applyOperator(operand1, operand2, operator);
            digits.push(result);
        }

        if (digits.size() != 1 || !operators.isEmpty()) {
            throw new IllegalArgumentException("WRONG EXPRESSION!!!");
        }

        return digits.pop();
    }

    private boolean hasPrecedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return true;
        }
        return false;
    }

    private double applyOperator(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new IllegalArgumentException("INFINITY!!!");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("IM NOT A BblCUUMAT CALCULATOR!!! IM JUST SIMPLE CALCULATOR!!!\n TRY TO USE +,-,*,/ !!!");
        }
    }
}
