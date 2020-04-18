package ru.victoria.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayPartialSortTest {

    @Test
    public void testFindMaxIdx(){
        int[] num1 = {1,2,3,4};
        int result = ArrayPartialSort.findMaxIdx(num1);

        Assert.assertEquals(result, 3);
    }
}
