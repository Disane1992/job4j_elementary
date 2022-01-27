package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int fact = 5;
        int exp = 120;
        Assert.assertEquals(exp, Factorial.calc(fact));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int fact = 0;
        int exp = 1;
        Assert.assertEquals(exp, Factorial.calc(fact));
    }
}