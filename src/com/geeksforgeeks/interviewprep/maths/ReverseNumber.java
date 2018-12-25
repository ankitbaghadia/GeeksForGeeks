package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class ReverseNumber {

    public static int reverseNumber(int number) {
        int reverse = 0;

        while (number > 0) {
            int n = number % 10;

            reverse = reverse * 10 + n;
            number = number / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            int number = Integer.parseInt(sc.nextLine());
            System.out.println(reverseNumber(number));
            testCases--;
        }

    }
}

