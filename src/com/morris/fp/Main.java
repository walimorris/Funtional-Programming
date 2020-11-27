package com.morris.fp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] A = {2, -1, 4, 16};
        printDoubled(A);
        printEnd();
        int[] B = {-1, 2, -4, 6, -9};
        int outB = sumAbsVals(B);
        System.out.println("Result: " + outB);
        printEnd();
        int[] C = {5, -1, 12, 10, 2, 8};
        int outC = largestEven(C);
        System.out.println("Result: " + outC);
        printEnd();
    }

    public static void printEnd() {
        System.out.println("END\n");
    }

    /**
     * Prints twice the value of each element of an array of integers.
     * @param arr An array of integers.
     * @author Wali Morris<walimmorris@gmail.com>
     */
    public static void printDoubled(int[] arr) {
        System.out.println("Doubled values: ");
        Arrays.stream(arr)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }

    /**
     * Computes the sum of the absolute values of an array of integers.
     * @param arr An array of integers.
     * @return int
     * @author Wali Morris<walimmorris@gmail.com>
     */
    public static int sumAbsVals(int[] arr) {
        return Arrays.stream(arr)
                .map(Math::abs)
                .sum();
    }

    public static int largestEven(int[] arr) {
        return Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .max()
                .getAsInt();
    }
}