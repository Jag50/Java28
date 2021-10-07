package com.rithus.maths.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    /* Calculating squares numbers*/

    @Test
    public void testSquares(){

        //New instance of the class is created and stored into the "calculator" variable
        Calculator calculator = new Calculator();
        /*assertEquals method takes in the following parameters:
        (expected, actual) Expected is what we expect, actual is the variable passed into the test*/

        //SUT = System Under Test, calculator.square method is the SUT
        assertEquals(25,calculator.square(5));

    }

}
