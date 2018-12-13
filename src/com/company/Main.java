package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
        reverseArray(a);
    }

    public static void reverseArray(double[] a) {
        int N = a.length;
        for (int i = 0; i < N / 2; i++) {
            double temp = a[i];
            a[i] = a[N - 1 - i];
            a[N - i - 1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
