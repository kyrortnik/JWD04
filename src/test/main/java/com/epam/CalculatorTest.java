package main.java.com.epam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {
    Calculator calculator = new Calculator();
    int x, y;
    int expected;

    @Test
    void getSum() {
        x = 5;
        y = 6;
        expected = 11;
        Assertions.assertEquals(expected,calculator.getSum(x,y));
    }

    @Test
    void getDiff() {
        x = 7;
        y = 2;
        expected = 5;
        Assertions.assertEquals(expected,calculator.getDiff(x,y));

    }

    @Test
    void getProduct() {
        x = 6;
        y = 5;
        expected = 30;
        Assertions.assertEquals(expected,calculator.getProduct(x,y));
    }

    @Test
    void getQuotient() {
        x = 60;
        y = 6;
        expected = 10;
        Assertions.assertEquals(expected,calculator.getQuotient(x,y));
    }

    @Test
    void getPower(){
        x = 8;
        y = 2;
        expected = 64;
        Assertions.assertEquals(expected,calculator.getPower(x,y));
    }

    @Test
    void getSquareRoot(){
        x = 16;
        expected = 4;
        Assertions.assertEquals(expected,calculator.getSquareRoot(x));
    }


}