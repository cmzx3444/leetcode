package com.leetcode.romanToInt;

public class Solution {
    public int atoi(String s) {
        int result = 0;
        int n = 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (i == 0 && c == '-') {
                n = -1;
                continue;
            } else if (i == 0 && c == '+') {
                continue;
            }
            result = result * 10 + (c - '0');
        }
        return n * result;
    }

    public int romanToInt(String s) {
        int result = 0;
        int pre = getVal(s.charAt(0));
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            int v = getVal(chars[i]);
            if (pre < v) {
                result = result - pre;
            } else {
                result = result + pre;
            }
            pre = v;
        }
        return result + pre;
    }

    public int getVal(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = solution.romanToInt("XIV");
        System.out.println(num);
    }
}
