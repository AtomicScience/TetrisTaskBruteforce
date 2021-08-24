package com.company;

import junit.framework.TestCase;
import org.junit.Test;

public class FigureTest {
    @Test
    public void correctCanvasInit() {
        boolean[][] canvas = {
                {false, true, false},
                {false, true, false},
                {true,  true, true }
        };
        Figure figure = new Figure(canvas);
    }
}