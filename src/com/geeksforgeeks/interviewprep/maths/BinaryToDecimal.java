package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class BinaryToDecimal {
    public static long binaryToDecimal(long binary) {

        //Long has been taken here considering
        // the long length of a binary number
        long decimal = 0;

        int i = 0;
        while (binary > 0) {
            long n = binary % 2;
            decimal = decimal + n * (long) Math.pow(2, i);
            binary = binary / 10;
            i++;

            // Don't forget to increment i, that was the only mistake
            // Division and modulo by 10 is fine.
        }

        return decimal;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            long binary = Long.parseLong(sc.nextLine());

            System.out.println(binaryToDecimal(binary));

            testCases--;
        }

    }
}