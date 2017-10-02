package com.codecool;

import java.util.Arrays;

public class PhraseReverse {
    public static String reverse(String x){
        return new StringBuilder(x).reverse().toString();
    }

    public static String[] reverse(String[] x){
        String[] rev = Arrays.copyOf(x, x.length);
        for(int i = x.length - 1; i >= 0; i--){
            rev[x.length - 1 - i] = x[i];
        }
        return rev;
    }

    public static String join(String[] arr, String joinStr){
        StringBuilder joined = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            joined.append(arr[i]);
            if(i < arr.length - 1) joined.append(joinStr);
        }
        return joined.toString();
    }

    public static void main(String[] args){
        String str = "this is one long sentence without punctuation";

        System.out.println("Straight-up reversed: " + reverse(str));
        String[] words = str.split(" ");
        for(int i = 0; i < words.length; i++){
            words[i] = reverse(words[i]);
        }
        System.out.println("Reversed words: " + join(words, " "));
        System.out.println("Reversed word order: " + join(reverse(str.split(" ")), " "));
    }
}
