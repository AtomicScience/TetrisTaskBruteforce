package com.company;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class FieldTest {
    @Test
    public void correctWidthAndLengthInit() {
        Field field = new Field(3, 4);

        Assert.assertEquals(4, field.getLength());
        Assert.assertEquals(3, field.getWidth());
    }

    @Test
    public void illegalWidthAndLengthInit() {
        Assert.assertThrows(IllegalArgumentException.class, () -> new Field(-1, 0));
    }
}