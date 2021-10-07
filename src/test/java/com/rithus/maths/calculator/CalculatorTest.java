package com.rithus.maths.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    /* Calculating squares numbers*/

    @Test
    public void testSquares(){

        //New instance of the class is created and stored into the "calculator" variable
        Calculator calculator = new Calculator();
        assertEquals(calculator.square(5), 25);

    }

}
