package com.dsa.strings;

public class LengthOfLastWord {

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World"));
    }

    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean inWord = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c != ' ') {
                length++;
                inWord = true;
            } else if (inWord) {
                break;
            }
        }

        return length;
    }
}
