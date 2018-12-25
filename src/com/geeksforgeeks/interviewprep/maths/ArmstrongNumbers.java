package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static boolean isArmstrong(int number) {

        boolean isArmstrong = false;

        int cubeSum = 0;
        int originalNumber = number;

        while (number > 0) {
            int n = number % 10;
            cubeSum = cubeSum + n * n * n;
            number = number / 10;
        }

        if (originalNumber == cubeSum) {
            isArmstrong = true;
        }

        return isArmstrong;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {

            int number = Integer.parseInt(sc.nextLine());

            if (isArmstrong(number)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            testCases--;
        }

    }

}
