package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.junit.Calculator;

public class CalculatorTest {
    @Test
    public void shouldComputeNumbers() {
        // given
        int a = 3;
        int b = 7;

        // when
        int result = Calculator.add(a, b);

        // then
        Assertions.assertEquals(10, result);
    }

    @Test
    public void shouldMinusComputeNumbers() {
        // given
        int a = 10;
        int b = 7;

        // when
        int result = Calculator.minus(a, b);

        // then
        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldMultiplyComputeNumbers() {
        // given
        int a = 10;
        int b = 7;

        // when
        int result = Calculator.multiply(a, b);

        // then
        Assertions.assertEquals(70, result);
    }

}
