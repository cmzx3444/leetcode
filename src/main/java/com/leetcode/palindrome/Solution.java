package com.leetcode.palindrome;

public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int tmp = x;
        int mod = 0;
        int result = 0;
        while (tmp != 0) {
            mod = tmp % 10;
            tmp = tmp / 10;
            if (x >= 0 && result > (Integer.MAX_VALUE - mod) / 10) {
                return false;
            } else if (x < 0 && result < (Integer.MIN_VALUE - mod) / 10) {
                return false;
            }
            result = result * 10 + mod;
        }
        return result == x;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean isPalindrome = solution.isPalindrome(1221);
        System.out.println(isPalindrome);
    }
}
