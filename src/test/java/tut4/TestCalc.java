package tut4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import tut4.Calc;


public class TestCalc
{

    @Test
    public void addTest() {
        int result = Calc.add(1,2);
        assertEquals(3, result);
    }
}