package ru.victoria.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayPartialSortTest {

    @Test
    public void testFindMaxIdx1(){
        int[] num1 = {1,2,3,4};
        int result = ArrayPartialSort.findMaxIdx(num1);

        Assert.assertEquals(result, 3);
    }

    @Test
    public void testFindMaxIdx2(){
        int[] num1 = {3,52,1,5,8,12};
        int result = ArrayPartialSort.findMaxIdx(num1);

        Assert.assertEquals(result, 1);
    }

    @Test
    public void testFindMaxIdx3(){
        int[] num1 = {};
        int result = ArrayPartialSort.findMaxIdx(num1);

        Assert.assertEquals(result, -1);
    }

    @Test
    public void testFindMinSecondIdx() {
        int[] arg = {3,52,1,5,8,12};
        int result = ArrayPartialSort.findMinSecondIdx(arg);

        Assert.assertEquals(result, arg.length - 1);

        arg = new int[]{};
        result = ArrayPartialSort.findMinSecondIdx(arg);
        Assert.assertEquals(result, -1);


        arg = new int[]{1};
        result = ArrayPartialSort.findMinSecondIdx(arg);
        Assert.assertEquals(result, -1);
    }

}
