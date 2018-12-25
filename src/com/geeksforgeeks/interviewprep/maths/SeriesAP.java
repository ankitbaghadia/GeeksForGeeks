package com.geeksforgeeks.interviewprep.maths;

import java.util.Scanner;

public class SeriesAP {


    public static int nthTermOfAP(int first, int second, int nth) {

        int d = second - first;

        return first + (nth - 1) * d;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases > 0) {
            String ap = sc.nextLine();
            int first = Integer.parseInt(ap.split(" ")[0]);
            int second = Integer.parseInt(ap.split(" ")[1]);
            int nth = Integer.parseInt(sc.nextLine());

            System.out.println(nthTermOfAP(first, second, nth));

            testCases--;
        }

    }

}
