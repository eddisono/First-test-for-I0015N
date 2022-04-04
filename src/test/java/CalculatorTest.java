import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(5, Calculator.add(2,3));
    }

    @Test
    @DisplayName("Subtract two numbers")
    void subtract() {
        assertEquals(2, Calculator.subtract(3,1));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertEquals(10, Calculator.multiply(5, 2));
    }

    @Test
    @DisplayName("Divide two numbers")
    void divide() {
        assertEquals(10, Calculator.divide(100, 10));
    }
}