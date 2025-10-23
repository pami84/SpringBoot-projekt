package ECutbildning.SpringBoot_projekt;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
// The tests in this class are Positive and are expected to Pass
    @Test
    void add() {
        //Arrange
        Calculator calc = new Calculator();

        //Act
        int result = calc.add(1,3);

        //Assert
        assertEquals(4, result);
    }

    @Test
    void subtract(){
        //Arrange
        Calculator calc = new Calculator ();

        //Act
        int result = calc.subtract(3,2);

        //Assert
        assertEquals(1, result);
    }

    @Test
    void multiply(){
        //Arrange
        Calculator calc = new Calculator ();

        //Act
        int result = calc.multiply(5,5);

        //Assert
        assertEquals(25, result);
    }


    @Test
    void divide(){
        //Arrange
        Calculator calc = new Calculator();

        //Act
        int result = calc.divide(80, 1);

        //Assert
        assertEquals(80, result);
    }

    @Test
        //Using the variable Double in this case
    void divideWithDecimals(){
        //Arrange
        Calculator calc = new Calculator();

        //Act
        double result = calc.divideWithDecimals(2.5, 1.1);

        //Assert
        assertEquals(2.2727272727272725, result);
    }

}