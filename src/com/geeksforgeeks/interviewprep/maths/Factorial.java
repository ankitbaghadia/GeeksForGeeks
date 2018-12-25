package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class Factorial {

    public static long factorialWithRecursion(int number) {

        long factorial = number;

        if (number >= 1) {
            return factorial * factorialWithRecursion(number - 1);
        } else {
            return 1;
        }

    }

    public static long factorial(int number) {

        /*These covers both the corners cases
         0! = 1
         1! = 1*
         Long value has been taken to considering the
         value of 18! (Given in test statement) */
        long factorial = 1;

        while (number > 1) {
            factorial = factorial * number;
            number--;
        }

        return factorial;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            int number = Integer.parseInt(sc.nextLine());

            System.out.println(factorialWithRecursion(number));

            testCases--;
        }
    }

}
