package com.leetcode.longestCommonPrefix;

import java.util.LinkedHashMap;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        LinkedHashMap
        if (strs == null || strs.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        int len = strs[0].length();
        for (int i = 0; i < len; i++) {
            char same = 0;
            for (String s : strs) {
                if (s.length() <= i) {
                    return sb.toString();
                }
                char c = s.charAt(i);
                if (same == 0) {
                    same = c;
                } else if (same != c) {
                    return sb.toString();
                }
            }
            sb.append(same);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] str = {"abc", "ab", "abc", "abcef"};
        String longestCommonPrefix = solution.longestCommonPrefix(str);
        System.out.println(longestCommonPrefix);
    }
}
