package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2To3Then3() {
        int left = 2;
        int right = 2;
        int third = 3;
        int result = Max.max(left, right, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2To3To5Then5() {
        int left = 2;
        int right = 2;
        int third = 3;
        int four = 5;
        int result = Max.max(left, right, third, four);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}