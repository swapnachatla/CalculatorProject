package repl01;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {


    @Test
    public void testAdd() {

        assertEquals(10, Calculator.add(9, 1));

    }

    @Test
    public void testSubtract() {

        assertEquals(10, Calculator.subtract(11, 1));

    }

}
