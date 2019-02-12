package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class SumOfDigitsPalindrome {

    public static int sumOfDigis(int input) {

        int sumOfDigits = 0;

        while (input > 0) {
            int n = input % 10;
            sumOfDigits = sumOfDigits + n;
            input = input / 10;
        }

        return sumOfDigits;
    }

    public static int reverseNumber(int input) {

        int reverse = 0;

        while (input > 0) {
            int n = input % 10;
            reverse = reverse * 10;
            reverse = reverse + n;
            input = input / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while(testCases > 0) {

            int input = Integer.parseInt(sc.nextLine());
            int sumOfDigits = sumOfDigis(input);

            if(reverseNumber(sumOfDigis(input)) == sumOfDigits){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            testCases--;
        }
    }
}