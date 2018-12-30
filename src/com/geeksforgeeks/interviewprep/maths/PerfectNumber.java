package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class PerfectNumber {


    public static int isPerfect(long number) {

        long sum = 1;

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum = sum + i + (number / i);
            }
        }

        if (number == sum) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            long number = Long.parseLong(sc.nextLine());
            System.out.println(isPerfect(number));

            testCases--;
        }

    }
}
