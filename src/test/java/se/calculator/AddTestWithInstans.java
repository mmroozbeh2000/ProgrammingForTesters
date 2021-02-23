package se.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTestWithInstans {
    private Add calculator = new Add();
    @Test
    public void addTesting() {
        int sumof = calculator.calculateaddition(6,-8);
        Assertions.assertEquals(-2,sumof);
    }

    private Divid calculate = new Divid();
    @Test
    public void dividTesting(){
        double sumof = calculate.calculationofdivid(5,2);
        Assertions.assertEquals(2.5,sumof);
    }

    private Subtract calculater = new Subtract();
    @Test
    public void substractTesting() {
        int sumof = calculater.calculateSubstract(-1,-1);
        Assertions.assertEquals(0,sumof);
    }

    private Multiply calculation = new Multiply();
    @Test
    public void multiplyTesting(){
        int sumof= calculation.calaculationOfMultiply(0,5);
        Assertions.assertEquals(0,sumof);
    }

}

