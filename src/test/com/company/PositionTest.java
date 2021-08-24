package com.company;

import junit.framework.TestCase;
import org.junit.Assert;

public class PositionTest extends TestCase {
    public void testCorrectInit() {
        Position position = new Position(3, 4);

        assertEquals(3, position.getX());
        assertEquals(4, position.getY());
    }

    public void testIncorrectInit() {
        Assert.assertThrows(IllegalArgumentException.class, () -> new Position(-1, 0));
        Assert.assertThrows()
    }
}