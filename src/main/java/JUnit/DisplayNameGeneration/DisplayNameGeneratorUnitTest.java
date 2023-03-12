package JUnit.DisplayNameGeneration;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGeneratorUnitTest.ReplaceCamelCase.class)
class DisplayNameGeneratorUnitTest {

    @Test
    void camelCaseName() {
    }

    static class ReplaceCamelCase extends DisplayNameGenerator.Standard {
        @Override
        public String generateDisplayNameForClass(Class testClass) {
            return super.generateDisplayNameForClass(testClass).toUpperCase();
        }
    }
}
