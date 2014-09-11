package com.jschua.thoughtworks.twu40;

/**
 * Created by chuajiesheng on 10/9/14.
 */
public class Triangle {
    public String printOneAsterisk() {
        return "*";
    }

    public String printHorizontalLine(int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

    public String printVerticalLine(int lines) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines; i++) {
            sb.append("*\n");
        }
        return sb.toString().trim();
    }

    public String printRightTriangle(int lines) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= lines; i++) {
            sb.append(printHorizontalLine(i) + "\n");
        }
        return sb.toString().trim();
    }
}
