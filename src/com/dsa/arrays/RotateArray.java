package com.dsa.arrays;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] rotated = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rotated[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(rotated, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        RotateArray rs = new RotateArray();
        int[] arr = {1,2,3,0,0,0};
        System.out.println(Arrays.toString(arr));
        rs.rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
