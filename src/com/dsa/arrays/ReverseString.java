package com.dsa.arrays;

public class ReverseString {

    public String reverseWords(String s) {
        String[] sa = s.trim().split("\\s+");
        int left = 0;
        int right = sa.length - 1;
        String a = "";
        while (left < right) {
            a = sa[left];
            sa[left] = sa[right];
            sa[right] = a;
            left++;
            right--;
        }
        return String.join(" ", sa);
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseWords("the  sky is blue"));
    }
}
