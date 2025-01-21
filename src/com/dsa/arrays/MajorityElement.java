package com.dsa.arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int elm = nums[0];
        int counter = 1;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==elm){
                counter++;
            }else{
                counter--;
                if(counter==0){
                    counter=1;
                    elm = nums[i];
                }
            }
        }
        return elm;
    }
    public static void main(String[] args){
        MajorityElement element = new MajorityElement();
        System.out.println(element.majorityElement(new int[]{1,2,2,1,2}));
    }
}
