package com.weijiew;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        String a = main.reverseVowels("hello");
        System.out.println(a);
    }

    public String reverseVowels(String s) {
        int i = 0 , j = s.length() - 1;
        char[] c = new char[j+1];
        while (i < j) {
            char a = s.charAt(i);
            char b = s.charAt(j);
            if (isVowel(a) && isVowel(b)) {
                c[i++] = b;
                c[j--] = a;
            }else if (!isVowel(a)) {
                c[i++] = a;
            }else if (!isVowel(b)) {
                c[j--] = b;
            }
        }
        return new String(c);
    }

    public boolean isVowel(char s) {
        if (s == 'a' || s == 'e' || s == 'o' || s == 'u'
        ||  s == 'A' || s == 'E' || s == 'O' || s == 'U') {
            return true;
        }
        return false;
    }
}
