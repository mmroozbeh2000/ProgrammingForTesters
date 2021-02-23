package se.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.jocke.basic.Calculator;

public class TestCalculatorMultiplications {
    private Calculator calculator = new Calculator();

    @Test
    public void testMultiplication() {
        int product = calculator.multiply(4,2);
        Assertions.assertEquals(8,product);
    }
    @Test
    public void testNegativeMultiplication() {
        int product = calculator.multiply(4,-2);
        Assertions.assertEquals(-8,product);
    }
    @Test
    public void testDoubleNegativeMultiplication() {
        int product = calculator.multiply(-4,-2);
        Assertions.assertEquals(8,product);
    }
}
