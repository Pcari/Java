package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("initial page count = " + printer.getPagePrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " New total print count = " + printer.getPagePrinted());

//        String numberAsString = "2018";
//        System.out.println("numberAsString = " + numberAsString);
//
//        int number = Integer.parseInt(numberAsString);
//        System.out.println(number);
//
////        int switchValue = 1;
////
////        switch(switchValue) {
////            case 1:
////                System.out.println("Value was 1");
////                break;
////            case 2:
////                System.out.println("Value was 2");
////                break;
////            default:
////                System.out.println("Value was not 1 or 2");
////                break;
//
//        System.out.println(reverse(10));
//        System.out.println(getDigitCount(0));
//


	// write your code here
    }

//    public static void printDayOfTheWeek(int day) {
//        switch(day) {
//            case 0:
//                System.out.println("Sunday");
//                break;
//            case 1:
//                System.out.println(("Monday");
//                break;
//        }
//    }


    public static int reverse(int number) {

        int lastDigit = 0;
        int reverse = 0;
        int size = getDigitCount(number);
//        reverse = 10;
        while (number != 0) {
//        for (int i = 0; i < 3; i++) {
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;


            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
