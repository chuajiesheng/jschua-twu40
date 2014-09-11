package com.jschua.thoughtworks.twu40;

/**
 * Created by chuajiesheng on 12/9/14.
 */
public class Diamond {

    public String printIsoTriangle(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(printSpace(n - i) + printAsterisk(i + i - 1) + "\n");
        }
        return sb.toString();
    }

    private String printAsterisk(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i  = 0; i < n; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

    private String printSpace(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public String printDiamond(int n) {
        StringBuilder sb = new StringBuilder();

        sb.append(printIsoTriangle(n));
        sb.append(printLowerDiamond(n));

        return sb.toString();
    }

    private String printLowerDiamond(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i > 0; i--) {
            sb.append(printSpace(n - i) + printAsterisk(i + i - 1) + "\n");
        }
        return sb.toString();
    }

    public String printNameDiamond(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(printUpperDiamond(n));
        sb.append("Jie Sheng\n");
        sb.append(printLowerDiamond(n));
        return sb.toString();
    }

    private String printUpperDiamond(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(printSpace(n - i) + printAsterisk(i + i - 1) + "\n");
        }
        return sb.toString();
    }
}
