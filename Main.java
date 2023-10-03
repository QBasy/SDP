public class Main {
    public static void main(String[] args) {
        MainCalculator calculator = MainCalculator.getInstance();
        calculator.setStrategy(new Calculator());

        calculator.solveExpression("25+2+4+5+2*2/12");
    }
}
