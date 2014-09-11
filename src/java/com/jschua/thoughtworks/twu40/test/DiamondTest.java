package com.jschua.thoughtworks.twu40.test;

import com.jschua.thoughtworks.twu40.Diamond;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by chuajiesheng on 12/9/14.
 */
public class DiamondTest {
    @Test
    public void testPrintIsoTriangle() throws Exception {
        String expected = "   *\n  ***\n *****\n*******";
        assertEquals(expected, new Diamond().printIsoTriangle(4));
    }

    @Test
    public void testPrintDiamond() throws Exception {
        String expected = "  *\n ***\n*****\n ***\n  *\n";
        assertEquals(expected, new Diamond().printDiamond(3));
    }
}
