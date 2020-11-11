package com.leetcode.uniqueOccurrences;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> tmp = new HashMap<>();
        HashSet<Integer> timesSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            Integer times = tmp.get(arr[i]);
            if (times == null) {
                tmp.put(arr[i], 1);
            } else {
                tmp.put(arr[i], times + 1);
            }
        }
        timesSet.addAll(tmp.values());
        if(timesSet.size() == tmp.values().size()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 2, 5, 1, 3};
        boolean found = solution.uniqueOccurrences(nums);
        System.out.println(found);
    }
}
