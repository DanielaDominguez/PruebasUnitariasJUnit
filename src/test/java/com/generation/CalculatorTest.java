package com.generation;
import org.junit.jupiter.api.Test;
//Alt + enter genera esto:
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    //creacion de objeto de al clase calculator
    Calculator calculator = new Calculator();

    //@test se conoce como anotacion para hacer prueba y si lo borro es un metodo cualquiera
    @Test
    public void addTest()
    {
        assertEquals( 8, calculator.addNumbers( 5, 3 ) );
    }


    @Test
    public void subtractTest()
    {
        assertEquals( 5, calculator.subtractNumbers( 10, 5 ) );
    }


    @Test
    public void multiplyTest()
    {
        assertEquals( 15, calculator.multiplyNumbers( 5, 3 ) );
    }


    @Test
    public void divideTest()
    {
        assertEquals( 5, calculator.divideNumbers( 15, 3 ) );
    }
}
