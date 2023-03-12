package JUnit.ParameterizedTest_MethodSourse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;

public class TestClass {
    @ParameterizedTest
    @MethodSource("argsProviderFactory")
    void testWithMethodSource(String argument) {
        assertNotNull(argument);
    }

    static List<String> argsProviderFactory() {
        //return Stream.of("один", "два",  "три");
        return List.of("one","two");
    }
    @ParameterizedTest
    @MethodSource("argsProviderTest")
    void testWithMethod(String argument1) {
       assertAll("сложный запрос",
               ()->assertEquals("два",argument1),
               ()->assertEquals("два",argument1));
        assertTimeout(ofSeconds(2), () -> {
                    Thread.sleep(1000);
                }
        );
    }

    static Stream<String> argsProviderTest() {
        return Stream.of("один", "два");
    }
}
