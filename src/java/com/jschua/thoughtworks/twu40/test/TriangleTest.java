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
}
