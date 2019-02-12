package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class ArmstrongNumbers {

    public static boolean isArmstrong(int input) {

        boolean isArmstrong = false;
        int original = input;

        int cubeSum = 0;

        while (input > 0) {
            int n = input % 10;
            cubeSum = cubeSum + n * n * n;
            input = input / 10;
        }

        if (original == cubeSum) {
            isArmstrong = true;
        } else {
            isArmstrong = false;
        }

        return isArmstrong;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {

            int input = Integer.parseInt(sc.nextLine());

            System.out.println(isArmstrong(input));

            testCases--;
        }
    }

}
