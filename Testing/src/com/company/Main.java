package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
//
//        System.out.println(isUniqueChars("benja"));
//        System.out.println(isUniqueChars("benben"));
//        System.out.println(isPermutation("dog", "god"));
//        System.out.println(isPermutation("apple", "banana"));

        int[] arr = new int[] {2, 7, 11, 15};

//        int[] result = findSum(arr, 9);
//        System.out.println(Arrays.toString(result));

        System.out.println(findSum3(arr, 22));



    }
    static boolean findSum3(int[] arr, int target) {
        HashSet<Integer> map = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.contains(target - arr[i])) {
                return true;
            }
            map.add(arr[i]);
        }
        return false;
    }

    static int[] findSum2(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[] {map.get(target - arr[i]), i};
            }
            map.put(arr[i], i);
        }
        return new int[] {-1, -1};
    }

    static int[] findSum(int[] arr, int target) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }


    static boolean isUniqueChars(String str) {
        //string length exceeds the # of unique characters
        if (str.length() > 128) {
            return false;
        }
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);

            if (charSet[value]) { //already found char
                return false;
            }
            charSet[value] = true;
        }
        return true;
    }

    static String sort(String str) {
        char[] stringContent = str.toCharArray();
        java.util.Arrays.sort(stringContent);
        return new String(stringContent);
    }
    static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return sort(s1).equals(sort(s2));
    }
}
