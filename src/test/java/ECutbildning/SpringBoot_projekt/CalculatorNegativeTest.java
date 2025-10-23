package ECutbildning.SpringBoot_projekt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorNegativeTest {
// All the tests in this class are expected to Fail
    @Test
    void negativeAdd(){
        //Arrange
        Calculator calc = new Calculator();

        //Act
        int result = calc.negativeAdd(8, 5);

        //Assert
        assertEquals(40, result);
    }

    @Test
    void negativeSubtract(){
        //Arrange
        Calculator calc = new Calculator ();

        //Act
        int result = calc.negativeSubtract(2,3);

        //Assert
        assertEquals(1, result);
    }

    @Test
    void negativeMultiply(){
        //Arrange
        Calculator calc = new Calculator ();

        //Act
        int result = calc.negativeMultiply(5,5);

        //Assert
        assertEquals(10, result);
    }

    @Test
    void negativeDivide(){
        //Arrange
        Calculator calc = new Calculator();

        //Act
        int result = calc.negativeDivide(80, 0);

        //Assert
        assertEquals(80, result);
    }
}