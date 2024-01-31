package com.github.deathbit.datastructuresandalgorithms.searchalgorithms.binarysearch.iterative.v2;

/**
 * 搜索算法：二分查找法
 */
public class BinarySearch {
    public static int binarySearch(int[] nums, int check) {
        // 首先，设定下界和上界，以限定所查之值可能出现的区域。
        // 在开始时，以数组的第一个元素为下界，以最后一个元素为上界
        int lo = 0;
        int hi = nums.length - 1;
        // 循环检查上界和下界之间的最中间的元素
        while (lo <= hi) {
            // 如此找出最中间的格子之索引，使用>>>操作符来避免溢出
            int guess = (lo + hi) >>> 1;
            // 如果该值正是我们想查的，那就完事了。
            // 否则，看你是要往上找还是往下找，来调整下界或上界
            if (nums[guess] > check) {
                hi = guess - 1;
            } else if (nums[guess] < check) {
                lo = guess + 1;
            } else {
                return guess;
            }
        }

        // 当下界超越上界，便知数组里并没有我们所要找的值
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
