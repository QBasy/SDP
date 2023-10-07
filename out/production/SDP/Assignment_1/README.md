# Assignment 1 for Software Design Patterns

## Singleton pattern:

```java
    private static Calculator instance;

    private Calculator() {}

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }
```

## Strategy pattern:
```java
public interface Strategy {
    double writeAnswer(String expression);
}
```

```java
import Assignment_1.Strategy;

public class MainCalculator {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void solveExpression(String expression) {
        System.out.println(strategy.writeAnswer(expression));
    }
}
```
