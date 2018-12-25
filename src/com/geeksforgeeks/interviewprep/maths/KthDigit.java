package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class KthDigit {

    public static double kthDigit(int a, int b, int k) {

        double result = Math.pow(a, b);

        for (int i = 1; i <= k; i++) {
            if (i == k) {
                break;
            } else {
                result = result / 10;
            }
        }

        return result % 10;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {

            String inputs = sc.nextLine();
            String input[] = inputs.split(" ");

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int k = Integer.parseInt(input[2]);

            System.out.println((int) kthDigit(a, b, k));
            testCases--;
        }

    }
}
