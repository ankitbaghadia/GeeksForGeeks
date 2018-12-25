package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class NPR {

    public static long factorial(long number) {

        if (number > 1) {
            return number * factorial(number - 1);
        } else {
            return 1;
        }
    }

    public static long nPr(long n, long r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            String input = sc.nextLine();

            int n = Integer.parseInt(input.split(" ")[0]);
            int r = Integer.parseInt(input.split(" ")[1]);

            System.out.println(nPr(n, r));

            testCases--;
        }

    }

}
