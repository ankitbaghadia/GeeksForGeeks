package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class GCDofTwoNumbers {
    public static int findGCD(int first, int second) {

        int gcd = 1, minimum;

        if (first < second) {
            minimum = first;
        } else {
            minimum = second;
        }

        for (int i = 2; i <= minimum; i++) {

            //This logic finds the common factor
            //No special logic is required to find out maximum factor (loop is incrementing)
            //GCD cannot be greater than the smaller number (which would be the greatest factor of that number)
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {

            String inputString = sc.nextLine();
            String inputStringArray[] = inputString.split(" ");

            System.out.println(findGCD(Integer.parseInt(inputStringArray[0]), Integer.parseInt(inputStringArray[1])));

            testCases--;
        }

    }


}
