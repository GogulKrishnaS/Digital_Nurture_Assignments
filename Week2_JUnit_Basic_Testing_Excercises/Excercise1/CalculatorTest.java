import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "Addition should return correct sum");
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2), "Subtraction should return correct result");
    }
}
