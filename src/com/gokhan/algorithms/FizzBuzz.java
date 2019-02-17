package com.gokhan.algorithms;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    // FizzBuzz
    // Details at https://leetcode.com/problems/two-sum

    public List<String> fizzBuzz(int n) {

        List list = new ArrayList<String>();

        for(int i = 1; i < n+1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add(String.valueOf(i));
            }
        }

        return list;
    }
}
