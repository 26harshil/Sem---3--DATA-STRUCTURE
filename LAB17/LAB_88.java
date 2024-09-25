// In an array of 20 elements, arrange 15 different values, which are generated
// randomly between 1,00,000 to 9,99,999. Use hash function to generate key and
// linear probing to avoid collision. H(x) = (x mod 18) + 2. Write a program to input
// and display the final values of array.

import java.util.Arrays;
import java.util.Scanner;

public class Lab_87 {

    public static int[] hashtable = new int[20];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter " + i);
            arr[i] = sc.nextInt();
        }

        store(arr);

        System.out.println(Arrays.toString(hashtable)    );

    }

    public static void store(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int index = hashing(arr[i]);

            hashtable[index] = arr[i];
        }
    }

    public static int hashing(int x) {

        int index = (x % 18) + 2;

        if (hashtable[index] != 0) {

            while (hashtable[index] != 0) {
                index = (++index % 20);

            }
        }
        return index;
    }

}
