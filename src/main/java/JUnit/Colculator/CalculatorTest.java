package JUnit.Colculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {
    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(4, 5);
        assertEquals(9, result);
    }

    @Test
    public void sub() {
        int sub = new Calculator().sub(5, 5);
        assertEquals(1, sub);
    }

    @Test
    public void mul() {
        int mul = new Calculator().mul(3, 3);
        assertEquals(5, mul);
    }

    @Test
    public void div() {
        int div = new Calculator().div(6, 3);
        assertEquals(3,div);
    }
}
