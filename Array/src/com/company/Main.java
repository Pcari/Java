package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr2 = getIntegers(5);
        printArray(arr2);
        int[] sortedArr2 = sortIntegers1(arr2);
        System.out.println("sorting");
        printArray(sortedArr2);

        int arr3[] = new int[] {5, 4, 10, 3, 2, 8, 7, 1, 6};
        sort(arr3, 0, 8);
        printArray(arr3);

        /**
        int[] arr1 = getIntegers(5);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Element " + i + ", value is: " + arr1[i]);
        }

        System.out.println("Average of the array is " + getAverage(arr1));
         **/

    }

    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        //create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l+i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }
        //merge the temp arrays
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l+r)/2;

            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }

    }

    public static int[] sortIntegers1(int[] arr) {
        /*
        int[] sortedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i]; //copying the array
        }
        */
        //other way of copying
        int[] sortedArr = Arrays.copyOf(arr, arr.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0 ; i < sortedArr.length - 1; i++) {
                if (sortedArr[i] < sortedArr[i+1]) {
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] = temp;
                    flag = true;

                }

            }
        }
        return sortedArr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " contains " + arr[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / (double) arr.length;
    }
}
