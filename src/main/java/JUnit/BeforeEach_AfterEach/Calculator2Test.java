package JUnit.BeforeEach_AfterEach;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Чтобы каждый раз в тестовом методе не писать создание объекта Calculator,
 * его можно вынести в отдельный метод и поставить ему специальную аннотацию @BeforeEach.
 * Тогда Junit будет вызывать этот метод перед каждым тестовым методом.
 */

/**
 * Также можно создать специальный метод, который будет вызываться каждый раз
 * после очередного тестового метода, и подчищать использованные ресурсы,
 * писать что-то в лог и т. п. Такой метод нужно пометить аннотацией @AfterEach.
 * BeforeEach-метод
 * test1()
 * AfterEach-метод
 * BeforeEach-метод
 * test2()
 * AfterEach-метод
 * BeforeEach-метод
 * test3()
 * AfterEach-метод
 */
@DisplayNameGeneration(Calculator2Test.DisplayNameGeneratorTest.class)
public class Calculator2Test {
    public Calculator2 calculator;
static class DisplayNameGeneratorTest extends DisplayNameGenerator.Standard{
    @Override
    public String generateDisplayNameForClass(Class testClass) {
        return super.generateDisplayNameForClass(testClass).toLowerCase();
    }
}

    @BeforeEach
    public void createCalculatorObject() {
        calculator = new Calculator2();
    }

    @Test
    public void add() {
        int result = calculator.add(5, 5);
        assertEquals(10, result);
    }
}
