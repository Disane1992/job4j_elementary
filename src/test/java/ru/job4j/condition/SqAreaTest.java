package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K0Square0() {
        int expected = 0;
        int p = 10;
        double k = 0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K0dot5Square2() {
        int expected = 2;
        int p = 6;
        double k = 0.5;
        double out = SqArea.square(p, k);
        System.out.println(out);
        Assert.assertEquals(expected, out, 0.01);
    }

}