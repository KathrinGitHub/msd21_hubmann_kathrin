package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator c;
    double result;

    @BeforeEach
    public void setUp() {
        c = new Calculator();
    }

    @Test
    void add() {
        Assertions.assertEquals(13, c.add(5,8));
    }

    @Test
    void add2() {
        Assertions.assertEquals(13, result = 5 + 8);
    }

    @Test
    void minus() {
        Assertions.assertEquals(3, c.minus(5,8));
    }

    @Test
    void minus2() {
        Assertions.assertEquals(3, result = 8 - 5);
    }

    @Test
    void multiply() {
        Assertions.assertEquals(40, c.multiply(5,8));
    }

    @Test
    void multiply2() {
        Assertions.assertEquals(40, result = 5 * 8);
    }

    @Test
    void divide() {
        Assertions.assertEquals(1.6, c.divide(5,8));
    }

    @Test
    void divide2() {
        Assertions.assertEquals(1.6, result = 8.0 / 5.0);
    }

    @Test
    void faculty() {
        Assertions.assertEquals(120, c.faculty(5));
    }

    @Test
    void faculty2() {
        Assertions.assertEquals(0, c.faculty(-5));
    }

    @Test
    void faculty3() {
        Assertions.assertEquals(24, c.faculty(4));
    }
}