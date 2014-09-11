package com.jschua.thoughtworks.twu40.test;

import com.jschua.thoughtworks.twu40.PrimeFactor;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by chuajiesheng on 12/9/14.
 */
public class PrimeFactorTest {
    @Test
    public void testPrimeFactorsOf6() throws Exception {
        String expected = "2,3";
        assertEquals(expected, new PrimeFactor().factor(6));
    }
}
