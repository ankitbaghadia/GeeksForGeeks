package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class FactorialUnitDigit {

    public static int factorialUnitDigit(int number) {

        if (number == 0 || number == 1) {
            return 1;
        } else if (number == 2) {
            return 2;
        } else if (number == 3) {
            return 6;
        } else if (number == 4) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            int number = Integer.parseInt(sc.nextLine());
            System.out.println(factorialUnitDigit(number));

            testCases--;
        }

    }
}
