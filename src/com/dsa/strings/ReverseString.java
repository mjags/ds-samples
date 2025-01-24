package com.dsa.strings;

public class ReverseString {

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseWords("the  sky is blue"));
    }

    public String reverseWords(String s) {
        String[] sa = s.trim().split("\\s+");
        int left = 0;
        int right = sa.length - 1;
        String a;
        while (left < right) {
            a = sa[left];
            sa[left] = sa[right];
            sa[right] = a;
            left++;
            right--;
        }
        return String.join(" ", sa);
    }
}
