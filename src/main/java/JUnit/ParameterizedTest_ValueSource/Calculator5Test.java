package JUnit.ParameterizedTest_ValueSource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Calculator5Test extends Calculator5 {
@ParameterizedTest
@ValueSource(ints = {1,2,3,4,5,6})
    void testAdd(int arg) {
    Calculator5 calculator5 = new Calculator5();
    int add = calculator5.add(arg, arg);
    assertEquals(6,add);
}
    @Test
    void testSub() {
    }
}