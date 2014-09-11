package com.jschua.thoughtworks.twu40;

/**
 * Created by chuajiesheng on 12/9/14.
 */
public class Diamond {

    public String printIsoTriangle(int lines) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= lines; i++) {
            sb.append(printSpace(lines - i) + printAsterisk(i + i - 1) + "\n");
        }
        System.out.println(sb.toString());
        return sb.toString().trim();
    }

    private String printAsterisk(int no) {
        StringBuilder sb = new StringBuilder();
        for (int i  = 0; i < no; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

    private String printSpace(int no) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < no; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
