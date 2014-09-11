package com.jschua.thoughtworks.twu40;

import java.util.ArrayList;

/**
 * Created by chuajiesheng on 12/9/14.
 */
public class PrimeFactor {
    public String factor(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && isPrime(i)) {
                list.add(i);
            }
        }
        return listToString(list);
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private String listToString(ArrayList<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
