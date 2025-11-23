import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void add() {
        assertEquals(10, calculator.add(4, 6));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(-8, calculator.add(-3, -5));
    }

    @Test
    public void dif() {
        assertEquals(2, calculator.dif(7, 5));
        assertEquals(-2, calculator.dif(5, 7));
        assertEquals(0, calculator.dif(10, 10));
    }

    @Test
    public void times() {
        assertEquals(20, calculator.times(4, 5));
        assertEquals(0, calculator.times(0, 5));
        assertEquals(-15, calculator.times(3, -5));
    }

    @Test
    public void div() {
        assertEquals(3, calculator.div(9, 3));
        assertEquals(2, calculator.div(10, 5));
        assertEquals(-4, calculator.div(12, -3));
    }

    @Test
    public void solver() {
        // Проверяем: 2*(3)^2 + 3*3 - 5 = 2*9 + 9 - 5 = 18 + 9 - 5 = 22
        assertEquals(22, calculator.solver2());
    }

}