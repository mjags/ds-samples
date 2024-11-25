package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int[] count_arr = new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length();i++){
            count_arr[s.charAt(i)-'a']++;
            count_arr[t.charAt(i)-'a']--;
        }

        for(int i=0; i<count_arr.length;i++){
            if(count_arr[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        ValidAnagram duplicate = new ValidAnagram();
        int[] a = new int[10];
        a[0]=1;
        a[1]=2;
        System.out.println(a.length);

        List aLis = new ArrayList();

//        System.out.println(duplicate.isAnagram("anagram", "nagaram"));
//        System.out.println(duplicate.isAnagram("car", "rat"));
    }
}
