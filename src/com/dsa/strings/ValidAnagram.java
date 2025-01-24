package com.dsa.strings;


public class ValidAnagram {

    public static void main(String[] args) {
        ValidAnagram duplicate = new ValidAnagram();

        System.out.println(duplicate.isAnagram("anagram", "nagaram"));
        System.out.println(duplicate.isAnagram("car", "rat"));
    }

    public boolean isAnagram(String s, String t) {
        int[] count_arr = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            count_arr[s.charAt(i) - 'a']++;
            count_arr[t.charAt(i) - 'a']--;
        }

        for (int j : count_arr) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
