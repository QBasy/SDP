package Assignment_1;

public class SimpleCalculator implements Strategy {

    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1*num2;
    }

    public double divide(double num1, double num2) {
        return num1/num2;
    }
    @Override
    public double writeAnswer(String expression) {
        char operator = expression.charAt(1);
        double num1 = Double.valueOf(expression.charAt(0));
        double num2 = Double.valueOf(expression.charAt(0));
        switch (operator) {
            case '+':
                return sum(num1,num2);
            case '-':
                return subtract(num1,num2);
            case '*':
                return multiply(num1,num2);
            case '/':
                return divide(num1,num2);
            default:
                System.out.println("HOUSTON WE GOT SOME PROBLEMS!!!");
                return Double.MAX_VALUE;
        }
    }
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        System.out.println(calculator.writeAnswer("5+3"));
    }
}
