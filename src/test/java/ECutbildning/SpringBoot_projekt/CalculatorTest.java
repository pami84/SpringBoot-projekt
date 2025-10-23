package ECutbildning.SpringBoot_projekt;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
// The tests in this class are Positive and are expected to Pass
    @Test
    void add() {
        Calculator calc = new Calculator();

        int result = calc.add(1,3);

        assertEquals(4, result);
    }

    @Test
    void subtract(){
        Calculator calc = new Calculator ();
        int result = calc.subtract(3,2);

        assertEquals(1, result);
    }

    @Test
    void multiply(){
        Calculator calc = new Calculator ();
        int result = calc.multiply(5,5);

        assertEquals(25, result);
    }


    @Test
    void divide(){
        Calculator calc = new Calculator();
        int result = calc.divide(80, 1);

        assertEquals(80, result);
    }

    @Test
        //Using the variable Double in this case
    void divideWithDecimals(){
        Calculator calc = new Calculator();
        double result = calc.divideWithDecimals(2.5, 1.1);

        assertEquals(2.2727272727272725, result);
    }

}