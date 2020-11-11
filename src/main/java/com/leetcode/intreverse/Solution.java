package com.leetcode.intreverse;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int reverse(int x) {
        int tmp = x;
        int mod = 0;
        int result = 0;
        while (tmp != 0) {
            mod = tmp % 10;
            tmp = tmp / 10;
            if (x >= 0 && result > (Integer.MAX_VALUE - mod) / 10) {
                return 0;
            } else if (x < 0 && result < (Integer.MIN_VALUE - mod) / 10) {
                return 0;
            }
            result = result * 10 + mod;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int reverse = solution.reverse(-1230);
        System.out.println(reverse);
    }
}
