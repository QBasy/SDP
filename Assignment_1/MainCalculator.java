package Assignment_1;

public class MainCalculator {
    private static MainCalculator instance;
    private Strategy strategy;

    private MainCalculator() {}

    public static MainCalculator getInstance() {
        if (instance == null) {
            instance = new MainCalculator();
        }
        return instance;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void solveExpression(String expression) {
        System.out.println(expression + " = " + strategy.writeAnswer(expression));
    }
}
