package pl.sda.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.junit.Calculator;

public class CalculatorTest {
    @Test
    public void shouldAddComputeNumbers() {
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
//        Assertions.assertEquals(68, result);
    }

    @Test
    public void shouldDevideComputeNumbers() {
        // given
        int a = 10;
        int b = 2;

        // when
        int result = Calculator.devide(a, b);

        // then
        Assertions.assertEquals(5, result);
//        Assertions.assertEquals(68, result);
    }

}
