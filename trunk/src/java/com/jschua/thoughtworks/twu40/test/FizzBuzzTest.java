package com.jschua.thoughtworks.twu40.test;

import com.jschua.thoughtworks.twu40.FizzBuzz;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by chuajiesheng on 12/9/14.
 */
public class FizzBuzzTest {
    @Test
    public void testFizz() throws Exception {
        String expected = "Fizz";
        assertEquals(expected, new FizzBuzz().print(3));
    }

    @Test
    public void testBuzz() throws Exception {
        String expected = "Buzz";
        assertEquals(expected, new FizzBuzz().print(5));
    }
}
