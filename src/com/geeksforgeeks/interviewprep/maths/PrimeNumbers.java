package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            int number = Integer.parseInt(sc.nextLine());

            if (isPrime(number)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            testCases--;
        }

    }
}
