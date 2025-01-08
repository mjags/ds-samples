package com.dsa.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int p1=0;
        for(int i=0; i<nums.length; i++){
            if(p1==0 || nums[p1-1]!=nums[i]){
                nums[p1] = nums[i];
                p1++;
            }
            System.out.println(Arrays.toString(nums));
        }
        return p1;
    }

    public static void main(String[] args) {
        RemoveDuplicates duplicates = new RemoveDuplicates();
        System.out.print(duplicates.removeDuplicates(new int[]{1,1,2,3,3}));
    }
}
