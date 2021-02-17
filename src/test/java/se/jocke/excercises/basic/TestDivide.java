package se.jocke.excersises.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testDivide {
    @Test
    public void testDivision () {
        double res = Divide.calculate(10,2);
        Assertions.assertEquals(5, res);
    }

    @Test
    public void testDivisionDouble() {
        double res2 = Divide.calculate(5, 2);
        Assertions.assertEquals(2.5, res2 );
    }

}
