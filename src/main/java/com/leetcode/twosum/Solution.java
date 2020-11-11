package com.leetcode.twosum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i< nums.length;i++) {
            int num = nums[i];
            Integer found = map.get(target - num);
            if (found != null) {
                return new int[]{found, i};
            } else {
                map.put(num, i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] found = solution.twoSum(nums, target);
        for (int e : found) {
            System.out.println(e);
        }
    }
}
