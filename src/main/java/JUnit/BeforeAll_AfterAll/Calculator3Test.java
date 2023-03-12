package JUnit.BeforeAll_AfterAll;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Во-первых нужно перед классом добавить аннотацию
 * @TestInstance(TestInstance.Lifecycle.PER_CLASS)
 * Чтобы все работало
 */

/**
 * JUnit также позволяет добавить метод, который будет вызван
 * один раз перед всеми тестовыми методами. Такой метод нужно
 * пометить аннотацией @BeforeAll. Для нее так же существует парная
 * аннотация @AfterAll. Метод, помеченный ею, JUnit вызовет после всех тестовых методов.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Calculator3Test {
    Calculator3 calculator3;
    @BeforeEach
    public void createCalculator3(){
        calculator3 = new Calculator3();
    }
    @BeforeAll
    public void PrintStartTest(){
        System.out.println("PrintStartTest");
    }
    @AfterAll
    public void writeLog(){
        System.out.println("writeLog");
    }

    @Test
    public void add() {
        int result = calculator3.add(5, 5);
        assertEquals(10, result);
    }
}
