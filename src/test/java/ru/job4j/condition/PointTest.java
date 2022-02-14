package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(2, 0);
        double out = pointOne.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20then1() {
        double expected = 1;
        Point pointOne = new Point(1, 0);
        Point pointTwo = new Point(2, 0);
        double out = pointOne.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to20then0() {
        double expected = 0;
        Point pointOne = new Point(2, 0);
        Point pointTwo = new Point(2, 0);
        double out = pointOne.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to20then1() {
        double expected = 1;
        Point pointOne = new Point(2, 1);
        Point pointTwo = new Point(2, 0);
        double out = pointOne.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21To20To23Then4Dot12() {
        double expected = 4.12;
        Point pointOne = new Point(2, 1);
        Point pointTwo = new Point(2, 0);
        Point pointThree = new Point(2, 3);
        double out = pointOne.distance3d(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }
}