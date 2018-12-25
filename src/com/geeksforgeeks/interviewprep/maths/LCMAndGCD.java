package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class LCMAndGCD {

    public static int findGCD(int first, int second) {

        int minimum;

        if (first < second) {
            minimum = first;
        } else {
            minimum = second;
        }

        int gcd = 1;
        for (int i = 2; i <= minimum; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static int findLCM(int first, int second) {

        int i = 2, j = 2;
        int firstMultiply = first;
        int secondMultiply = second;

        while (firstMultiply != secondMultiply) {
            if (firstMultiply < secondMultiply) {
                firstMultiply = first * i;
                i++;
            } else {
                secondMultiply = second * j;
                j++;
            }

        }

        return firstMultiply;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            String input = sc.nextLine();

            int first = Integer.parseInt(input.split(" ")[0]);
            int second = Integer.parseInt(input.split(" ")[1]);

            System.out.println(findLCM(first, second) + " " + findGCD(first, second));

            testCases--;
        }

    }

}
