package ECutbildning.SpringBoot_projekt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorNegativeTest {
// All the tests in this class are expected to Fail
    @Test
    void negativeAdd(){
        Calculator calc = new Calculator();
        int result = calc.negativeAdd(8, 5);

        assertEquals(40, result);
    }

    @Test
    void negativeSubtract(){
        Calculator calc = new Calculator ();
        int result = calc.negativeSubtract(2,3);

        assertEquals(1, result);
    }

    @Test
    void negativeMultiply(){
        Calculator calc = new Calculator ();
        int result = calc.negativeMultiply(5,5);

        assertEquals(10, result);
    }

    @Test
    void negativeDivide(){
        Calculator calc = new Calculator();
        int result = calc.negativeDivide(80, 0);

        assertEquals(80, result);
    }
}