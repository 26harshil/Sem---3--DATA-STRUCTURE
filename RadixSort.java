// Radix sort Java implementation

import java.io.*;
import java.util.*;

class Radix {

    public static void countingSort(int a[]) {

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        int[] demo = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            demo[a[i]]++;
        }

        for (int i = 1; i < demo.length; i++) {
            demo[i] += demo[i - 1];
        }

        int[] output = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            output[demo[a[i]] - 1] = a[i];
            demo[a[i]]--;
        }

        System.arraycopy(output, 0, a, 0, a.length);
    }

    public static void redix(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int m = max;
        for (int i = 1; m / i > 0; i *= 10) {
            countingSort(a);

        }

    }

    public static void main(String[] args) {
        int a[] = { 3, 6, 4, 1, 3, 4, 1, 4, 2 };
        redix(a);

        // Optional: Print the sorted array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

}