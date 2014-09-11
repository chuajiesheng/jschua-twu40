package com.jschua.thoughtworks.twu40;

/**
 * Created by chuajiesheng on 12/9/14.
 */
public class FizzBuzz {
    public String print(int n) {
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        return "";
    }
}
