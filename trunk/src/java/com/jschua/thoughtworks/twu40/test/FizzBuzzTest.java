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

    @Test
    public void testFizzBuzz() throws Exception {
        String expected = "FizzBuzz";
        assertEquals(expected, new FizzBuzz().print(15));
    }

    @Test
    public void testFizzBuzz15() throws Exception {
        String expected = "1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz";
        assertEquals(expected, new FizzBuzz().output(15));
    }
}
