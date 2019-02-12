package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class SeriesAP {

    public static int nthTermOfAP(int first, int second, int nth) {

        int diff = second - first;

        return first + (nth - 1) * diff;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {

            String inputString = sc.nextLine();
            int first = Integer.parseInt(inputString.split(" ")[0]);
            int second = Integer.parseInt(inputString.split(" ")[1]);
            int nth = Integer.parseInt(sc.nextLine());

            System.out.println(nthTermOfAP(first, second, nth));

            testCases--;
        }
    }

}