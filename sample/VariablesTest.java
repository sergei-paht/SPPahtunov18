package sample;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariablesTest {

    @Test
    void multiply() {
        //arrange
        int first = 4;
        int second = 5;
        Variables variables = new Variables(first, second);
        int result = variables.multiply(first, second);
        assertEquals(20, result);
    }
}