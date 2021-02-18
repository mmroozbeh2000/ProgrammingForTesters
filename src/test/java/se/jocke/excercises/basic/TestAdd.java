package se.jocke.excercises.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAdd {


    @Test
    public void testAddition() {
        int product = Add.calculate(10,2);
        Assertions.assertEquals(12, product);
    }
    @Test
    public void testAddNegativeToRegular(){
        int product = Add.calculate(-5, 5);
        Assertions.assertEquals(0, product);
    }
    @Test
    public void testAddRegularToNegative(){
        int product = Add.calculate(6, -8);
        Assertions.assertEquals(-2, product);
    }




}
