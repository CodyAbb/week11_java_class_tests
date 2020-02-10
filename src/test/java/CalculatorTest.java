import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void add_10_plus_10(){
        assertEquals(20, Calculator.add(10, 10));
    }

    @Test
    public void subtract_10_from_90(){
        assertEquals(80, Calculator.subtract(90, 10));
    }

    @Test
    public void multiply_20_by_3_equals_60(){
        assertEquals(60, Calculator.multiply(20, 3));
    }

    @Test
    public void divide_20_by_4_equals_5(){
        assertEquals(5.00, Calculator.divide(20.00, 4.00), 0.01);
    }
}
