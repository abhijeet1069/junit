package manning.learnJunit;

import manning.learnJunit.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(60,new Calculator().add(10,50),0);
    }
}