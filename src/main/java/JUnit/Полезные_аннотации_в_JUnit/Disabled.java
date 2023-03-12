package JUnit.Полезные_аннотации_в_JUnit;

import JUnit.Colculator.Calculator;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Disabled
 * Первая аннотация позволяет выключить определенный тест, чтобы JUnit его не вызывал.
 * Она нужна в случаях, если ты заметишь, что тест работает неверно, или поменяешь код и тест случайно поломается.
 */
public class Disabled {
    @org.junit.jupiter.api.Disabled("Тест временно отключен. Правда, правда")
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
