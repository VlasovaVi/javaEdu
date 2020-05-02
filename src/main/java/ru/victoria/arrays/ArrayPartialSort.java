package ru.victoria.arrays;

import java.util.Arrays;

public class ArrayPartialSort {
    public static void main(String[] args) {
        int[] nums = {10, 3000, 455, 11, -12, 48};
        printArray(nums);

        int minIdx = findMinIdx(nums);
        int temp = nums[minIdx];
        nums[minIdx] = nums[0];
        nums[0] = temp;

        System.out.println("\n*===========");
        printArray(nums);

    }

    /**
     * @param nums array of numbers
     * @return index of min element
     */
    public static int findMinIdx(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        int minIdx = 0;
        int minSecond = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[minIdx]) {
                minSecond = minIdx;
                minIdx = i;
            } else if (nums[i] < nums[minSecond]) {
                minSecond = i;
            }
        }
        return minSecond;
    }

    /// implement
    public static int findMaxIdx(int[] nums) {
        if (nums.length == 0){
            return -1;
        }
        int maxIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;

            }
        }return maxIdx;
    }



    public static int findMinSecondIdx(int[] nums) {
        return 0;
    }

    public static void printArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + "\t");
        }
    }
}
