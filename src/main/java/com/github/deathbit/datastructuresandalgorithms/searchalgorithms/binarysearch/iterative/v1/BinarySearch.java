package com.github.deathbit.datastructuresandalgorithms.searchalgorithms.binarysearch.iterative.v1;

public class BinarySearch {

    public static int binarySearch(int[] nums, int check) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int guess = (lo + hi) >>> 1;
            if (nums[guess] > check) {
                hi = guess - 1;
            } else if (nums[guess] < check) {
                lo = guess + 1;
            } else {
                return guess;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] haystack = {1, 5, 6, 7, 8, 11};
        int needle = 5;
        int index = binarySearch(haystack, needle);
        if (index == -1) {
            System.out.println(needle + " is not in the array");
        } else {
            System.out.println(needle + " is at index " + index);
        }
    }
}
