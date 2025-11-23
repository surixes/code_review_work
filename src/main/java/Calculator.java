public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        // Решение уравнения: 2x^2 + 3x - 5 для x=3
        int x = 3;
        int xSquared = times(x, x); // x² = 9
        int term1 = times(2, xSquared); // 2x² = 18
        int term2 = times(3, x); // 3x = 9
        int positiveTerms = add(term1, term2); // 18 + 9 = 27
        int result = dif(positiveTerms, 5); // 27 - 5 = 22

        return result;
    }
}