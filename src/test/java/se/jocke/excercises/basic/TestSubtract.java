package se.jocke.excercises.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSubtract {
    @Test
    public void testCalculate(){
        int res = Subtract.calculate(10, 2);
        Assertions.assertEquals(8, res);
    }

    @Test
    public void testNegativeMinusPositive(){
        int res = Subtract.calculate(-1, 1);
        Assertions.assertEquals(-2,res);
    }

    @Test
    public void testNegativeMinusNegative(){
        int res = Subtract.calculate(-1, -1);
        Assertions.assertEquals(0, res);
    }
}
