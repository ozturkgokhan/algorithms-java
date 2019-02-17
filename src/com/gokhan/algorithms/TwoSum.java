package com.gokhan.algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // TwoSum
    // Details at https://leetcode.com/problems/two-sum

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int index = 0;
        for (int number: nums) {
            int diff = target - number;
            if (map.containsKey(diff) && map.get(diff) != index) {
                return new int[]{index, map.get(diff)};
            }
            index++;
        }

        throw new RuntimeException("Arguments are not provided to check equality");
    }
}