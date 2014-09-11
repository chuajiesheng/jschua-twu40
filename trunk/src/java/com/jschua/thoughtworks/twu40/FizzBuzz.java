package com.jschua.thoughtworks.twu40;

/**
 * Created by chuajiesheng on 12/9/14.
 */
public class FizzBuzz {
    public String print(int n) {
        String result = printFizz(n) + printBuzz(n);
        if (result.length() == 0) {
            return "" + n;
        } else {
            return result;
        }
    }

    private String printFizz(int n) {
        if (n % 3 == 0) {
            return "Fizz";
        }
        return "";
    }

    private String printBuzz(int n) {
        if (n % 5 == 0) {
            return "Buzz";
        }
        return "";
    }
}
