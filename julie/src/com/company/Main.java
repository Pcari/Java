package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Do you love me?");
        System.out.println("Choose from the following options:");
        System.out.println("IF YES type 1 IF NO type 2");

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();


            int answer = 0;
            switch (input) {
                case 1:
                    input = 1;
                    System.out.println("I LOVE YOU TOO");
                    break;
                case 2:
                    input = 2;
                    System.out.println("NO TRY AGAIN");
                    break;
            }
            // write your code here

    }
}
