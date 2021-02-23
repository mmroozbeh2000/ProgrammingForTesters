package se.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    public void addTesting() {
        Assertions.assertEquals(-2,Add.calculateaddition(6,-8));
    }

    @Test
    public void dividTesting(){
        Assertions.assertEquals(2.5,Divid.calculationofdivid(5,2));
    }

    @Test
    public void substractTesting() {
        Assertions.assertEquals(0,Subtract.calculateSubstract(-1,-1));
    }

    @Test
    public void multiplyTesting(){
        Assertions.assertEquals(0,Multiply.calaculationOfMultiply(0,5));
    }

}

