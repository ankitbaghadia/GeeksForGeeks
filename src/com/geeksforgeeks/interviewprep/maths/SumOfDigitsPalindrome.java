package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class SumOfDigitsPalindrome {
    public static int reverseNumber(int number) {

        int reverse = 0;

        // Try an alternative logic
        // (change the order of statements within loop)
        // and see if why that doesn't work.
        while (number > 0) {
            int n = number % 10;
            reverse = reverse * 10 + n;
            number = number / 10;
        }

        return reverse;
    }

    public static int sumOfDigits(int number) {

        int sumOfDigits = 0;

        while (number > 0) {
            int n = number % 10;
            sumOfDigits = sumOfDigits + n;
            number = number / 10;
        }

        return sumOfDigits;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            int number = Integer.parseInt(sc.nextLine());
            int sumOfDigits = sumOfDigits(number);

            if (sumOfDigits == reverseNumber(sumOfDigits)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            testCases--;
        }

    }

}
