package com.jschua.thoughtworks.twu40.test;

import com.jschua.thoughtworks.twu40.Triangle;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by chuajiesheng on 10/9/14.
 */
public class TriangleTest {

    @Test
    public void testPrintOneAsterisk() throws Exception {
        String expected = "*";
        assertEquals(expected, new Triangle().printOneAsterisk());
    }

    @Test
    public void testPrintHorizontalLine() throws Exception {
        String expected = "********";
        assertEquals(expected, new Triangle().printHorizontalLine(8));
    }

    @Test
    public void testPrintVerticalLine() throws Exception {
        String expected = "*\n*\n*\n*";
        assertEquals(expected, new Triangle().printVerticalLine(4));
    }

    @Test
    public void testPrintRightTriangle() throws Exception {
        String expected = "*\n**\n***";
        assertEquals(expected, new Triangle().printRightTriangle(3));
    }
}
