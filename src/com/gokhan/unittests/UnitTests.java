package com.gokhan.unittests;

import com.gokhan.algorithms.FizzBuzz;

import java.util.Arrays;
import java.util.List;

import com.gokhan.algorithms.RobotReturnToOrigin;
import com.gokhan.algorithms.TwoSum;
import org.junit.Assert;
import org.junit.Test;


public class UnitTests {

    @Test
    public void fizzBuzzHappyPath() {
        FizzBuzz testIt = new FizzBuzz();

        List result = Arrays.asList("1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz",
                "16",
                "17",
                "Fizz");

        Assert.assertEquals(result, testIt.fizzBuzz(18));
    }

   @Test
    public void twoSumHappyPath() {
        int[] pass = new int[] {1, 4, 5, 7, 23};

        int[] result = new int[] {1,3};

        TwoSum testIt = new TwoSum();
        Assert.assertEquals(Arrays.toString(result), Arrays.toString(testIt.twoSum(pass , 11)));
    }

    @Test
    public void robotReturnToOriginHappyPath() {
        RobotReturnToOrigin testIt = new RobotReturnToOrigin();
        Assert.assertEquals(true,testIt.judgeCircle("UDLRRLDU") );
    }

}
