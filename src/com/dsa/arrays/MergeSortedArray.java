package com.dsa.arrays;

import java.util.Arrays;

/**
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * nums1 length = m+n
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */

public class MergeSortedArray {

    int[] sorted(int[] nums1, int m, int[] nums2, int n){
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.print(Arrays.toString(nums1));
        return nums1;
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.sorted(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }
}
