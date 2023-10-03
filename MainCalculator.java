public class MainCalculator {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void solveExpression(String expression) {
        System.out.println(strategy.writeAnswer(expression));
    }
}
