import java.util.ArrayList;

public class Calculator implements Strategy {
    private static Calculator instance;

    private ArrayList<Double> previous;

    private int prevCount = 0;

    private Calculator() {}

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    @Override
    public void solve(String expression) {
        double result = 0;
        System.out.println(expression + " = " + result);
    }
}
