package ru.netology.sqr.SQRServeces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SqrtInRangeTest {

    @Test
    public void zeroRange(){
        SqrtInRange service = new SqrtInRange();

        int expected = 0;
        int actual = service.calkSqrt(0, 0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOutRange(){
        SqrtInRange service = new SqrtInRange();

        int expected = 0;
        int actual = service.calkSqrt(5, 8);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeRange(){
        SqrtInRange service = new SqrtInRange();

        int expected = 0;
        int actual = service.calkSqrt(-15, -6);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrEqualsRangeLimit() {
        SqrtInRange service = new SqrtInRange();

        int expected = 2;
        int actual = service.calkSqrt(100, 121);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void outsideRange() {
        SqrtInRange service = new SqrtInRange();

        int expected = -1;
        int actual = service.calkSqrt(2_600_000, 3_000_000);

        Assertions.assertEquals(expected, actual);
    }

}
