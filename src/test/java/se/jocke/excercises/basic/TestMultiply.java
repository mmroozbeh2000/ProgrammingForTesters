package se.jocke.excersises.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testMultiply {
    @Test
    public void testMultiply() {
        int res = Multiply.multiply(10,2);
        Assertions.assertEquals(20, res);
    }

    @Test
    public void testNegative() {
        int res = Multiply.multiply(-1, 5);
        Assertions.assertEquals(-5, res);
    }

    @Test
    public void testMultiplyByNull() {
        int res = Multiply.multiply(0, 5);
        Assertions.assertEquals(0, res);
    }
}
